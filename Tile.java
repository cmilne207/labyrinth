//Rrpresentation of a tile
//Tile is a part of the maze
//It has four different directions
//Joe Pakulski

import java.util.Arrays; 
import java.util.*;


public class Tile
{     
	private:
		//Variables
		int index;					//index of this tile	
		int treasure;				//index representing which treasure card this tile corresponds to
		int curOrient;				//determines which of the four images that will be displayed
		boolean playerOneOnTile;	//true when the player one is on this tile
		boolean playerTwoOnTile;	//true when player two is on this tile
		boolean north;				//true when this tile has a path north
		boolean east;				//true when this tile has a path east
		boolean south;				//true when this tile has a path south
		boolean west;				//true when this tile has a path west
		String orientOne;			//default orientation image 
		String orientTwo;			//default orientation + 1 rotation right image
		String orientThree;			//default orientation + 2 rotation right image
		String orientFour;			//default orientation + 3 rotation right image
	
	public:
		//Constructors
		//default constuctor
		//takes all the needed values as argument and sets variables equal to them
		//starts in orientation one
		public Tile(int newIndex, int newTreasure, boolean newN, boolean newE, 
				boolean newS, boolean newW, String newOne, String newTwo, String newThree, String newFour){
			index = newIndex;
			treasure = newTreasure;
			north = newN;
			east = newE
			south = newS;
			west = newW;
			orientOne = newOne;
			orientTwo = newTwo;
			orientThree = newThree;
			orientFour = newFour;
			curOrient = 1;
			playerOneOnTile = false;
			playerTwoOnTile = false;
		}
		
		//Getters
		//return the treasure value for comparing to player's treasure card(s)
		int getTreasure(){
			return treasure;
		}
		
		//return the boolean value representing if there is a path open in the respective direction
		//north
		boolean getNorth(){
			return north;
		}
		//east
		boolean getEast(){
			return east;
		}
		//south
		boolean getSouth(){
			return south;
		}
		//west
		boolean getWest(){
			return west;
		}
		
		//Setters
		//change the value when the player's location changes
		//player one
		void setPlayerOneOnTile(bool newValue){
			playerOneOnTile = newValue;
		}
		
		//player two
		void setPlayerTwoOnTile(bool newValue){
			playerTwoOnTile = newValue;
		}
		
		//Functionality
		//rotate the path values right and change orientation index to use a new picture
		void rotateRight(){
			//change the values representing if each side has a path
			boolean tempSideBool;
			tempSideBool = west;
			west = south;
			south = east;
			east = north;
			north = tempSideBool;
			
			//change the number of the current orientation image
			//add one since rotation right
			curOrient++;
			
			//occurs when the orientation is returning to default
			if (curOrient == 5){
				curOrient =1;
			}
		}
		
		//rotate the path values left and change orientation index to use a new picture
		void rotateLeft(){
			//change the values representing if each side has a path
			boolean tempSideBool;
			tempSideBool = east;
			east = south;
			south = west;
			west = north;
			north = tempSideBool;
					
			//change the number of the current orientation image
			//subtract one since rotation left
			curOrient--;
					
			//occurs when the orentation passes default
			if (curOrient == 0){
				curOrient = 4;
			}
		}
}