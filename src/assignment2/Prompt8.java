package assignment2;

//Prompt 8: Write a program by using final keyword for a class, method, and variable

//This file contains a final class videogame which cannot be extended due to this final keyword. 
//Class videogame also contains a final string for its name and a final method for starting the game.
//There is also an example class which is commented out, and it basically shows that you cannot extend the videogame class.

public class Prompt8 {
	public static void main(String[] args) {
		videogame myGame = new videogame();
		myGame.start();
	}
}

final class videogame {
	final String name = "The game";
	
	final void start() {
		System.out.println("You have started the game!");
	}
}

//class videogamecopy extends videogame {
//	
//}
//The commented function does not work because videogame is final and cannot be extended