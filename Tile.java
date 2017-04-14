//Representation of a tile
//Tile is a part of the maze
//It has four different directions

public class Tile{     
		//Variables
		private int index;					//index of this tile	
		private int treasure;				//index representing which treasure card this tile corresponds to
		private int curOrient;				//determines which of the four images that will be displayed
		private boolean playerOneOnTile;	//true when the player one is on this tile
		private boolean playerTwoOnTile;	//true when player two is on this tile
		private boolean north;				//true when this tile has a path north
		private boolean east;				//true when this tile has a path east
		private boolean south;				//true when this tile has a path south
		private boolean west;				//true when this tile has a path west
		private String orientOne;			//default orientation image 
		private String orientTwo;			//default orientation + 1 rotation right image
		private String orientThree;			//default orientation + 2 rotation right image
		private String orientFour;			//default orientation + 3 rotation right image
	
		//Constructors
		//default constructor
		//takes all the needed values as argument and sets variables equal to them
		//starts in orientation one
		public Tile(int newIndex, int newTreasure, boolean newN, boolean newE, 
				boolean newS, boolean newW, String newOne, String newTwo, String newThree, String newFour){
			index = newIndex;
			treasure = newTreasure;
			north = newN;
			east = newE;
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
		public int getIndex(){
			return index;
		}
		
		//return the treasure value for comparing to player's treasure card(s)
		public int getTreasure(){
			return treasure;
		}
		
		//return the boolean value representing if there is a path open in the respective direction
		//north
		public boolean getNorth(){
			return north;
		}
		//east
		public boolean getEast(){
			return east;
		}
		//south
		public boolean getSouth(){
			return south;
		}
		//west
		public boolean getWest(){
			return west;
		}
		
		//Setters
		//change the value when the player's location changes
		//player one
		public void setPlayerOneOnTile(boolean newValue){
			playerOneOnTile = newValue;
		}
		
		//player two
		public void setPlayerTwoOnTile(boolean newValue){
			playerTwoOnTile = newValue;
		}
		
		//Functionality
		//rotate the path values right and change orientation index to use a new picture
		public void rotateRight(){
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
		public void rotateLeft(){
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
					
			//occurs when the orientation passes default
			if (curOrient == 0){
				curOrient = 4;
			}
		}
}