package com.wanghuan.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.wanghuan.dao.ProgressDao;
import com.wanghuan.service.ProgressService;

@Service("progressService")
public class ProgressServiceImpl implements ProgressService {

	Logger log = LoggerFactory.getLogger(ProgressServiceImpl.class);

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	ProgressDao progressDao;

	@Override
	public void createTxt(long count) {
		new Thread() {
			public void run() {
				try {
					Thread.sleep(500);
					long startCount = 1;
					long endCount = count;
					long pcount = count / 100;
					File file = new File("target/classes/static/temp/progress.txt");
					String path = file.getAbsolutePath();
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);

					/* 计数变量 */
					long currentCount = 0;
					String percent = "0";
					String percentCopy = "0";
					for (; startCount <= endCount; startCount++) {
						currentCount++;
						percentCopy = percent;
						if (count < 10000) {
							percent = String.valueOf((currentCount * 100 / count));
						} else {
							percent = String.valueOf((currentCount / (pcount)));
						}
						if ("100".equals(percent) && currentCount != count) {
							percent = "99";
						}
						if (!percentCopy.equals(percent)) {
							System.out.println(percent);
							ValueOperations<String, String> value = stringRedisTemplate.opsForValue();
							value.set("percent", percent);
						}
						String s;
						s = "WH" + currentCount;
						// 写入txt文件
						bw.append(s + "\r\n");
					}
					bw.flush();
					bw.close();
					log.info("txt文件名" + "progress.txt");
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}.start();
	}

	@Override
	public String getPercent() {
		String progress = "0";
		ValueOperations<String, String> value = stringRedisTemplate.opsForValue();
		progress = value.get("percent");
		return progress;
	}

	@Override
	public void delPercentInRedis() {
		stringRedisTemplate.delete("percent");
	}
}
