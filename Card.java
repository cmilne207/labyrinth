//Deck of path tiles used for populating the board

public class Card{	
	//variables
	int treasureIndex;
	
	//constructors
	public Card(int newIndex){
		treasureIndex = newIndex;
	}
	
	//getters
	public int getTreasureIndex(){
		return treasureIndex;
	}
}
