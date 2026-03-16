package com.neha.designPatterns.patterns;

public class FactoryLoggerfactory {

	public static FactoryLogs getLogger(String type) {
		return switch (type) {
			case "console" -> new FactoryConsoleLogs();
			case "file" -> new FactoryFileLogs();
			case "database" -> new FactoryDatabaseLogs();
			case "network" -> new FactoryNetworkLogs();
			default -> throw new IllegalArgumentException("Unknown logger type");
		};
	}

}
