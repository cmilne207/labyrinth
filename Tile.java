//Representation of a tile
//Tile is a part of the maze
//It has four different directions
//Chris Milne

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
		private String orientOneOne;			//default orientation image w/ p1 on
		private String orientTwoOne;			//default orientation + 1 rotation right image w/ p1 on
		private String orientThreeOne;			//default orientation + 2 rotation right image w/ p1 on
		private String orientFourOne;			//default orientation + 3 rotation right image w/ p1 on
		private String orientOneTwo;			//default orientation image w/ p2 on
		private String orientTwoTwo;			//default orientation + 1 rotation right image w/ p2 on
		private String orientThreeTwo;			//default orientation + 2 rotation right image w/ p2 on
		private String orientFourTwo;			//default orientation + 3 rotation right image w/ p2 on
		private String orientOneBoth;			//default orientation image w/ both on
		private String orientTwoBoth;			//default orientation + 1 rotation right image w/ both on
		private String orientThreeBoth;			//default orientation + 2 rotation right image w/ both on
		private String orientFourBoth;			//default orientation + 3 rotation right image w/ both on
	
		//Constructors
		//default constructor
		//takes all the needed values as argument and sets variables equal to them
		//starts in orientation one
		public Tile(int newIndex, int newTreasure, boolean newN, boolean newE, 
				boolean newS, boolean newW, String newOne, String newTwo, String newThree, String newFour,
				String newOneOne, String newTwoOne, String newThreeOne, String newFourOne,
				String newOneTwo, String newTwoTwo, String newThreeTwo, String newFourTwo,
				String newOneBoth, String newTwoBoth, String newThreeBoth, String newFourBoth){
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
			orientOneOne = newOneOne;
			orientTwoOne = newTwoOne;
			orientThreeOne = newThreeOne;
			orientFourOne = newFourOne;
			orientOneTwo = newOneTwo;
			orientTwoTwo = newTwoTwo;
			orientThreeTwo = newThreeTwo;
			orientFourTwo = newFourTwo;
			orientOneBoth = newOneBoth;
			orientTwoBoth = newTwoBoth;
			orientThreeBoth = newThreeBoth;
			orientFourBoth = newFourBoth;
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
		
		//return the int version of the current orientation
		public int getCurOrient(){
			return curOrient;
		}
		
		//check if player one is on the tile
		public boolean getPlayerOneOn(){
			return playerOneOnTile;
		}
		
		//check if player two is on the tile
		public boolean getPlayerTwoOn(){
			return playerTwoOnTile;
		}
		
		//return the proper image baised on orientation of the board 
		//and which player(s) are on the tile
		public String getCurImage(){
			//orientation 1 options
			if(curOrient == 1){
				//p1 on
				if(playerOneOnTile == true && playerTwoOnTile == false){
					return orientOneOne;
				}
				
				//p2 on
				else if(playerOneOnTile == false && playerTwoOnTile == true){
					return orientOneTwo;
				}
				
				//both on
				else if(playerOneOnTile == true && playerTwoOnTile == true){
					return orientOneBoth;
				}
				
				//none on
				else{
					return orientOne;
				}
			}
			
			//orientation 2 options
			else if(curOrient == 2){
				//p1 on
				if(playerOneOnTile == true && playerTwoOnTile == false){
					return orientTwoOne;
				}
				
				//p2 on
				else if(playerOneOnTile == false && playerTwoOnTile == true){
					return orientTwoTwo;
				}
				
				//both on
				else if(playerOneOnTile == true && playerTwoOnTile == true){
					return orientTwoBoth;
				}
				
				//none on
				else{
					return orientTwo;
				}
			}
			
			//orientation 3 options
			else if(curOrient == 3){
				if(playerOneOnTile == true && playerTwoOnTile == false){
					return orientThreeOne;
				}
				else if(playerOneOnTile == false && playerTwoOnTile == true){
					return orientThreeTwo;
				}
				else if(playerOneOnTile == true && playerTwoOnTile == true){
					return orientThreeBoth;
				}
				else{
					return orientThree;
				}
			}
			
			//orientation 4 options
			else if(curOrient == 4){
				if(playerOneOnTile == true && playerTwoOnTile == false){
					return orientFourOne;
				}
				else if(playerOneOnTile == false && playerTwoOnTile == true){
					return orientFourTwo;
				}
				else if(playerOneOnTile == true && playerTwoOnTile == true){
					return orientFourBoth;
				}
				else{
					return orientFour;
				}
			}
			
			return null;
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