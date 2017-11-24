package com.wanghuan.service;

public interface ProgressService {

	/**
	 * 生成txt文本
	 * 
	 * @param count
	 */
	void createTxt(long count);

	/**
	 * 得到进度
	 */
	String getPercent();

	/**
	 * 删除redis中的缓存
	 */
	void delPercentInRedis();

}
