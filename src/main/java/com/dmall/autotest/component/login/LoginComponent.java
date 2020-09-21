package com.dmall.autotest.component.login;

import feign.Param;
import feign.RequestLine;

public interface LoginComponent {
	@RequestLine("GET /users/list?name={name}")
	String login(@Param(value = "name") String name);
}
