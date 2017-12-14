package com.zzm.test.service;

import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello2(String name) {
		return "hello" +name+", this messge send failed ";
	}

}
