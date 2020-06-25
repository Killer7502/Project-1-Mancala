package main;

import java.util.ArrayList;

public class GameRules {
	
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
			if (compartmentChosen >= 7 && compartmentChosen <= 12) { //Compartment is on player's side (Top side)
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
		
		//Check if the either side of the board is empty of pieces. If true, end game and proceed to scoring.
		private void checkGameEnd(ArrayList<Integer> game) {
			Boolean sideBottom = true; //Variable to store if there are no pieces on this side of the board. True means no pieces left.
			Boolean sideTop = true; // Variable to store if there are no pieces on this side of the board. True means no pieces left.
			
			//Check bottom side for empty pockets. If any pocket does not equal 0, break as there are still pieces left on this side.
			for (int i = 0; i < 6; i++) {
				if (game.get(i) != 0) {
					sideBottom = false;
					break;
				}
			}
			
			//Check top side for empty pockets. If any pocket does not equal 0, break as there are still pieces left on this side.
			for (int i = 6; i < 12; i++) {
				if (game.get(i) != 0) {
					sideTop = false;
					break;
				}
			}
			
			//If sideBottom or sideTop is true, that means that one of the sides has no pieces left on it, which means the game is over.
			if (sideBottom == true || sideTop == true) {
				gameEnd(); //FIXME: Replace with method for handling the end of the game.
			}
		}
}
