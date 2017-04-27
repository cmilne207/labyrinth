import java.util.ArrayList;

//holds the game parts that correspond to one player or another baring location on the grid

//Ben

public class Player{	
	//variables
	private ArrayList<Card> treasures;
	private Card curTreasure;
	private int numberDrawn = 0;
	private boolean won = false; 
   private boolean playerOne = false;
	private boolean playerTwo = true;
	
	
	//constructor
	public Player(ArrayList<Card> newTreasures){
		treasures = newTreasures;
		pullNextTreasure();
	}
	
	//getters
	public int getCurTreasure(){
		return curTreasure.getTreasureIndex();
	}
	
/*	public boolean checkForWin(){
		return won;
	}*/
	
	public void checkForWin(){
		if(won){
			/* End game method; display congrats! */
		}
		else {
			/* continue with game */
		}
	}
	
	public int getPlayer() {
		if(playerOne) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	//setters
	public void pullNextTreasure(){
		if (numberDrawn < 12){
			curTreasure = treasures.remove(numberDrawn);
			numberDrawn++;
		}
		else{
			won = true;
		}
	}
	
	public boolean setPlayerOne() {
		playerOne = true;
		playerTwo = false;
		return playerOne;
	}
	
	public boolean setPlayerTwo() {
		playerOne = false;
		playerTwo = true;
		return playerTwo;
	}
}
