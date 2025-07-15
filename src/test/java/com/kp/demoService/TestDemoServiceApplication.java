package com.kp.demoService;

import org.springframework.boot.SpringApplication;

public class TestDemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
