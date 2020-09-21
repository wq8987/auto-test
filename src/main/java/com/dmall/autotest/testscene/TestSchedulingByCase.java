package com.dmall.autotest.testscene;

import java.util.Map;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;
import com.dmall.autotest.component.factory.FeignFactory;
import com.dmall.autotest.component.scheduling.SchedulingComponent;
import com.dmall.autotest.component.scheduling.SchedulingRequest;
import com.dmall.autotest.testcase.TestCase;

public class TestSchedulingByCase {

	@Test(dataProvider = "caseData",dataProviderClass =TestCase.class ,groups = {"TestA"})
	public void test1(SchedulingRequest req, Map<String, String> headMap) {
		SchedulingComponent service = FeignFactory.getService(SchedulingComponent.class,
				"http://testschedulemanage.dmall.com/");
		System.out.println(JSON.toJSONString(service.save(req, headMap)));
	}

	@Test(dataProvider = "caseData",dataProviderClass =TestCase.class,groups = {"TestA","TestB"})
	public void test2(Map<String, String> req, Map<String, String> headMap) {
		SchedulingComponent service = FeignFactory.getService(SchedulingComponent.class,
				"http://testschedulemanage.dmall.com/");
		System.out.println(JSON.toJSONString(service.query(req, headMap)));
	}
	
	@Test(dataProvider = "caseData",dataProviderClass =TestCase.class,groups = {"TestB"})
	public void test3(Map<String, String> req, Map<String, String> headMap) {
		SchedulingComponent service = FeignFactory.getService(SchedulingComponent.class,
				"http://testschedulemanage.dmall.com/");
		System.out.println(JSON.toJSONString(service.query(req, headMap)));
	}

}
