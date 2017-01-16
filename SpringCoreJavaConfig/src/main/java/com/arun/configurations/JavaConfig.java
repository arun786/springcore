package com.arun.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arun.SpringIdol.Juggler;
import com.arun.SpringIdol.Performer;
import com.arun.SpringIdol.Poem;
import com.arun.SpringIdol.Sonnet69;

@Configuration
public class JavaConfig {

	@Bean(name="duke")
	public Performer perform() {
		return new Juggler("3");
	}
	
	@Bean
	public Poem sing(){
		return new Sonnet69();
	}
	
	@Bean(name="tom")
	public Performer performs(){
		return new Juggler("3", sing());
				
	}

}
