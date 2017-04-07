package com.gusi.demo.dubbo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gusi.demo.dubbo.share.DemoService;
import com.gusi.demo.dubbo.share.request.DemoRequest;

@Service
public class DemoBusiness {

	@Autowired
	private DemoService demoService;

	public void business0() {
		String result1 = demoService.demoMethod0();

		String result2 = demoService.demoMethod1("dubbo");

		DemoRequest request = new DemoRequest();
		request.setReq1("world");
		request.setReq2(9);
		String result3 = demoService.demoMethod2(request);
		System.out.println(result1 + "*" + result2 + "*" + result3);
	}

	public void business1() {
		String result = demoService.demoMethod1(null);
		System.out.println(result);
	}

	public void business2() {
		String result = demoService.demoMethod2(null);
		System.out.println(result);
	}

	public void business3() {
		String result = demoService.demoMethod2(new DemoRequest());
		System.out.println(result);
	}
}
