package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Starting of Snake and Ladder Game");
	    int playerPresentStep = 0;
		System.out.println("Starting the Game and You Are On step:" +playerPresentStep);
		//int noPlay = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		while(playerPresentStep <= 100)
		{
		int dice = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice is " + dice);
		int option = (int) Math.floor(Math.random() * 3);	
		System.out.println("If you get option as 0 it is noPlay,1 it is ladder,2 it is snake " );
		System.out.println("Player got option:" + option);
		if(option == LADDER)
		{
			playerPresentStep += dice;
			
			System.out.println("Player are on step:" + playerPresentStep );
			if(playerPresentStep == 100) {
			   System.out.println("player Win the Game");
			}
		}
			else if(option == SNAKE)
			{
				playerPresentStep -= dice;
				if(playerPresentStep< 0)
					playerPresentStep = 0;
				System.out.println("Player are on step : " + playerPresentStep);
				
			}
			else 
			{
				System.out.println("Player are on step :" + playerPresentStep);
			}
		}
	}
		
	}	