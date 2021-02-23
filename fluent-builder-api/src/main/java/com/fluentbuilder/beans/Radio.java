package com.fluentbuilder.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	@Value("${frequency}")
	private int frequency;

	public void listen() {
		System.out.println("listening at frequency :" + frequency);
	}
}
