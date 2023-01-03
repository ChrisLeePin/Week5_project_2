package com.accenture;

public class Umpire {
	/*	
	public void collectNumberFromGuesser() {
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNum();
		
	}

	public void collectNumberFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numberFromPlayer1=p1.guessNum();
		numberFromPlayer2=p2.guessNum();
		numberFromPlayer3=p3.guessNum();
		
	}
*/
	
	public boolean compare(int numberFromGuesser,int numberFromPlayer) {
		boolean value;
		System.out.println("Number guessed by guesser: "+numberFromGuesser);
		if(numberFromGuesser==numberFromPlayer) {
			value = true;
		}
		/*		
		else if(numberFromGuesser==numberFromPlayer1 && numberFromGuesser==numberFromPlayer2) {
			System.out.println("Player 1 and 2 has won the game");
		}

		else if(numberFromGuesser==numberFromPlayer1 && numberFromGuesser==numberFromPlayer3) {
			System.out.println("Player 1 and 3 has won the game");
		}
		else if(numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3) {
			System.out.println("Player 2 and 3 has won the game");
		}
		else if(numberFromGuesser==numberFromPlayer1) {
			System.out.println("Player 1 has won the game");
		}
		else if(numberFromGuesser==numberFromPlayer2) {
			System.out.println("Player 2 has won the game");
		}
		else if(numberFromGuesser==numberFromPlayer3) {
			System.out.println("Player 3 has won the game");
		}
		*/
		else {
			value = false;
		}
		return value;
	}

}
