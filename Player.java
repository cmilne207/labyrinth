import java.util.ArrayList;

//holds the game parts that correspond to one player or another baring location on the grid

public class Player{	
	//variables
	private ArrayList<Card> treasures;
	private Card curTreasure;
	private int numberDrawn = 0;
	private boolean won = false; 
	
	//constructor
	public Player(ArrayList<Card> newTreasures){
		treasures = newTreasures;
		pullNextTreasure();
	}
	
	//getters
	public int getCurTreasure(){
		return curTreasure.getTreasureIndex();
	}
	
	public boolean checkForWin(){
		return won;
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
}
