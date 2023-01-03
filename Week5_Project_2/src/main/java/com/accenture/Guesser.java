package com.accenture;

import java.util.Random;

public class Guesser {
	int gnum;
	
	public void guessNum() {
	    Random rand = new Random(); //instance of random class
		gnum = rand.nextInt(10); 

	}
}
