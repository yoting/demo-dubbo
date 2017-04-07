package com.gusi.demo.dubbo.share.request;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class DemoRequest implements Serializable {
	@NotNull
	private String req1;
	@Min(2)
	private int req2;

	public String getReq1() {
		return req1;
	}

	public void setReq1(String req1) {
		this.req1 = req1;
	}

	public int getReq2() {
		return req2;
	}

	public void setReq2(int req2) {
		this.req2 = req2;
	}

}
