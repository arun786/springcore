package com.arun.main;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class CricketService implements MessageSourceAware {

	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void printMessage() {
		String message = messageSource.getMessage("cricketer.name", new Object[] { 20000, 45 }, Locale.US);
		System.out.println(message);

		String ukMessage = messageSource.getMessage("cricketer.name", new Object[] { 1000, 55 }, Locale.UK);
		System.out.println(ukMessage);
	}

}
