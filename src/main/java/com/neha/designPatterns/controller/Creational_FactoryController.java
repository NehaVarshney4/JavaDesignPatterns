package com.neha.designPatterns.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neha.designPatterns.entity.Creational_FactoryLogsRequest;
import com.neha.designPatterns.patterns.Creational_FactoryConsoleLogs;
import com.neha.designPatterns.patterns.Creational_FactoryDatabaseLogs;
import com.neha.designPatterns.patterns.Creational_FactoryFileLogs;
import com.neha.designPatterns.patterns.Creational_FactoryLoggerfactory;
import com.neha.designPatterns.patterns.Creational_FactoryLogs;

@RestController
public class Creational_FactoryController {

	@GetMapping("/factoryLogs")
	public String factoryLogs(@RequestParam(value = "type") String type) {

		Creational_FactoryLogs factoryLogs = Creational_FactoryLoggerfactory.getLogger(type);
		
		factoryLogs.logs("This is a " + type + " log message.");
		return type;
	}

	@PostMapping(path = "/factoryLogs", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
	public String factoryLogsPost(@RequestBody Creational_FactoryLogsRequest request) {
		 // The entire request body is bound to the 'requestBody' String parameter
        System.out.println("Received message: " + request);
        System.out.println("Received message: " + request.getLogs());
		Creational_FactoryLogs factoryLogs = Creational_FactoryLoggerfactory.getLogger(request.getLogs());
		//System.out.println(type);
		factoryLogs.logs("This is a " + request.getLogs() + " log message.");

		return request.getLogs();
	}

}
