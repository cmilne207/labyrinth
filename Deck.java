import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

//Deck of path tiles used for populating the board

public class Deck{	
	//Variables
	ArrayList<Tile> deck;				//holds all of the tile cards that move
	ArrayList<Tile> staticTiles;		//holds the tile cards that have a specific non changing position on the board
	
	//constructor
	//creates empty deck, populates it, then shuffles it
	public Deck(){
		deck = new ArrayList<Tile>();

		////////////////////////////////////////////////////////////
		try {
            File file = new File("tileBuilder.txt");
            Scanner input = new Scanner(file);
        
            System.out.print(file.exists());
        
            //for all static cards place tiles in special array so they 
            //can be placed where they belong in the grid
            for (int i = 0; i < 16; i++) {
            	//get index
                int newIndex = Integer.parseInt(input.nextLine());
                
                //get treasure index
                int newTreasure = Integer.parseInt(input.nextLine());
                
                //get north, east, south, and west path info
                //instansiate
                boolean newNorth = false;
                boolean newEast = false;
                boolean newSouth = false;
                boolean	newWest = false;
                //if true change or leave it false
                //north
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newNorth = true;
                }
                //east
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newEast = true;
                }
                //south
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newSouth = true;
                }
                //west
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newWest = true;
                }
                
                //get image links
                String newOne = input.nextLine();
                String newTwo = input.nextLine();
                String newThree = input.nextLine();
                String newFour = input.nextLine();
                
                //create the tile
                Tile newTile = new Tile(newIndex, newTreasure, newNorth, newEast, 
                		newSouth, newWest, newOne, newTwo, newThree, newFour);
                
                //add to special static tile deck
                staticTile.add(newTile);
            }
            
            //loop for the rest of the cards in the file 
            //and add them to the regular deck
            while(input.hasNextLine()){
            	//get index
                int newIndex = Integer.parseInt(input.nextLine());
                
                //get treasure index
                int newTreasure = Integer.parseInt(input.nextLine());
                
                //get north, east, south, and west path info
                //instansiate
                boolean newNorth = false;
                boolean newEast = false;
                boolean newSouth = false;
                boolean	newWest = false;
                //if true change or leave it false
                //north
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newNorth = true;
                }
                //east
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newEast = true;
                }
                //south
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newSouth = true;
                }
                //west
                if (Integer.parseInt(input.nextLine()) == 1){
                	boolean newWest = true;
                }
                
                //get image links
                String newOne = input.nextLine();
                String newTwo = input.nextLine();
                String newThree = input.nextLine();
                String newFour = input.nextLine();
                
                //create the tile
                Tile newTile = new Tile(newIndex, newTreasure, newNorth, newEast, 
                		newSouth, newWest, newOne, newTwo, newThree, newFour);
                
                //add to special static tile deck
                deck.add(newTile);
            }
            
            //close file
            input.close();
        } 
        
		catch (FileNotFoundException e) {
            System.out.print("Input file Not Found");
        }
		////////////////////////////////////////////////////////////
 
 		shuffle();
	}

	//returns card on the top of the deck
	public Tile draw(){
		Tile t = deck.remove(0);
		return t;
	}
  
  	//returns the number of cards still in the deck
  	public int cardsRemaining(){  
  		return deck.size();
  	}
    
  	//shuffle alg
  	public void shuffle(){
  		int randNum;
  		Tile temp;
  		Random r = new Random();
  		for (int i = 0; i < deck.size(); i++){
  			randNum = r.nextInt(deck.size());
  			temp = deck.get(i);
  			deck.set(i,deck.get(randNum));
  			deck.set(randNum,temp);
   		}
   	}
}