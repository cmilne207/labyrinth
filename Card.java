//Deck of path tiles used for populating the board
//Created by Ben ammended by Joe

public class Card{	
	//variables
	int treasureIndex;
   String image;
	
	//constructors
	public Card(int newIndex,String newimage){
		treasureIndex = newIndex;
      image = newimage;
	}
	
	//getters
	public int getTreasureIndex(){
		return treasureIndex;
	}
   
   public String getImage(){
		return image;
	}
}
