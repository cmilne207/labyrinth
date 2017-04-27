import java.util.Random;

//Rrpresentation of the board
//7x7 grid treated as a two dimensional array
//Joe Pakulski
//Chris Milne

public class Grid 
{     
	//variables
    private Tile[][] grid = new Tile[7][7];
    Tile spareTile;
    
    //constructor
    public Grid(Deck newDeck){
    	//fill static
    	for(int row = 0; row < 7; row += 2){
    		for(int col = 0; col < 7; col += 2){
    			grid[row][col] = newDeck.staticDraw();
    		}
    	}
    	
    	//fill movables
    	//rows with static cards
    	Random r = new Random();
    	for(int row = 0; row < 7; row += 2){
    		for(int col = 1; col < 6; col += 2){
    			Tile inUse = newDeck.draw();
    			int randNum = r.nextInt(3);
    			for(int i = 0; i < randNum; i++){
    				inUse.rotateRight();
    			}
    			grid[row][col] = inUse;
    		}
    	}
    	
    	//rows without static cards
		for(int row = 1; row < 6; row += 2){
			for(int col = 0; col < 7; col++){
				Tile inUse = newDeck.draw();
    			int randNum = r.nextInt(4);
    			for(int i = 0; i < randNum; i++){
    				inUse.rotateRight();
    			}
    			grid[row][col] = inUse;
			}
    	}
		spareTile = newDeck.draw();
		grid[0][0].setPlayerOneOnTile(true);
		grid[6][6].setPlayerTwoOnTile(true);
    }
    
    //getters
    public Tile[][] getGrid(){
    	return grid;
    }
    
    public Tile getAt(int row, int col){
    	return grid[row][col];
    }
    public Tile getSpare(){
    	return spareTile;
    }
    
    //setters
    //set spare
    public void setSpare(Tile newSpare){
    	spareTile = newSpare;
    }
    
    //insert alg
    //needs the tile that is being inserted
    //		the row and column indexes
    //		an int describing which side the insert is coming from (needed to determine where to check for a push off)
    //				1 = top, 2 = right, 3 = bottom, 4 = left
    public Tile insert(Tile inTile, int row, int col, int side){
    	//check for player getting pushed off the other side
    	//top insert check
    	if(side == 1){
    		if(grid[6][col].getPlayerOneOn()){
    			grid[6][col].setPlayerOneOnTile(false);
    			inTile.setPlayerOneOnTile(true);
    		}
    		if(grid[6][col].getPlayerTwoOn()){
    			grid[6][col].setPlayerTwoOnTile(false);
    			inTile.setPlayerTwoOnTile(true);
            
    		}
    	}
    	
    	//right insert check
    	else if(side == 2){
    		if(grid[row][0].getPlayerOneOn()){
    			grid[row][0].setPlayerOneOnTile(false);
    			inTile.setPlayerOneOnTile(true);
    		}
    		if(grid[row][0].getPlayerTwoOn()){
    			grid[row][0].setPlayerTwoOnTile(false);
    			inTile.setPlayerTwoOnTile(true);
    		}
    	}
    	
    	//bottom insert check
    	else if(side == 3){
    		if(grid[0][col].getPlayerOneOn()){
    			grid[0][col].setPlayerOneOnTile(false);
    			inTile.setPlayerOneOnTile(true);
    		}
    		if(grid[0][col].getPlayerTwoOn()){
    			grid[0][col].setPlayerTwoOnTile(false);
    			inTile.setPlayerTwoOnTile(true);
    		}
    	}
    	
    	//left insert check
    	else if(side == 4){
    		if(grid[6][row].getPlayerOneOn()){
    			grid[6][row].setPlayerOneOnTile(false);
    			inTile.setPlayerOneOnTile(true);
    		}
    		if(grid[6][col].getPlayerTwoOn()){
    			grid[6][col].setPlayerTwoOnTile(false);
    			inTile.setPlayerTwoOnTile(true);
    		}
    	}
    	
    	//rotate the new Tile in
    	//top insert
    	if(side == 1){
    		int start = 6;
    		Tile tempHolder = grid[start][col];
    		while (start > 0){
    			grid[start][col] = grid[start - 1][col];
    			start--;
    		}
    		grid[start][col] = inTile;
    		return tempHolder;
         
    	}
    	
    	//right insert
    	else if(side == 2){
    		int start = 0;
    		Tile tempHolder = grid[row][start];
    		while (start < 6){
    			grid[row][start] = grid[row][start + 1];
    			start++;
    		}
    		grid[row][start] = inTile;
    		return tempHolder;
    	}
    	
    	//bottom insert
    	else if(side == 3){
    		int start = 0;
    		Tile tempHolder = grid[start][col];
    		while (start < 6){
    			grid[start][col] = grid[start + 1][col];
    			start++;
    		}
    		grid[start][col] = inTile;
    		return tempHolder;
    	}
    	
    	//left insert
    	else if(side == 4){
    		int start = 6;
    		Tile tempHolder = grid[row][start];
    		while (start > 0){
    			grid[row][start] = grid[row][start - 1];
    			start--;
    		}
    		grid[row][start] = inTile;
    		return tempHolder;
    	}
    	return inTile;
    }
    
