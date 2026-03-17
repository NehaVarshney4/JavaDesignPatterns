package com.neha.designPatterns.patterns;

public class Creational_FactoryLoggerfactory {

	public static Creational_FactoryLogs getLogger(String type) {
		return switch (type) {
			case "console" -> new Creational_FactoryConsoleLogs();
			case "file" -> new Creational_FactoryFileLogs();
			case "database" -> new Creational_FactoryDatabaseLogs();
			case "network" -> new Creational_FactoryNetworkLogs();
			default -> throw new IllegalArgumentException("Unknown logger type");
		};
	}

}
