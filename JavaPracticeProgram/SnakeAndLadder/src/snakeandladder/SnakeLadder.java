package snakeandladder;

public class SnakeLadder {
	public static void main(String[] args) {
		
		int player1CurrentPosition= 0;
		int player2CurrentPosition= 0;
		int LADDER = 1;
		int SNAKE = 2;
		
		while(player1CurrentPosition < 100 && player2CurrentPosition < 100) 
		{
		
			int dice1 = (int)((Math.random()*10) % 6)+1;
			System.out.println("Player1 random number is:" +dice1);
			int dice2 = (int)((Math.random()*10) % 6)+1;
			System.out.println(" Player2 random number is:" +dice2); 
		
		    int position  = (int)((Math.random()*10) % 3);
	      if(position == LADDER)
	      {	
	    	player1CurrentPosition += dice1;
	    	player2CurrentPosition += dice2; 
		    if(player1CurrentPosition > 100 || player2CurrentPosition > 100 ) 
		    {	
		    	player1CurrentPosition -=dice1;
		    	player2CurrentPosition -=dice2;
		    }
		    System.out.println("Ladder move forward 1 "+ player1CurrentPosition);
		    System.out.println("Ladder move forward 2 "+ player2CurrentPosition);
		    
	    }
	    else if(position == SNAKE)
	    {	
	    	player1CurrentPosition -= dice1;
	    	player2CurrentPosition -= dice2;
	    if(player1CurrentPosition < 0 || player2CurrentPosition < 0 ) 
	    {
	    	player1CurrentPosition = 0;
	    	player2CurrentPosition = 0;
	    }
	    	System.out.println("Snakes move backward 1 "+ player1CurrentPosition);
	    	System.out.println("Snakes move backward 2 "+ player2CurrentPosition);
	    }
	    else
	    {
	    	System.out.println("Player are on "+ player1CurrentPosition);
	    	System.out.println("Player are on "+ player2CurrentPosition);
	    }
	    //System.out.println("Number of time die to win the game" + dieRoll);
	    if(player1CurrentPosition == 100)
	    	System.out.println("Player 1 Win");	
	    else  if(player2CurrentPosition == 100)
	    	System.out.println("Player 2 Win");	
	    
	  }
	 }
	}