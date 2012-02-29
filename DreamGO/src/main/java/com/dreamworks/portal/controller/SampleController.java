package com.dreamworks.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@RequestMapping(value = "hello.do")
	public String hello(
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("hello world :" + name);
		return "index";
	}
}
