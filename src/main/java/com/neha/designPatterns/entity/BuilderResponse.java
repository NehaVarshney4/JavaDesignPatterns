package com.neha.designPatterns.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuilderResponse {
	
	public String responseMessage;
	public String computerId;
	public String responseId;
	
	public String getComputerId() {
		return computerId;
	}
	public void setComputerId(String computerId) {
		this.computerId = computerId;
	}
	public BuilderResponse(String requestMessage, String computerId, String responseId) {
		this.responseMessage = requestMessage;
		this.computerId = computerId;
		this.responseId = responseId;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
}
