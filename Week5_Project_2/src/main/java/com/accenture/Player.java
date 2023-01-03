package com.accenture;

import java.util.Scanner;

public class Player {
	int pnum;
	
	public void guessNum() {
		System.out.println("Player , kindly guess a number between 1-10");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
	}
}
