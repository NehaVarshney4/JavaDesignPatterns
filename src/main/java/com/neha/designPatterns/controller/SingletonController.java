package com.neha.designPatterns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neha.designPatterns.patterns.Singleton;

@RestController
public class SingletonController {
	
	@GetMapping("/singleton")
    public String getSingleton() {
		// Get the only object available (first call will create the instance)
        Singleton singleton1 = Singleton.getInstance(); // Output: Creating first instance, Singleton instance created

        // Get the instance again (will not create a new instance)
        Singleton singleton2 = Singleton.getInstance(); // Output: Fetching instance

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2)); // Output: Are both instances the same? true
        System.out.println("This is a singleton1 instance: " + singleton1.toString());
        System.out.println("This is a singleton2 instance: " + singleton2.toString());
        return "Hello";
    }

}
