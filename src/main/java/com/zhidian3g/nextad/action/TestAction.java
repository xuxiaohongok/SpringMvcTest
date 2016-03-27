package com.zhidian3g.nextad.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;

/**
 * @author Administrator
 *
 */
@Controller
public class TestAction {
	
	private Logger logger = LoggerFactory.getLogger("es-access");
	/**
	 * @param requestData
	 * @return
	 * @throws IOException 
	 */
	@ResponseBody
	@RequestMapping(value = "/test", produces = "text/plain;charset=UTF-8")
	public String adClick(HttpServletRequest rq, String jsonData) throws Exception{
		Map<String, Object> map = null;
		try {
			logger.info("=============uuId=================" + jsonData);
			map = new HashMap<String, Object>();
			map.put("jsonData", jsonData);
			map.put("jsonData1", "jsonData1jsojsonData9jsonData9jsonData9nData1jsonData1");
			map.put("jsonData4", "jsonData1jsojsonData9jsonData9jsonData9nData1jsonData1");
			map.put("jsonData5", "jsonData1jsojsonData9jsonData9jsonData9nData1jsonData1");
			map.put("jsonData6", "jsonData1jsojsonData9jsonData9jsonData9nData1jsonData1");
			map.put("jsonData7", "jsonData1jsojsonData9jsonData9jsonData9nData1jsonData1");
			map.put("jsonData2", "jsonData2jsonData2jjsonData9jsonData9sonData2jsonData2jsonData2");
			map.put("jsonData3", "jsonData3jsonData3jsojsonData9jsonData9jsonData9jsonData9nData3jsonData3");
			map.put("jsonData9", "jsonData9jsonData9jsonData9jsonData9jsonData9jsonData9jsonData9jsonData9jsonData9jsonData9");
			Thread.sleep(15);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSONUtils.toJSONString(map);
	}
	
}

