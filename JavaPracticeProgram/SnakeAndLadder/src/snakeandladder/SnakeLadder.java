package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		int startPosition = 0;
		System.out.println("Game start and Player is at Position " +startPosition);
		int dice = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The Number on dice is " + dice);
		System.out.println("Welcome to Snake and Ladder Game");
		int option = (int) Math.floor(Math.random() * 3);
	    final int LADDER = 1;
		final int SNAKE = 2;
		int playerPresentStep = 10;
		System.out.println("Present You are on Step:" + playerPresentStep);
		System.out.println("If you get option as 0 it is noPlay,1 it is ladder,2 it is snake " );
		if(option == LADDER)
		{
			playerPresentStep += dice;
			System.out.println("Player Moves on :" + playerPresentStep);
		}
		else if(option == SNAKE)
		{
				playerPresentStep-= dice;
				System.out.println("Player Moves on  : " + playerPresentStep);
		}
		else 
			{
				System.out.println("Player Moves on :" + playerPresentStep);
			}
		System.out.println("player got option:" + option);
	}

}
