package com.neha.designPatterns.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Creational_FactoryLogsRequest {
	
	public String logs;

	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}

}
