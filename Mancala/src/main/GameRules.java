package main;

public class GameRules {
	
	void stoneMovement() {
		int stoneNumber = Pocket[selection];//gets the current selected number of stones
		Pocket[selection] = 0; // makes sure that that the selected pocket is emptied
		selection += 1; //Makes sure that it starts adding to next pocket
		for (x= = stoneNumber, x > 0, x--) {//Loops through until all stones are used 
			if (selection == maxNumber) { //uses this if statment if max number of array is reached
				Pocket[selection] +=1; // adds 1 to current pocket
				selection = 0; // resets to begining 
			}
			else { // if still with in bounds of array
				Pocket[selection] +=1;
				selection += 1; // continues to next pocket
			}
		}
	}
	
}
