package com.gusi.demo.dubbo.provider;

import com.gusi.demo.dubbo.share.DemoService;
import com.gusi.demo.dubbo.share.request.DemoRequest;

public class DemoServiceImpl implements DemoService {

	public String demoMethod0() {
		return "hello world";
	}

	public String demoMethod1(String param) {
		return "hello" + param;
	}

	public String demoMethod2(DemoRequest request) {
		return request.toString();
	}

}
