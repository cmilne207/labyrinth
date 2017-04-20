//This is the code for the GUI of the game using JPanel
//It is a lot of code, so the comments are more explaining the orginization
//Written by Joe Pakulski


//imports
import java.util.Random;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

//GUI class
public class Grid_Gui extends JFrame 
{
  //JPanels for 49 tile pieces of the 7x7 grid
  private JPanel TilePanel1; private JPanel TilePanel2; private JPanel TilePanel3; private JPanel TilePanel4; private JPanel TilePanel5;
  private JPanel TilePanel6; private JPanel TilePanel7; private JPanel TilePanel8; private JPanel TilePanel9; private JPanel TilePanel10;
  private JPanel TilePanel11; private JPanel TilePanel12; private JPanel TilePanel13; private JPanel TilePanel14; private JPanel TilePanel15;
  private JPanel TilePanel16; private JPanel TilePanel17; private JPanel TilePanel18; private JPanel TilePanel19; private JPanel TilePanel20;
  private JPanel TilePanel21; private JPanel TilePanel22; private JPanel TilePanel23; private JPanel TilePanel24; private JPanel TilePanel25;
  private JPanel TilePanel26; private JPanel TilePanel27; private JPanel TilePanel28; private JPanel TilePanel29; private JPanel TilePanel30;
  private JPanel TilePanel31; private JPanel TilePanel32; private JPanel TilePanel33; private JPanel TilePanel34; private JPanel TilePanel35;
  private JPanel TilePanel36; private JPanel TilePanel37; private JPanel TilePanel38; private JPanel TilePanel39; private JPanel TilePanel40;
  private JPanel TilePanel41; private JPanel TilePanel42; private JPanel TilePanel43; private JPanel TilePanel44; private JPanel TilePanel45;
  private JPanel TilePanel46; private JPanel TilePanel47; private JPanel TilePanel48; private JPanel TilePanel49;
  
  //Panels for blank spots to help with spacing
   private JPanel blankpanel; private JPanel blankpanel2; private JPanel blankpanel3; private JPanel blankpanel4; private JPanel blankpanel5; 
   private JPanel blankpanel6; private JPanel blankpanel7; private JPanel blankpanel8; private JPanel blankpanel9; private JPanel blankpanel10; 
   private JPanel blankpanel11; private JPanel blankpanel12; private JPanel blankpanel13; private JPanel blankpanel14; private JPanel blankpanel15; 
   private JPanel blankpanel16; private JPanel blankpanel17; private JPanel blankpanel18; private JPanel blankpanel19; private JPanel blankpanel20;
  //As the grid grew from 7x7 to 9x9 to 9x11 more blanks were needed
  //I named them with _ to better place them since the orginal 20 blank spaces were already in position is a previous build 
   private JPanel blankpanel_1; private JPanel blankpanel_2; private JPanel blankpanel_3; private JPanel blankpanel_4; private JPanel blankpanel_5; 
   private JPanel blankpanel_6; private JPanel blankpanel_7; private JPanel blankpanel_8; private JPanel blankpanel_9; private JPanel blankpanel_10; 
   private JPanel blankpanel_11; 
  
  //Panels for the 12 grid manipulation buttons
  private JPanel ButtonPanel1; private JPanel ButtonPanel2; private JPanel ButtonPanel3;
  private JPanel ButtonPanel4; private JPanel ButtonPanel5; private JPanel ButtonPanel6;
  private JPanel ButtonPanel7; private JPanel ButtonPanel8; private JPanel ButtonPanel9;
  private JPanel ButtonPanel10; private JPanel ButtonPanel11; private JPanel ButtonPanel12;
  
  //Panels for messages and counters etc.
  private JPanel MessagePanel; private JPanel TilePanel50; private JPanel MessagePanelTemp;
  private JPanel ButtonPanelR; private JPanel ButtonPanelL;
  private JPanel TreasureCard;  private JPanel CounterPanel;
  
  //Images for tiles treasures and blank spaces
  private ImageIcon back = new ImageIcon("Tile1.jpg"); private ImageIcon space = new ImageIcon("space.jpg"); 
  
