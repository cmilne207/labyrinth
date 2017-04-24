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
}