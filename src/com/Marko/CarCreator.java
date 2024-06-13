package com.Marko;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Marko Orlando date 03/22/2024 Using inheritance to display data
 *         pertaining to the make and model of a car
 */

public class CarCreator {
	/**
	 * Main method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		SpecificCar c = new SpecificCar("Honda", "Civic");
		c.pressHorn();
		c.pressGas();

		System.out.println(c.getMake());
		System.out.println(c.getModel());
	}
}

/**
 * Parent class
 */
class Car {
	/**
	 * Instance variable
	 */
	private String make;

	/**
	 * Allows a user to specify the make of their car (Default Constructor)
	 * 
	 * @param make The make of the car
	 */
	public Car(String make) {
		this.make = make;
	}

	/**
	 * Displays a message that mimics the sound of a car horn every 2 seconds
	 */
	public void pressHorn() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Honk Honk.");
			}
		};
		timer.schedule(task, 0, 2000);
	}

	/**
	 * Displays a message that mimics the sound of a car speeding up
	 */
	public void pressGas() {
		System.out.println("Zoom zoom.");
	}

	/**
	 * Determines the make of the car
	 * 
	 * @return The make of the car
	 */
	public String getMake() {
		return this.make;
	}

}

// The SpecificCar class inherits the Car class

/**
 * Child class
 */
class SpecificCar extends Car {
	
	/**
	 * Instance variable
	 */
	private String model;

	/**
	 * Creates a an object car
	 * 
	 * @param make  The make of the car, extended from class Car
	 * @param model The model of the car
	 */
	public SpecificCar(String make, String model) {
		super(make);
		this.model = model;
	}

	@Override
	/**
	 * Displays a message that mimics the sound of a car horn every 2 seconds
	 */
	public void pressHorn() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println("Beep beep.");
			}
		};
		timer.schedule(task, 0, 2000);
	}

	/**
	 * Determines the make of the car
	 * 
	 * @return The make of the car
	 */
	public String getModel() {
		return this.model;
	}

}