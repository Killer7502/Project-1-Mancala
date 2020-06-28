package main;

public class GameRules {
	
	boolean emptyPocket = false;
	boolean bonusTurn = false;
	void stoneMovement(int [] Pocket, int selection, int playerTurn) {
		int stoneNumber = Pocket[selection];//gets the current selected number of stones
		Pocket[selection] = 0; // makes sure that that the selected pocket is emptied
		selection += 1; //Makes sure that it starts adding to next pocket
		for (int x = stoneNumber; x > 0; x--) {//Loops through until all stones are used 
			if (selection == 13) { //uses this if statement if max number of array is reached
				
				Pocket[selection] +=1; // adds 1 to current pocket
				if (x != 1) {
					selection = 0; // resets to beginning 
				}
				
				
			}
			
			else if (playerTurn == 1 && selection == 0) {
				selection = 1; // continues to next pocket skipping opponents mancala 
				Pocket[selection] +=1;
				if (x != 1) {
					selection += 1; // continues to next pocket
				}
			}
			
			
			else { // if still with in bounds of array
				if (playerTurn == 2 && selection == 7) {
					selection = 8; // continues to next pocket skipping opponents mancala 
					Pocket[selection] +=1;
					if (x != 1) {
						selection += 1; // continues to next pocket
					}
					
				}
				else {
					Pocket[selection] +=1;
					if (x != 1) {
						selection += 1; // continues to next pocket
					}
					
				}
				
			}
			
			
			//checks if on final stone if the pocket was empty and what players turn it was
			if (Pocket[selection] == 1 && x == 1 && playerTurn == 1 && selection <= 7 && selection != 0) {
				emptyPocket = true;
			}
			else if (Pocket[selection] == 1 && x == 1 && playerTurn == 2 ) {
				if (selection > 7 || selection == 0) {
					emptyPocket = true;
				}
				
			}
			
			
			if (Pocket[selection] == 1 && x == 1 && playerTurn == 1 && selection == 7) {
				bonusTurn = true;
			}
			else if (Pocket[selection] == 1 && x == 1 && playerTurn == 2 && selection == 0) {
				bonusTurn = true;
			}
		}
		
		
	}
	
	void capturePocket(boolean emptyPocket) {
		if (emptyPocket == true) {
			
		}
	}
	
	boolean checkPocket(){
		return emptyPocket;
	}
	boolean bonusTurn(){
		return bonusTurn;
	}
	
	
	


        
	//Checks to see if the player who's turn it is can make the move depending on if the compartment chosen is on their side or not.
	private void sideCheck(int compartment, int player) {
		int playerTurn = player; //TEMP VARIABLE. Replace with variable that holds which player's turn it is.
		int compartmentChosen = compartment; //TEMP VARIALBE> Replace with variable that holds which compartment was chosen to be played.
		
		//Check if it's player 1's turn
		if (playerTurn == 1) {
			if (compartmentChosen >= 1 && compartmentChosen <= 6) { //Compartment is on player's side (Bottom side)
				//Move onto code for moving pieces in the chosen compartment
			}
			else { //Compartment is not on players side
				//Tell the player that the chosen compartment is not on their side.
				System.out.println("Chosen compartment is not on your side of the board. Please pick a different compartment."); //FIXME: Replace me
			}
		}
		//Check if it's player 2's turn
		else if (playerTurn == 2) { 
			if (compartmentChosen >= 8 && compartmentChosen <= 13) { //Compartment is on player's side (Top side)
				//Chosen compartment is on the correct side for the player.
				checkEmpty(compartmentChosen);
			}
			else { //Compartment is not on players side
				//Tell the player that the chosen compartment is not on their side.
				System.out.println("Chosen compartment is not on your side of the board. Please pick a different compartment."); //FIXME: Replace me
				//Return to player turn and let them choose another compartment to move
      }
    }
  }

	
	//Check if a given compartment is empty or not
		private void checkEmpty(int compartmentChosen) {
			if (compartmentChosen <= 0) { //Compartment is empty
				//Tell the player that the given compartment has no pieces in it to move.
				System.out.println("Chosen compartment doesn't have any pieces in it to move. Please pick a different compartment."); //FIXME: Replace me
				//Return to player turn and let them choose another compartment to move
			}
			else { //Compartment has 1 or more pieces in it
				//Move onto code for moving the pieces
			}
		}

}