  //Creation of the 50 tiles with there images.
  private JLabel Tile = new JLabel(back); private JLabel Tile3 = new JLabel(back);
  private JLabel Tile2 = new JLabel(back); private JLabel Tile5 = new JLabel(back);
  private JLabel Tile4 = new JLabel(back); private JLabel Tile7 = new JLabel(back); 
  private JLabel Tile6 = new JLabel(back); private JLabel Tile9 = new JLabel(back); 
  private JLabel Tile8 = new JLabel(back); private JLabel Tile11 = new JLabel(back); 
  private JLabel Tile10 = new JLabel(back); private JLabel Tile13 = new JLabel(back); 
  private JLabel Tile12 = new JLabel(back); private JLabel Tile15 = new JLabel(back); 
  private JLabel Tile14 = new JLabel(back); private JLabel Tile17 = new JLabel(back); 
  private JLabel Tile16 = new JLabel(back); private JLabel Tile19 = new JLabel(back); 
  private JLabel Tile18 = new JLabel(back); private JLabel Tile21 = new JLabel(back); 
  private JLabel Tile20 = new JLabel(back); private JLabel Tile23 = new JLabel(back); 
  private JLabel Tile22 = new JLabel(back); private JLabel Tile25 = new JLabel(back); 
  private JLabel Tile24 = new JLabel(back); private JLabel Tile27 = new JLabel(back); 
  private JLabel Tile26 = new JLabel(back); private JLabel Tile29 = new JLabel(back); 
  private JLabel Tile28 = new JLabel(back); private JLabel Tile31 = new JLabel(back); 
  private JLabel Tile30 = new JLabel(back); private JLabel Tile33 = new JLabel(back); 
  private JLabel Tile32 = new JLabel(back); private JLabel Tile35 = new JLabel(back); 
  private JLabel Tile34 = new JLabel(back); private JLabel Tile37 = new JLabel(back); 
  private JLabel Tile36 = new JLabel(back); private JLabel Tile39 = new JLabel(back); 
  private JLabel Tile38 = new JLabel(back); private JLabel Tile41 = new JLabel(back); 
  private JLabel Tile40 = new JLabel(back); private JLabel Tile43 = new JLabel(back); 
  private JLabel Tile42 = new JLabel(back); private JLabel Tile45 = new JLabel(back); 
  private JLabel Tile44 = new JLabel(back); private JLabel Tile47 = new JLabel(back); 
  private JLabel Tile46 = new JLabel(back); private JLabel Tile49 = new JLabel(back); 
  private JLabel Tile48 = new JLabel(back); private JButton Move;
  
  private JLabel blank = new JLabel(space); private ImageIcon treasure = new ImageIcon("Treasure.jpg"); 
  
  private JLabel Message = new JLabel("Move Piece to: "); private JLabel Counter1 = new JLabel("Treasure: 0");
  private JButton Rotate; private JLabel Tile50 = new JLabel(back);  private JLabel TreasureL = new JLabel(treasure);
  private JLabel MessageTemp = new JLabel("Placeholder");

 
  //Creation of the 50 tiles for panels
  Tile tile1; Tile tile2; Tile tile3; Tile tile4; Tile tile5; Tile tile6; Tile tile7; 
  Tile tile8; Tile tile9; Tile tile10; Tile tile11; Tile tile12; Tile tile13; Tile tile14; 
  Tile tile15; Tile tile16; Tile tile17; Tile tile18; Tile tile19; Tile tile20; Tile tile21; 
  Tile tile22; Tile tile23; Tile tile24; Tile tile25; Tile tile26; Tile tile27; Tile tile28; 
  Tile tile29; Tile tile30; Tile tile31; Tile tile32; Tile tile33; Tile tile34; Tile tile35; 
  Tile tile36; Tile tile37; Tile tile38; Tile tile39; Tile tile40; Tile tile41; Tile tile42; 
  Tile tile43; Tile tile44; Tile tile45; Tile tile46; Tile tile47; Tile tile48; Tile tile49; 
  Tile tile50;
 
  public Grid_Gui()
  { setTitle("Labrynth Game");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(9,11));
    
    //Build the Panels
    buildTilePanels();
    buildCounterPanels();
    buildButton();
    add(blankpanel); add(blankpanel2); add(ButtonPanel1); add(blankpanel3); add(ButtonPanel2); add(blankpanel4); add(ButtonPanel3); add(blankpanel5); add(blankpanel6); add(blankpanel_1); add(blankpanel_2);
    add(blankpanel7); add(TilePanel1); add(TilePanel2); add(TilePanel3) ;add(TilePanel4); add(TilePanel5); add(TilePanel6); add(TilePanel7); add(blankpanel8);add(blankpanel_3); add(TilePanel50); 
    add(ButtonPanel4); add(TilePanel8); add(TilePanel9); add(TilePanel10) ;add(TilePanel11); add(TilePanel12); add(TilePanel13); add(TilePanel14); add(ButtonPanel5); add(ButtonPanelL); add(ButtonPanelR);
    add(blankpanel9); add(TilePanel15); add(TilePanel16); add(TilePanel17) ;add(TilePanel18); add(TilePanel19); add(TilePanel20); add(TilePanel21); add(blankpanel10); add(blankpanel_4); add(blankpanel_5);
    add(ButtonPanel6); add(TilePanel22); add(TilePanel23); add(TilePanel24) ;add(TilePanel25); add(TilePanel26); add(TilePanel27); add(TilePanel28);add(ButtonPanel7); add(blankpanel_6); add(blankpanel_7);
    add(blankpanel11); add(TilePanel29); add(TilePanel30); add(TilePanel31) ;add(TilePanel32); add(TilePanel33); add(TilePanel34); add(TilePanel35);add(blankpanel12); add(TreasureCard); add(CounterPanel);
    add(ButtonPanel8); add(TilePanel36); add(TilePanel37); add(TilePanel38) ;add(TilePanel39); add(TilePanel40); add(TilePanel41); add(TilePanel42);add(ButtonPanel9);add(blankpanel_8); add(blankpanel_9);
    add(blankpanel13); add(TilePanel43); add(TilePanel44); add(TilePanel45) ;add(TilePanel46); add(TilePanel47); add(TilePanel48); add(TilePanel49);add(blankpanel14); add(MessagePanel); add(MessagePanelTemp); 
    add(blankpanel15); add(blankpanel16); add(ButtonPanel10); add(blankpanel17); add(ButtonPanel11); add(blankpanel18); add(ButtonPanel12); add(blankpanel19); add(blankpanel20); add(blankpanel_10); add(blankpanel_11);
    
