package com.example.backend;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author RamMohan
 * 
 * It just initialize the application context once for all the methods.
 * Same application context is reused to execute the all the test methods.
 *
 */
@SpringBootTest
class SmokeTests {

	@Autowired
	private PersonController controller;
	@Autowired
	private GreetingService service;
	
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
		assertThat(service).isNotNull();
	}

}
