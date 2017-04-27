import java.util.Random;
import java.util.ArrayList;
import java.io.*;
//Joe Pakulski

public class TreasureDeck{	
//Variables
	public ArrayList<Card> deckT;
   public TreasureDeck(){
   
       for (int i=1;i<25;i++)
            {
             deckT = new ArrayList<Card>();
             String str = "treasure-card-" + i + ".jpg";
             Card c = new Card(i,str);
             deckT.add(c);
            }

   }
   public Card dealCard()
   {
      Card c = deckT.remove(0);  //  remove it (returns removed object)
      return c;
   }

	
}
