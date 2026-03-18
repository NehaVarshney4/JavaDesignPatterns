package com.neha.designPatterns.patterns;

public class Creational_FactoryNetworkLogs implements Creational_FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("Network Logger: " + type);
	    }

	}

	public void FactoryFileLogs() {
		System.out.println("Network Logger");
	}
}