    pack();
    setVisible(true);
    
        
  }
   public void buildTilePanels()
  {
   TilePanel1 = new JPanel(); TilePanel1.add(Tile); TilePanel2 = new JPanel(); TilePanel2.add(Tile2);
   TilePanel3 = new JPanel(); TilePanel3.add(Tile3); TilePanel4 = new JPanel(); TilePanel4.add(Tile4); 
   TilePanel5 = new JPanel(); TilePanel5.add(Tile5); TilePanel6 = new JPanel(); TilePanel6.add(Tile6); 
   TilePanel7 = new JPanel(); TilePanel7.add(Tile7); TilePanel8 = new JPanel(); TilePanel8.add(Tile8); 
   TilePanel9 = new JPanel(); TilePanel9.add(Tile9); TilePanel10 = new JPanel(); TilePanel10.add(Tile10); 
   TilePanel11 = new JPanel(); TilePanel11.add(Tile11); TilePanel12 = new JPanel(); TilePanel12.add(Tile12); 
   TilePanel13 = new JPanel(); TilePanel13.add(Tile13); TilePanel14 = new JPanel(); TilePanel14.add(Tile14); 
   TilePanel15 = new JPanel(); TilePanel15.add(Tile15); TilePanel16 = new JPanel(); TilePanel16.add(Tile16); 
   TilePanel17 = new JPanel(); TilePanel17.add(Tile17); TilePanel18 = new JPanel(); TilePanel18.add(Tile18); 
   TilePanel19 = new JPanel(); TilePanel19.add(Tile19); TilePanel20 = new JPanel(); TilePanel20.add(Tile20); 
   TilePanel21 = new JPanel(); TilePanel21.add(Tile21); TilePanel22 = new JPanel(); TilePanel22.add(Tile22); 
   TilePanel23 = new JPanel(); TilePanel23.add(Tile23); TilePanel24 = new JPanel(); TilePanel24.add(Tile24); 
   TilePanel25 = new JPanel(); TilePanel25.add(Tile25); TilePanel26 = new JPanel(); TilePanel26.add(Tile26); 
   TilePanel27 = new JPanel(); TilePanel27.add(Tile27); TilePanel28 = new JPanel(); TilePanel28.add(Tile28); 
   TilePanel29 = new JPanel(); TilePanel29.add(Tile29); TilePanel30 = new JPanel(); TilePanel30.add(Tile30); 
   TilePanel31 = new JPanel(); TilePanel31.add(Tile31); TilePanel32 = new JPanel(); TilePanel32.add(Tile32); 
   TilePanel33 = new JPanel(); TilePanel33.add(Tile33); TilePanel34 = new JPanel(); TilePanel34.add(Tile34); 
   TilePanel35 = new JPanel(); TilePanel35.add(Tile35); TilePanel36 = new JPanel(); TilePanel36.add(Tile36); 
   TilePanel37 = new JPanel(); TilePanel37.add(Tile37); TilePanel38 = new JPanel(); TilePanel38.add(Tile38); 
   TilePanel39 = new JPanel(); TilePanel39.add(Tile39); TilePanel40 = new JPanel(); TilePanel40.add(Tile40); 
   TilePanel41 = new JPanel(); TilePanel41.add(Tile41); TilePanel42 = new JPanel(); TilePanel42.add(Tile42); 
   TilePanel43 = new JPanel(); TilePanel43.add(Tile43); TilePanel44 = new JPanel(); TilePanel44.add(Tile44); 
   TilePanel45 = new JPanel(); TilePanel45.add(Tile45); TilePanel46 = new JPanel(); TilePanel46.add(Tile46); 
   TilePanel47 = new JPanel(); TilePanel47.add(Tile47); TilePanel48 = new JPanel(); TilePanel48.add(Tile48); 
   TilePanel49 = new JPanel(); TilePanel49.add(Tile49); TilePanel50 = new JPanel(); TilePanel50.add(Tile50); 
   
   blankpanel = new JPanel(); blankpanel.add(blank); blankpanel2 = new JPanel(); blankpanel2.add(blank); 
   blankpanel3 = new JPanel(); blankpanel3.add(blank); blankpanel4 = new JPanel(); blankpanel4.add(blank); 
   blankpanel5 = new JPanel(); blankpanel5.add(blank); blankpanel6 = new JPanel(); blankpanel6.add(blank); 
   blankpanel7 = new JPanel(); blankpanel7.add(blank); blankpanel8 = new JPanel(); blankpanel8.add(blank); 
   blankpanel9 = new JPanel(); blankpanel9.add(blank); blankpanel10 = new JPanel(); blankpanel10.add(blank); 
   blankpanel11 = new JPanel(); blankpanel11.add(blank); blankpanel12 = new JPanel(); blankpanel12.add(blank); 
   blankpanel13 = new JPanel(); blankpanel13.add(blank); blankpanel14 = new JPanel(); blankpanel14.add(blank); 
   blankpanel15 = new JPanel(); blankpanel15.add(blank); blankpanel16 = new JPanel(); blankpanel16.add(blank); 
   blankpanel17 = new JPanel(); blankpanel17.add(blank); blankpanel18 = new JPanel(); blankpanel18.add(blank); 
   blankpanel19 = new JPanel(); blankpanel19.add(blank); blankpanel20 = new JPanel(); blankpanel20.add(blank); 
   
   TreasureCard = new JPanel(); TreasureCard.add(TreasureL);
   
   blankpanel_1 = new JPanel(); blankpanel_1.add(blank); blankpanel_2 = new JPanel(); blankpanel_2.add(blank); 
   blankpanel_3 = new JPanel(); blankpanel_3.add(blank); blankpanel_4 = new JPanel(); blankpanel_4.add(blank); 
   blankpanel_5 = new JPanel(); blankpanel_5.add(blank); blankpanel_6 = new JPanel(); blankpanel_6.add(blank); 
   blankpanel_7 = new JPanel(); blankpanel_7.add(blank); blankpanel_8 = new JPanel(); blankpanel_8.add(blank); 
   blankpanel_9 = new JPanel(); blankpanel_9.add(blank); blankpanel_10 = new JPanel(); blankpanel_10.add(blank); 
   blankpanel_11 = new JPanel(); blankpanel_11.add(blank);

   
  
  
  }
  
  public void buildCounterPanels()
  {
   CounterPanel = new JPanel();
   CounterPanel.add(Counter1);
   MessagePanel = new JPanel();
   MessagePanel.add(Message);
   MessagePanelTemp = new JPanel();
   MessagePanelTemp.add(MessageTemp);
  }

  public void buildButton()
  {
   
   ButtonPanel1 = new JPanel(); Move = new JButton("Down"); ButtonPanel1.add(Move);
   ButtonPanel2 = new JPanel(); Move = new JButton("Down"); ButtonPanel2.add(Move);
   ButtonPanel3 = new JPanel(); Move = new JButton("Down"); ButtonPanel3.add(Move);
   ButtonPanel4 = new JPanel(); Move = new JButton("-->"); ButtonPanel4.add(Move);
   ButtonPanel5 = new JPanel(); Move = new JButton("<--"); ButtonPanel5.add(Move);
   ButtonPanel6 = new JPanel(); Move = new JButton("-->"); ButtonPanel6.add(Move);
   ButtonPanel7 = new JPanel(); Move = new JButton("<--"); ButtonPanel7.add(Move);
   ButtonPanel8 = new JPanel(); Move = new JButton("-->"); ButtonPanel8.add(Move);
   ButtonPanel9 = new JPanel(); Move = new JButton("<--"); ButtonPanel9.add(Move);
   ButtonPanel10 = new JPanel(); Move = new JButton("^"); ButtonPanel10.add(Move);
   ButtonPanel11 = new JPanel(); Move = new JButton("^"); ButtonPanel11.add(Move);
   ButtonPanel12 = new JPanel(); Move = new JButton("^"); ButtonPanel12.add(Move);
   
   ButtonPanelR = new JPanel(); Rotate = new JButton("Left"); ButtonPanelR.add(Rotate);
   ButtonPanelL = new JPanel(); Rotate = new JButton("Right"); ButtonPanelL.add(Rotate);
  }

  

       
 /**
 * Main method
 * Runs the Grid Gui
 */
 public static void main(String [] args)
   {
    new Grid_Gui();
   }
   
}