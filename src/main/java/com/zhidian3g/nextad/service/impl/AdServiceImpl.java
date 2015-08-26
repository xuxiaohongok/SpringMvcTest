package com.zhidian3g.nextad.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhidian3g.common.repository.BaseRepository;
import com.zhidian3g.nextad.domain.Ad;
import com.zhidian3g.nextad.service.AdService;

@Service
public class AdServiceImpl implements AdService {
	@Resource
	private BaseRepository baseRepository;

	@Override
	public Ad getAdById(Long adId) {
		return baseRepository.findById(Ad.class, adId);
	}

}
