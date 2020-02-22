package com.luban.services;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class X {
	public X() {
		System.out.println("x constructor");
	}

	@Bean
	public Y y() {
		return new Y();
	}
}
