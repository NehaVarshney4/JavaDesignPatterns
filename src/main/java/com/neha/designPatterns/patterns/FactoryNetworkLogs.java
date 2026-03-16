package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

@Component
public class FactoryNetworkLogs implements FactoryLogs {

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