    //move alg
    //finds the specified player on the board
    //then calls function to recursivly search for the specified row and col
    //will return true if the path is found and the move is made and false if not
    public boolean attemptMove(int row, int col, int playerNumber){
    	//variables
    	boolean playerFound = false;
    	int playerRow = 0;
    	int playerCol = 0;
    	
    	
    	//look for players
    	//outer loop cycles rows
	    	while(!playerFound && playerRow < 7){
	    		//inner loop cycles cols
	    		while(!playerFound && playerCol < 7){				
	    			//if player 1 check for player 1
	    			if(playerNumber == 1){
	    				playerFound = grid[playerRow][playerCol].getPlayerOneOn();
	    			}
	    			
	    			//if player 2 check for player 2
	    			else{
	    				playerFound = grid[playerRow][playerCol].getPlayerTwoOn();
	    			}
	    			
	    			//next col
	    			//stop if found because we will use these row and col numbers
	    			if(!playerFound){
	    				playerCol++;
	    			}
	    		}
	    		
	    		//next col
				//stop if found because we will use these row and col numbers
	    		if(!playerFound){
	    			playerRow++;
	    			playerCol = 0;
	    		}
	    	}
    	//recursive path validation
	    System.out.println(row + "," + col + "," + playerRow + "," + playerCol);
    	boolean pathFound = recursiveValidation(row, col, playerRow, playerCol, 0);
    	if(pathFound){
    		if(playerNumber == 1){
    			grid[playerRow][playerCol].setPlayerOneOnTile(false);
    			grid[row][col].setPlayerOneOnTile(true);
    		}
    		else{
    			grid[playerRow][playerCol].setPlayerTwoOnTile(false);
    			grid[row][col].setPlayerTwoOnTile(true);
    		}
    	}
	    return pathFound; 
    }
    
    //recursive function used to validate moves
    private boolean recursiveValidation(int row, int col, int curRow, int curCol, int cameFrom){
    	boolean found = false;
    	
    	System.out.println("recursive call");
    	
    	//check for match
    	//break if found
    	if(row == curRow && col == curCol){
    		return true;
    	}
    	
    	//test up
    	if(cameFrom != 1 && curRow != 0){
    		if (grid[curRow][curCol].getNorth() && grid[curRow - 1][curCol].getSouth()){
    			found = recursiveValidation(row, col, curRow - 1, curCol, 3);
    			if(found){
    				return true;
    			}
    		}
    	}
    	
    	//test right
    	if(cameFrom != 2 && curCol != 6){
    		if (grid[curRow][curCol].getEast() && grid[curRow][curCol + 1].getWest()){
    			found = recursiveValidation(row, col, curRow, curCol + 1, 4);
    			//if not found keep searching
    			if(found){
    				return true;
    			}
    		}
    	}
    	
    	//test down
    	if(cameFrom != 3 && curRow != 6){
    		if (grid[curRow][curCol].getSouth() && grid[curRow + 1][curCol].getNorth()){
    			found = recursiveValidation(row, col, curRow + 1, curCol, 1);
    			//if not found keep searching
    			if(found){
    				return true;
    			}
    		}
    	}
    	
    	//test left
    	if(cameFrom != 4 && curCol != 0){
    		if (grid[curRow][curCol].getWest() && grid[curRow][curCol - 1].getEast()){
    			found = recursiveValidation(row, col, curRow, curCol -1, 2);
    			//if not found keep searching
    			if(found){
    				return true;
    			}
    		}
    	}

    	return false;
    }
}