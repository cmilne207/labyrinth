//package gridPopulation;

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
			grid[0][0].setPlayerOneOnTile(true);
			grid[6][6].setPlayerTwoOnTile(true);
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
    
 


}

