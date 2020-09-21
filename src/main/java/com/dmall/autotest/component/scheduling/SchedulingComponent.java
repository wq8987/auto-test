package com.dmall.autotest.component.scheduling;

import java.util.Map;

import feign.HeaderMap;
import feign.QueryMap;
import feign.RequestLine;

public interface SchedulingComponent {
	@RequestLine("POST /rebuild/scheduleDetail/save")
	Map<String,String> save(SchedulingRequest request,@HeaderMap Map<String,String> headMap);
	@RequestLine("GET aiSchedule/query")
	Map<String,Object> query(@QueryMap Map<String,String> queryMap,@HeaderMap Map<String,String> headMap);
}
