package com.zhidian3g.nextad.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhidian3g.common.utils.CryptUtils;
import com.zhidian3g.nextad.service.AdService;

/**
 * @author Administrator
 *
 */
@Controller
public class TestAction {
	
	@Resource
	private AdService adService;
	
	/**
	 * @param requestData
	 * @return
	 * @throws IOException 
	 */
	@ResponseBody
	@RequestMapping(value = "/test.shtml", produces = "text/plain;charset=UTF-8")
	public String adClick(HttpServletRequest rq, String jsonData) throws Exception{
		System.out.println("=============uuId=================" + jsonData);
		return "ok";
	}
	
	/**
	 * @param requestData
	 * @return
	 * @throws IOException 
	 */
	@ResponseBody
	@RequestMapping(value = "/test1.shtml", produces = "text/plain;charset=UTF-8")
	public String adClick1(HttpServletRequest rq, @RequestBody byte[]bytes) throws Exception{
		System.out.println("=============uuId=================");
		if(bytes != null && bytes.length != 0 ) {
			String postStr=new String(bytes, "UTF-8");
			String postStr1=new String(bytes);
			System.out.println(URLDecoder.decode(postStr, "UTF-8"));
			System.out.println(postStr1);
			String ok = CryptUtils.decrypt(postStr, "zhidian@nextad");
			System.out.println("ok=" + ok);
		} else {
			System.out.println("bytes=" + bytes);
		}
		return "ok";
	}
	
	
}

