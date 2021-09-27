package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Starting of Snake and Ladder Game");
	    final int NoPlay = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		//variables
		int dice = (int)((Math.random()*10) % 6);
		int playerMove =(int)((Math.random()*10) %3 );
		int playerCurrentPosition = 10;
		 switch(playerMove)
		    {
		    case 0: 
		    	System.out.println("No Movement");
		    	break;
		    case 1: 
		    	playerCurrentPosition = LADDER;
		    	playerCurrentPosition +=dice;
		        System.out.println("Ladder move forward " + playerCurrentPosition);
		        break;
		    case 2:
		    	playerCurrentPosition =SNAKE ;
		    	playerCurrentPosition -=dice;
		    System.out.println("Snakes move backward "+ playerCurrentPosition);
		    break;
		    default :
		    	playerCurrentPosition +=dice;
		    System.out.println("Movement to " +playerCurrentPosition );
		    }
				
	}
		
	}	