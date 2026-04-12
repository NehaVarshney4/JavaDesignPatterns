package com.neha.designPatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neha.designPatterns.entity.BuilderRequest;
import com.neha.designPatterns.entity.BuilderResponse;
import com.neha.designPatterns.patterns.Creational_BuilderComputer;


@RestController
public class Creational_BuilderController{
	
	
	@GetMapping("/builder")
	public void getBuilder() {
		// Create a Computer object using the Builder
		Creational_BuilderComputer computer = new Creational_BuilderComputer.
				ComputerBuilder("500 GB", "8 GB")
				.setGraphicsCardEnabled(true)
				.setBluetoothEnabled(true)
				.build();

		// Print the specifications of the computer
		System.out.println("HDD: " +
				computer.getHDD()); // Output HDD: 500 GB

		System.out.println("RAM: " +
				computer.getRAM()); // Output: RAM: 8 GB

		System.out.println("Graphics Card Enabled: " +
				computer.isGraphicsCardEnabled()); // Output: Graphics Card Enabled: true

		System.out.println("Bluetooth Enabled: " +
				computer.isBluetoothEnabled()); // Output Bluetooth Enabled: true
		
	}
	
	
	
	@PostMapping("/computerBuilder")
	public BuilderResponse computerBuilder(@RequestBody BuilderRequest request) {
		// Create a Computer object using the Builder
//		Creational_BuilderComputer computer1 = new Creational_BuilderComputer.
//				ComputerBuilder("500", "8 GB")
//				.setGraphicsCardEnabled(true)
//				.setBluetoothEnabled(true)
//				.build();
		
		
		Creational_BuilderComputer computer = new Creational_BuilderComputer.
				ComputerBuilder(request.getHDD(), request.getRAM())
				.setGraphicsCardEnabled(request.isGraphicsCardEnabled())
				.setBluetoothEnabled(request.isBluetoothEnabled())
				.build();

		// Print the specifications of the computer
		System.out.println("HDD: " +
				computer.getHDD()); // Output HDD: 500 GB

		System.out.println("RAM: " +
				computer.getRAM()); // Output: RAM: 8 GB

		System.out.println("Graphics Card Enabled: " +
				computer.isGraphicsCardEnabled()); // Output: Graphics Card Enabled: true

		System.out.println("Bluetooth Enabled: " +
				computer.isBluetoothEnabled()); // Output Bluetooth Enabled: true
		
		return new BuilderResponse("787ttuy", "Success", "200");
		
	}
	
}