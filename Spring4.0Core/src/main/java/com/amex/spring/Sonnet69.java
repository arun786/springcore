package com.amex.spring;

import org.springframework.stereotype.Component;

@Component
public class Sonnet69 implements Poem{

	public void recite() {
		System.out.println("Recite a sonnet...");
	}

}
