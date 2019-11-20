package com.coderscampus;

import java.util.Scanner;

public class getGuess {

	public int newGuess () {
		System.out.println("Pick a number between 1 and 100”");
	    Scanner guess = new Scanner(System.in);
	    int newGuess;
	    newGuess = guess.nextInt();
//	    guess.close();  I tried to close the scanner but got errors after it did the first input
	    return newGuess;
	    	}
}
