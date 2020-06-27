package main;

public class GameRules {
	boolean emptyPocket = false;
	void stoneMovement(int [] Pocket, int selection, int playerTurn) {
		int stoneNumber = Pocket[selection];//gets the current selected number of stones
		Pocket[selection] = 0; // makes sure that that the selected pocket is emptied
		selection += 1; //Makes sure that it starts adding to next pocket
		for (int x = stoneNumber; x > 0; x--) {//Loops through until all stones are used 
			if (selection == 14) { //uses this if statement if max number of array is reached
				if (playerTurn == 2) {
					Pocket[selection] +=1; // adds 1 to current pocket
					if (x != 1) {
						selection = 1; // resets to beginning 
					}
					
				}
				else {
					selection = 1; // resets to beginning 
					Pocket[selection] +=1; // adds 1 to current pocket
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
			if (Pocket[selection] == 1 && x == 1 && playerTurn == 1 && selection < 7) {
				emptyPocket = true;
			}
			else if (Pocket[selection] == 1 && x == 1 && playerTurn == 2 && selection < 14 && selection > 7) {
				emptyPocket = true;
			}
			
			
			if (Pocket[selection] == 1 && x == 1 && playerTurn == 1 && selection == 7) {
				bonusTurn = true;
			}
			else if (Pocket[selection] == 1 && x == 1 && playerTurn == 2 && selection == 14) {
				bonusTurn = true;
			}
		}
		
		
	}
	
	
	
}
