package com.neha.designPatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neha.designPatterns.patterns.Creational_Singleton;

@RestController
public class Creational_SingletonController {
	
	@GetMapping("/singleton")
    public String getSingleton() {
		// Get the only object available (first call will create the instance)
        Creational_Singleton singleton1 = Creational_Singleton.getInstance(); // Output: Creating first instance, Singleton instance created

        // Get the instance again (will not create a new instance)
        Creational_Singleton singleton2 = Creational_Singleton.getInstance(); // Output: Fetching instance

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2)); // Output: Are both instances the same? true
        System.out.println("This is a singleton1 instance: " + singleton1.toString());
        System.out.println("This is a singleton2 instance: " + singleton2.toString());
        return "Hello";
    }

}
