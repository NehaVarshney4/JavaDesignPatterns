package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

@Component
public class FactoryConsoleLogs implements FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("Console Logger: " + type);
	    }

	}

	public FactoryConsoleLogs() {
		{
	        System.out.println("Console Logger: " );
	    }
	}

}
