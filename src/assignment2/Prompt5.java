package assignment2;

//Prompt 5: Write an abstract class and implement abstract methods in subclass

//This file has an abstract class scooter which is extended by the razor class, and its methods are implemented in the razor class

public class Prompt5 {
	public static void main(String[] args) {
		scooter myRazor = new razor();
		myRazor.ride();
		myRazor.stop();
	}
}

abstract class scooter {
	abstract void ride();
	abstract void stop();
}

class razor extends scooter {
	void ride() {
		System.out.println("You ride a razor scooter down the sidewalk");
	}
	
	void stop() {
		System.out.println("You put your foot on the back wheel and slow down to a stop");
	}
 	
}