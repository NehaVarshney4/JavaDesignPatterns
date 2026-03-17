package com.neha.designPatterns.patterns;

import org.springframework.stereotype.Component;

@Component
public class Creational_Singleton {
	private static volatile Creational_Singleton instance = new Creational_Singleton(); //Eager Initialization - Creates the instance while calss is loaded on JVM 
														 //this causes resource allocation which might not be useful.
														 //Use Eager initialization only for instances which are definetely needed for application

	// Static variable to hold the single instance of the class
    // Using 'volatile' to ensure visibility of changes to 'instance' across threads
    //private static volatile Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Creational_Singleton() {
        // Guard clause to prevent reflection-based instantiation
//        if (instance != null) {
//            throw new RuntimeException("Use getInstance() method to create");
//        }
        System.out.println("Singleton constructor called!!");
    }
    
    // Method to maintain singleton property during deserialization
    protected Object readResolve() {
        return getInstance();
    }
    
    // Prevent cloning of the singleton instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton, cannot be cloned");
    }

    // Static method to get the single instance of the class
    public static Creational_Singleton getInstance() {
        // First check for existing instance without synchronization for performance
        if (instance == null) {
            // Synchronize on the class to ensure thread safety during instantiation
            synchronized (Creational_Singleton.class) {
                // Double-checked locking to avoid unnecessary synchronization
                if (instance == null) {
                    System.out.println("Creating first instance");
                    instance = new Creational_Singleton();
                }
            }
        }
        System.out.println("Fetching instance");
        return instance;
    }
}

