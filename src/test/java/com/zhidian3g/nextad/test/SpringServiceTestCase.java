package com.zhidian3g.nextad.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhidian3g.common.utils.JsonUtil;
import com.zhidian3g.nextad.service.AdService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application-context.xml"})
public class SpringServiceTestCase extends AbstractJUnit4SpringContextTests {
	protected Logger logger = LoggerFactory.getLogger("test");
	@Resource
	private AdService adService;
	
	@Test
	public void testDataBase() {
//		System.out.println(adService.getAdById(3l));
		logger.info(JsonUtil.bean2Json(adService.getAdById(3l))); 
		logger.debug(JsonUtil.bean2Json(adService.getAdById(3l))); 
		logger.warn(JsonUtil.bean2Json(adService.getAdById(3l))); 
	}
	
}
