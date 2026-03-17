package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

@Component
public class Creational_FactoryConsoleLogs implements Creational_FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("Console Logger: " + type);
	    }

	}

	public Creational_FactoryConsoleLogs() {
		{
	        System.out.println("Console Logger: " );
	    }
	}

}
