package com.accenture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.accenture")
public class BeanConfig {

	@Bean
	public Guesser guesser() {
		return new Guesser();
	}
	@Bean
	@Scope("prototype")
	public Player player() {
		return new Player();
	}
	@Bean
	public Umpire umpire() {
		return new Umpire();
	}
}
