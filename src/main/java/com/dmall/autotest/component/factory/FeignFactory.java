package com.dmall.autotest.component.factory;

import feign.Feign;
import feign.Feign.Builder;
import feign.Request.Options;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public class FeignFactory {
	
	private static Builder httpService = null;
	
	static{
		httpService = Feign.builder().options(new Options(1000, 3500))
				.encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
	    .retryer(new Retryer.Default(5000, 5000, 3));
	}
    

	private FeignFactory() {
		
	}
	
	public static <T> T getService(Class<T> serviceClass,String serviceUrl) {
		return httpService.target(serviceClass, serviceUrl);
	}
	
}
