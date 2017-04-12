import java.util.Random;
import java.util.ArrayList;

//Deck of path tiles used for populating the board

public class Deck{	
	//Variables
	final int CARDS_IN_DECK = 34;
	ArrayList<Tile> deck;
   
	//constructor
	//creates empty deck, populates it, then shuffles it
	public Deck(){
		deck = new ArrayList<Tile>();
		
		////////////////////////////////////////////////////////////
		//add code to create all cards and populate the deck
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
   
  	//checks to see if the deck is empty
  	//returns boolean response
  	public boolean isEmpty(){
  		int size = cardsRemaining();
  		
  		if (size == 0){
  			return true;
  		}
  		
  		else{
  			return false;
  		}
  	}
<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/cmilne207/labyrinth
