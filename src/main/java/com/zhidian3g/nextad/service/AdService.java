package com.zhidian3g.nextad.service;

import com.zhidian3g.nextad.domain.Ad;

public interface AdService {
	
	/**
	 * 
	 * @param adId 获取广告的基本信息
	 * @return
	 */
	public Ad getAdById(Long adId);
	
	
			
}
