package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

@Component
public class FactoryFileLogs implements FactoryLogs {

	@Override
	public void logs(String type) {
		{
	        System.out.println("File Logger: " + type);
	    }

	}
	
	public FactoryFileLogs() {
		{
	        System.out.println("File Logger: " );
	    }
	}

}
