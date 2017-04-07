package com.gusi.demo.dubbo.share;

import javax.validation.constraints.NotNull;

import com.gusi.demo.dubbo.share.request.DemoRequest;

public interface DemoService {
	public String demoMethod0();

	public String demoMethod1(@NotNull String param);

	public String demoMethod2(@NotNull DemoRequest request);
}
