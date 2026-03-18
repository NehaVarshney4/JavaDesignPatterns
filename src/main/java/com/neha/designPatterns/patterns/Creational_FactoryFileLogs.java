package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

public class Creational_FactoryFileLogs implements Creational_FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("File Logger: " + type);
	    }

	}
	
	public Creational_FactoryFileLogs() {
		{
	        System.out.println("File Logger: " );
	    }
	}

}
