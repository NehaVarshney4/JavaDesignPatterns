package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

@Component
public class FactoryDatabaseLogs implements FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("Database Logger: " + type);
	    }

	}
	
	public FactoryDatabaseLogs() {
		{
	        System.out.println("database Logger: " );
	    }
	}

}
