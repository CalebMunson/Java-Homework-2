package assignment2;

//Prompt 6: Write an interface and implementation class for it

//This file contains an interface skateboard and a class longboard which implements it and its methods

public class Prompt6 {
	public static void main(String[] args) {
		longboard myBoard = new longboard();
		myBoard.speedUp();
		myBoard.ride();
	}
}

interface skateboard {
	public void ride();
	public void speedUp();
}

class longboard implements skateboard {
	public void ride() {
		System.out.println("You ride the longboard.");
	}
	
	public void speedUp() {
		System.out.println("You tap your foot on the ground to increase momentum.");
	}
}