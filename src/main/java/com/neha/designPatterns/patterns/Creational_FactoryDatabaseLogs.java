package com.neha.designPatterns.patterns;

public class Creational_FactoryDatabaseLogs implements Creational_FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("Database Logger: " + type);
	    }

	}
	
	public Creational_FactoryDatabaseLogs() {
		{
	        System.out.println("database Logger: " );
	    }
	}

}
