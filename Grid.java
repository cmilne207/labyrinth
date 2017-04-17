//Rrpresentation of the board
//7x7 grid treated as a two dimensional array
//Joe Pakulski
//Chris Milne

import java.util.Arrays; 
import java.util.*;


public class Grid 
{     
	//variables
    private Tile[][] grid = new Tile[7][7];
    
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
    	for(int row = 0; row < 7; row += 2){
    		for(int col = 1; col < 6; col += 2){
    			grid[row][col] = newDeck.draw();
    			System.out.println("test1");
    		}
    	}
    	
    	//rows without static cards
		for(int row = 1; row < 6; row += 2){
			for(int col = 0; col < 7; col++){
				grid[row][col] = newDeck.draw();
				System.out.println("test2");
			}
    	}
    }
    
    //getters
    public Tile[][] getGrid(){
    	return grid;
    }
    
    //setters

}