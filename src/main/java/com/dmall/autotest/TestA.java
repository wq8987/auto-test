package com.dmall.autotest;

import org.testng.annotations.Test;

import com.dmall.autotest.component.factory.FeignFactory;
import com.dmall.autotest.component.scheduling.SchedulingComponent;

public class TestA {

	@Test
	public void test() {
		SchedulingComponent service = FeignFactory.getService(SchedulingComponent.class, "http://testschedulemanage.dmall.com/");
//		service.save(request, headMap);
	}
}
