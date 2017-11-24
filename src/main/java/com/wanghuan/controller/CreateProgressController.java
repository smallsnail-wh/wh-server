package com.wanghuan.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wanghuan.service.ProgressService;

@RestController
public class CreateProgressController {

	Logger log = LoggerFactory.getLogger(CreateProgressController.class);

	@Resource(name = "progressService")
	private ProgressService progressService;

	/**
	 * 生成txt请求
	 * 
	 * @param reqMap
	 * @return
	 */
	@PostMapping(value = "/progress")
	public String create(@RequestBody Map<String, Object> reqMap) {
		log.info(reqMap.toString());
		progressService.createTxt(Long.parseLong((String) reqMap.get("count")));
		return "SUCCESS";
	}

	/**
	 * 得到进度请求
	 * 
	 * @return
	 */
	@GetMapping(value = "/progress")
	public String getPercent() {
		return progressService.getPercent();
	}

	/**
	 * 删除redis中数据请求
	 * 
	 * @return
	 */
	@DeleteMapping(value = "/progress")
	public void delPercentInRedis() {
		log.info("删除成功！");
		progressService.delPercentInRedis();
	}
}
