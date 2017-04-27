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
  private JPanel ButtonPanel13;
  
  //Panels for messages and counters etc.
  private JPanel MoveButton; private JPanel TilePanel50; private JPanel MovePlayerPanel; private JPanel MovePlayerPanel2;
  private JPanel ButtonPanelR; private JPanel ButtonPanelL; JPanel ButtonStart;
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
  private JButton MoveD; private JButton MoveL; private JButton MoveR; private JButton MoveU;
  private JButton MoveD2; private JButton MoveL2; private JButton MoveR2; private JButton MoveU2;
  private JButton MoveD3; private JButton MoveL3; private JButton MoveR3; private JButton MoveU3;

  
  private JLabel blank = new JLabel(space); private ImageIcon treasure = new ImageIcon("treasure-card-1.jpg"); 
  
  private JButton MovePlayer; private JLabel Counter1 = new JLabel("Treasure: 0");
  private JButton RotateL; private JButton RotateR; private JLabel Tile50 = new JLabel(back);  private JLabel TreasureL = new JLabel(treasure);
  private JTextField textfield; private JTextField textfield2; private JButton Start;

 
  //Creation of the 50 tiles for panels
  Tile tile1; Tile tile2; Tile tile3; Tile tile4; Tile tile5; Tile tile6; Tile tile7; 
  Tile tile8; Tile tile9; Tile tile10; Tile tile11; Tile tile12; Tile tile13; Tile tile14; 
  Tile tile15; Tile tile16; Tile tile17; Tile tile18; Tile tile19; Tile tile20; Tile tile21; 
  Tile tile22; Tile tile23; Tile tile24; Tile tile25; Tile tile26; Tile tile27; Tile tile28; 
  Tile tile29; Tile tile30; Tile tile31; Tile tile32; Tile tile33; Tile tile34; Tile tile35; 
  Tile tile36; Tile tile37; Tile tile38; Tile tile39; Tile tile40; Tile tile41; Tile tile42; 
  Tile tile43; Tile tile44; Tile tile45; Tile tile46; Tile tile47; Tile tile48; Tile tile49; 
  Tile tile50;
  //Creation the Decks and grid. Was done in start button but was having issues 
  //Creating it here allows every button to interact with it
  Deck d = new Deck(); Grid g = new Grid(d); //TreasureDeck t = new TreasureDeck();
 
  //Actual GUI class
  public Grid_Gui()
  { setTitle("Labrynth Game");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(9,11));
    
    //Build the Panels
    buildTilePanels();
    buildCounterPanels();
    buildButton();
    //Add every Jpanel to its appropriate spot on the board
    add(blankpanel); add(blankpanel2); add(ButtonPanel1); add(blankpanel3); add(ButtonPanel2); add(blankpanel4); add(ButtonPanel3); add(blankpanel5); add(blankpanel6); add(ButtonStart); add(blankpanel_2);
    add(blankpanel7); add(TilePanel1); add(TilePanel2); add(TilePanel3) ;add(TilePanel4); add(TilePanel5); add(TilePanel6); add(TilePanel7); add(blankpanel8);add(blankpanel_3); add(TilePanel50); 
    add(ButtonPanel4); add(TilePanel8); add(TilePanel9); add(TilePanel10) ;add(TilePanel11); add(TilePanel12); add(TilePanel13); add(TilePanel14); add(ButtonPanel5); add(ButtonPanelL); add(ButtonPanelR);
    add(blankpanel9); add(TilePanel15); add(TilePanel16); add(TilePanel17) ;add(TilePanel18); add(TilePanel19); add(TilePanel20); add(TilePanel21); add(blankpanel10); add(blankpanel_4); add(blankpanel_5);
    add(ButtonPanel6); add(TilePanel22); add(TilePanel23); add(TilePanel24) ;add(TilePanel25); add(TilePanel26); add(TilePanel27); add(TilePanel28);add(ButtonPanel7); add(blankpanel_6); add(blankpanel_7);
    add(blankpanel11); add(TilePanel29); add(TilePanel30); add(TilePanel31) ;add(TilePanel32); add(TilePanel33); add(TilePanel34); add(TilePanel35);add(blankpanel12); add(TreasureCard); add(CounterPanel);
    add(ButtonPanel8); add(TilePanel36); add(TilePanel37); add(TilePanel38) ;add(TilePanel39); add(TilePanel40); add(TilePanel41); add(TilePanel42);add(ButtonPanel9);add(blankpanel_8); add(blankpanel_9);
    add(blankpanel13); add(TilePanel43); add(TilePanel44); add(TilePanel45) ;add(TilePanel46); add(TilePanel47); add(TilePanel48); add(TilePanel49);add(blankpanel14); add(ButtonPanel13); add(blankpanel_10); 
    add(blankpanel15); add(blankpanel16); add(ButtonPanel10); add(blankpanel17); add(ButtonPanel11); add(blankpanel18); add(ButtonPanel12); add(blankpanel19); add(blankpanel20); add(MovePlayerPanel); add(MovePlayerPanel2);
    
    pack();
    setVisible(true);
    
        
  }
  //Creation of all the panels related to Tiles and blank spaces
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
  //Building of the counter and message panels
  public void buildCounterPanels()
  {
   CounterPanel = new JPanel();
   CounterPanel.add(Counter1);
   MovePlayerPanel = new JPanel();
   textfield = new JTextField();
   textfield.setColumns(5);
   MovePlayerPanel.add(textfield);
   
   MovePlayerPanel2 = new JPanel();
   textfield2 = new JTextField();
   textfield2.setColumns(5);
   MovePlayerPanel2.add(textfield2);
  }
  //Building of the 15 buttons on the board
  public void buildButton()
  {
   
   ButtonPanel1 = new JPanel(); MoveD3 = new JButton("Down"); ButtonPanel1.add(MoveD3);
   ButtonPanel2 = new JPanel(); MoveD2 = new JButton("Down"); ButtonPanel2.add(MoveD2);
   ButtonPanel3 = new JPanel(); MoveD = new JButton("Down"); ButtonPanel3.add(MoveD);
   ButtonPanel4 = new JPanel(); MoveR = new JButton("-->"); ButtonPanel4.add(MoveR);
   ButtonPanel5 = new JPanel(); MoveL = new JButton("<--"); ButtonPanel5.add(MoveL);
   ButtonPanel6 = new JPanel(); MoveR2 = new JButton("-->"); ButtonPanel6.add(MoveR2);
   ButtonPanel7 = new JPanel(); MoveL2 = new JButton("<--"); ButtonPanel7.add(MoveL2);
   ButtonPanel8 = new JPanel(); MoveR3 = new JButton("-->"); ButtonPanel8.add(MoveR3);
   ButtonPanel9 = new JPanel(); MoveL3 = new JButton("<--"); ButtonPanel9.add(MoveL3);
   ButtonPanel10 = new JPanel(); MoveU = new JButton("^"); ButtonPanel10.add(MoveU);
   ButtonPanel11 = new JPanel(); MoveU2 = new JButton("^"); ButtonPanel11.add(MoveU2);
   ButtonPanel12 = new JPanel(); MoveU3 = new JButton("^"); ButtonPanel12.add(MoveU3);
   
   ButtonPanelR = new JPanel(); RotateL = new JButton("Left"); ButtonPanelR.add(RotateL);
   ButtonPanelL = new JPanel(); RotateR = new JButton("Right"); ButtonPanelL.add(RotateR);
   
   ButtonStart = new JPanel(); Start = new JButton("Start"); ButtonStart.add(Start);
   
   ButtonPanel13 = new JPanel(); MovePlayer = new JButton("Move Piece:"); ButtonPanel13.add(MovePlayer);
   
   Start.addActionListener(new ButtonListener1());
   RotateL.addActionListener(new ButtonListener2());
   RotateR.addActionListener(new ButtonListener3());
   
   MoveD.addActionListener(new ButtonListener4());
   MoveR.addActionListener(new ButtonListener5());
   MoveL.addActionListener(new ButtonListener6());
   MoveU.addActionListener(new ButtonListener7());
   
   MoveD2.addActionListener(new ButtonListener8());
   MoveR2.addActionListener(new ButtonListener9());
   MoveL2.addActionListener(new ButtonListener10());
   MoveU2.addActionListener(new ButtonListener11());
   
   MoveD3.addActionListener(new ButtonListener12());
   MoveR3.addActionListener(new ButtonListener13());
   MoveL3.addActionListener(new ButtonListener14());
   MoveU3.addActionListener(new ButtonListener15());
   
   MovePlayer.addActionListener(new ButtonListener16());
   
  }

   /**
   * This is the button to create a new game
   * it creates a fresh deck and deals the tiles to the board
   */
  class ButtonListener1 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      //Create the Deck and Grid
      //Deck d = new Deck();
      //Grid g = new Grid(d);
      
      //Link the 49 tile labels with the 49 tiles in the grid
      tile1 = g.getAt(0,0);ImageIcon t1 = new ImageIcon(tile1.getCurImage()); Tile.setIcon(t1);
      tile2 = g.getAt(0,1);ImageIcon t2 = new ImageIcon(tile2.getCurImage()); Tile2.setIcon(t2);
      tile3 = g.getAt(0,2);ImageIcon t3 = new ImageIcon(tile3.getCurImage()); Tile3.setIcon(t3);
      tile4 = g.getAt(0,3);ImageIcon t4 = new ImageIcon(tile4.getCurImage()); Tile4.setIcon(t4);
      tile5 = g.getAt(0,4);ImageIcon t5 = new ImageIcon(tile5.getCurImage()); Tile5.setIcon(t5);
      tile6 = g.getAt(0,5);ImageIcon t6 = new ImageIcon(tile6.getCurImage()); Tile6.setIcon(t6);
      tile7 = g.getAt(0,6);ImageIcon t7 = new ImageIcon(tile7.getCurImage()); Tile7.setIcon(t7);
      
      tile8 = g.getAt(1,0);ImageIcon t8 = new ImageIcon(tile8.getCurImage()); Tile8.setIcon(t8);
      tile9 = g.getAt(1,1);ImageIcon t9 = new ImageIcon(tile9.getCurImage()); Tile9.setIcon(t9);
      tile10 = g.getAt(1,2);ImageIcon t10 = new ImageIcon(tile10.getCurImage()); Tile10.setIcon(t10);
      tile11 = g.getAt(1,3);ImageIcon t11 = new ImageIcon(tile11.getCurImage()); Tile11.setIcon(t11);
      tile12 = g.getAt(1,4);ImageIcon t12 = new ImageIcon(tile12.getCurImage()); Tile12.setIcon(t12);
      tile13 = g.getAt(1,5);ImageIcon t13 = new ImageIcon(tile13.getCurImage()); Tile13.setIcon(t13);
      tile14 = g.getAt(1,6);ImageIcon t14 = new ImageIcon(tile14.getCurImage()); Tile14.setIcon(t14);
      
      tile15 = g.getAt(2,0);ImageIcon t15 = new ImageIcon(tile15.getCurImage()); Tile15.setIcon(t15);
      tile16 = g.getAt(2,1);ImageIcon t16 = new ImageIcon(tile16.getCurImage()); Tile16.setIcon(t16);
      tile17 = g.getAt(2,2);ImageIcon t17 = new ImageIcon(tile17.getCurImage()); Tile17.setIcon(t17);
      tile18 = g.getAt(2,3);ImageIcon t18 = new ImageIcon(tile18.getCurImage()); Tile18.setIcon(t18);
      tile19 = g.getAt(2,4);ImageIcon t19 = new ImageIcon(tile19.getCurImage()); Tile19.setIcon(t19);
      tile20 = g.getAt(2,5);ImageIcon t20 = new ImageIcon(tile20.getCurImage()); Tile20.setIcon(t20);
      tile21 = g.getAt(2,6);ImageIcon t21 = new ImageIcon(tile21.getCurImage()); Tile21.setIcon(t21);
      
      tile22 = g.getAt(3,0);ImageIcon t22 = new ImageIcon(tile22.getCurImage()); Tile22.setIcon(t22);
      tile23 = g.getAt(3,1);ImageIcon t23 = new ImageIcon(tile23.getCurImage()); Tile23.setIcon(t23);
      tile24 = g.getAt(3,2);ImageIcon t24 = new ImageIcon(tile24.getCurImage()); Tile24.setIcon(t24);
      tile25 = g.getAt(3,3);ImageIcon t25 = new ImageIcon(tile25.getCurImage()); Tile25.setIcon(t25);
      tile26 = g.getAt(3,4);ImageIcon t26 = new ImageIcon(tile26.getCurImage()); Tile26.setIcon(t26);
      tile27 = g.getAt(3,5);ImageIcon t27 = new ImageIcon(tile27.getCurImage()); Tile27.setIcon(t27);
      tile28 = g.getAt(3,6);ImageIcon t28 = new ImageIcon(tile28.getCurImage()); Tile28.setIcon(t28);
      
      tile29 = g.getAt(4,0);ImageIcon t29 = new ImageIcon(tile29.getCurImage()); Tile29.setIcon(t29);
      tile30 = g.getAt(4,1);ImageIcon t30 = new ImageIcon(tile30.getCurImage()); Tile30.setIcon(t30);
      tile31 = g.getAt(4,2);ImageIcon t31 = new ImageIcon(tile31.getCurImage()); Tile31.setIcon(t31);
      tile32 = g.getAt(4,3);ImageIcon t32 = new ImageIcon(tile32.getCurImage()); Tile32.setIcon(t32);
      tile33 = g.getAt(4,4);ImageIcon t33 = new ImageIcon(tile33.getCurImage()); Tile33.setIcon(t33);
      tile34 = g.getAt(4,5);ImageIcon t34 = new ImageIcon(tile34.getCurImage()); Tile34.setIcon(t34);
      tile35 = g.getAt(4,6);ImageIcon t35 = new ImageIcon(tile35.getCurImage()); Tile35.setIcon(t35);
      
      tile36 = g.getAt(5,0);ImageIcon t36 = new ImageIcon(tile36.getCurImage()); Tile36.setIcon(t36);
      tile37 = g.getAt(5,1);ImageIcon t37 = new ImageIcon(tile37.getCurImage()); Tile37.setIcon(t37);
      tile38 = g.getAt(5,2);ImageIcon t38 = new ImageIcon(tile38.getCurImage()); Tile38.setIcon(t38);
      tile39 = g.getAt(5,3);ImageIcon t39 = new ImageIcon(tile39.getCurImage()); Tile39.setIcon(t39);
      tile40 = g.getAt(5,4);ImageIcon t40 = new ImageIcon(tile40.getCurImage()); Tile40.setIcon(t40);
      tile41 = g.getAt(5,5);ImageIcon t41 = new ImageIcon(tile41.getCurImage()); Tile41.setIcon(t41);
      tile42 = g.getAt(5,6);ImageIcon t42 = new ImageIcon(tile42.getCurImage()); Tile42.setIcon(t42);
      
      tile43 = g.getAt(6,0);ImageIcon t43 = new ImageIcon(tile43.getCurImage()); Tile43.setIcon(t43);
      tile44 = g.getAt(6,1);ImageIcon t44 = new ImageIcon(tile44.getCurImage()); Tile44.setIcon(t44);
      tile45 = g.getAt(6,2);ImageIcon t45 = new ImageIcon(tile45.getCurImage()); Tile45.setIcon(t45);
      tile46 = g.getAt(6,3);ImageIcon t46 = new ImageIcon(tile46.getCurImage()); Tile46.setIcon(t46);
      tile47 = g.getAt(6,4);ImageIcon t47 = new ImageIcon(tile47.getCurImage()); Tile47.setIcon(t47);
      tile48 = g.getAt(6,5);ImageIcon t48 = new ImageIcon(tile48.getCurImage()); Tile48.setIcon(t48);
      tile49 = g.getAt(6,6);ImageIcon t49 = new ImageIcon(tile49.getCurImage()); Tile49.setIcon(t49);
      
      
      
      //Code for the spare Tile
      tile50 = g.getSpare();
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      
      
      pack();
     }
     
  }

  class ButtonListener2 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50.rotateRight();
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      pack();
     }
     
  }
  
    class ButtonListener3 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50.rotateLeft();
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      pack();
     }
     
  }
  //Button for Third Down Button
    class ButtonListener4 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,1,5,1);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile6 = g.getAt(0,5);ImageIcon t6 = new ImageIcon(tile6.getCurImage()); Tile6.setIcon(t6);
      tile13 = g.getAt(1,5);ImageIcon t13 = new ImageIcon(tile13.getCurImage()); Tile13.setIcon(t13);      
      tile20 = g.getAt(2,5);ImageIcon t20 = new ImageIcon(tile20.getCurImage()); Tile20.setIcon(t20);      
      tile27 = g.getAt(3,5);ImageIcon t27 = new ImageIcon(tile27.getCurImage()); Tile27.setIcon(t27);      
      tile34 = g.getAt(4,5);ImageIcon t34 = new ImageIcon(tile34.getCurImage()); Tile34.setIcon(t34);     
      tile41 = g.getAt(5,5);ImageIcon t41 = new ImageIcon(tile41.getCurImage()); Tile41.setIcon(t41);      
      tile48 = g.getAt(6,5);ImageIcon t48 = new ImageIcon(tile48.getCurImage()); Tile48.setIcon(t48);
     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for First Right
  class ButtonListener5 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,1,1,4);
      //Link the 49 tile labels with the 49 tiles in the grid
      
      tile8 = g.getAt(1,0);ImageIcon t8 = new ImageIcon(tile8.getCurImage()); Tile8.setIcon(t8);
      tile9 = g.getAt(1,1);ImageIcon t9 = new ImageIcon(tile9.getCurImage()); Tile9.setIcon(t9);
      tile10 = g.getAt(1,2);ImageIcon t10 = new ImageIcon(tile10.getCurImage()); Tile10.setIcon(t10);
      tile11 = g.getAt(1,3);ImageIcon t11 = new ImageIcon(tile11.getCurImage()); Tile11.setIcon(t11);
      tile12 = g.getAt(1,4);ImageIcon t12 = new ImageIcon(tile12.getCurImage()); Tile12.setIcon(t12);
      tile13 = g.getAt(1,5);ImageIcon t13 = new ImageIcon(tile13.getCurImage()); Tile13.setIcon(t13);
      tile14 = g.getAt(1,6);ImageIcon t14 = new ImageIcon(tile14.getCurImage()); Tile14.setIcon(t14);
      

     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }

  //Button for First Left
  class ButtonListener6 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      
      tile50 = g.insert(tile50,1,1,2);
      //Link the 49 tile labels with the 49 tiles in the grid
      
      tile8 = g.getAt(1,0);ImageIcon t8 = new ImageIcon(tile8.getCurImage()); Tile8.setIcon(t8);
      tile9 = g.getAt(1,1);ImageIcon t9 = new ImageIcon(tile9.getCurImage()); Tile9.setIcon(t9);
      tile10 = g.getAt(1,2);ImageIcon t10 = new ImageIcon(tile10.getCurImage()); Tile10.setIcon(t10);
      tile11 = g.getAt(1,3);ImageIcon t11 = new ImageIcon(tile11.getCurImage()); Tile11.setIcon(t11);
      tile12 = g.getAt(1,4);ImageIcon t12 = new ImageIcon(tile12.getCurImage()); Tile12.setIcon(t12);
      tile13 = g.getAt(1,5);ImageIcon t13 = new ImageIcon(tile13.getCurImage()); Tile13.setIcon(t13);
      tile14 = g.getAt(1,6);ImageIcon t14 = new ImageIcon(tile14.getCurImage()); Tile14.setIcon(t14);
     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }

  //Button for First Up
  class ButtonListener7 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      
      tile50 = g.insert(tile50,1,1,3);
      //Link the 49 tile labels with the 49 tiles in the grid
      
      tile2 = g.getAt(0,1);ImageIcon t2 = new ImageIcon(tile2.getCurImage()); Tile2.setIcon(t2);
      tile9 = g.getAt(1,1);ImageIcon t9 = new ImageIcon(tile9.getCurImage()); Tile9.setIcon(t9);
      tile16 = g.getAt(2,1);ImageIcon t16 = new ImageIcon(tile16.getCurImage()); Tile16.setIcon(t16);
      tile23 = g.getAt(3,1);ImageIcon t23 = new ImageIcon(tile23.getCurImage()); Tile23.setIcon(t23);
      tile30 = g.getAt(4,1);ImageIcon t30 = new ImageIcon(tile30.getCurImage()); Tile30.setIcon(t30);
      tile37 = g.getAt(5,1);ImageIcon t37 = new ImageIcon(tile37.getCurImage()); Tile37.setIcon(t37);
      tile44 = g.getAt(6,1);ImageIcon t44 = new ImageIcon(tile44.getCurImage()); Tile44.setIcon(t44);   
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Second Down
  class ButtonListener8 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,1,3,1);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile4 = g.getAt(0,3);ImageIcon t4 = new ImageIcon(tile4.getCurImage()); Tile4.setIcon(t4);
      tile11 = g.getAt(1,3);ImageIcon t11 = new ImageIcon(tile11.getCurImage()); Tile11.setIcon(t11);
      tile18 = g.getAt(2,3);ImageIcon t18 = new ImageIcon(tile18.getCurImage()); Tile18.setIcon(t18);
      tile25 = g.getAt(3,3);ImageIcon t25 = new ImageIcon(tile25.getCurImage()); Tile25.setIcon(t25);
      tile32 = g.getAt(4,3);ImageIcon t32 = new ImageIcon(tile32.getCurImage()); Tile32.setIcon(t32);
      tile39 = g.getAt(5,3);ImageIcon t39 = new ImageIcon(tile39.getCurImage()); Tile39.setIcon(t39);
      tile46 = g.getAt(6,3);ImageIcon t46 = new ImageIcon(tile46.getCurImage()); Tile46.setIcon(t46);
           
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Second Right
  class ButtonListener9 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,3,1,4);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile22 = g.getAt(3,0);ImageIcon t22 = new ImageIcon(tile22.getCurImage()); Tile22.setIcon(t22);
      tile23 = g.getAt(3,1);ImageIcon t23 = new ImageIcon(tile23.getCurImage()); Tile23.setIcon(t23);
      tile24 = g.getAt(3,2);ImageIcon t24 = new ImageIcon(tile24.getCurImage()); Tile24.setIcon(t24);
      tile25 = g.getAt(3,3);ImageIcon t25 = new ImageIcon(tile25.getCurImage()); Tile25.setIcon(t25);
      tile26 = g.getAt(3,4);ImageIcon t26 = new ImageIcon(tile26.getCurImage()); Tile26.setIcon(t26);
      tile27 = g.getAt(3,5);ImageIcon t27 = new ImageIcon(tile27.getCurImage()); Tile27.setIcon(t27);
      tile28 = g.getAt(3,6);ImageIcon t28 = new ImageIcon(tile28.getCurImage()); Tile28.setIcon(t28);
     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Second Left
  class ButtonListener10 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,3,1,2);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile22 = g.getAt(3,0);ImageIcon t22 = new ImageIcon(tile22.getCurImage()); Tile22.setIcon(t22);
      tile23 = g.getAt(3,1);ImageIcon t23 = new ImageIcon(tile23.getCurImage()); Tile23.setIcon(t23);
      tile24 = g.getAt(3,2);ImageIcon t24 = new ImageIcon(tile24.getCurImage()); Tile24.setIcon(t24);
      tile25 = g.getAt(3,3);ImageIcon t25 = new ImageIcon(tile25.getCurImage()); Tile25.setIcon(t25);
      tile26 = g.getAt(3,4);ImageIcon t26 = new ImageIcon(tile26.getCurImage()); Tile26.setIcon(t26);
      tile27 = g.getAt(3,5);ImageIcon t27 = new ImageIcon(tile27.getCurImage()); Tile27.setIcon(t27);
      tile28 = g.getAt(3,6);ImageIcon t28 = new ImageIcon(tile28.getCurImage()); Tile28.setIcon(t28);
     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Second Up
  class ButtonListener11 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,1,3,3);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile4 = g.getAt(0,3);ImageIcon t4 = new ImageIcon(tile4.getCurImage()); Tile4.setIcon(t4);
      tile11 = g.getAt(1,3);ImageIcon t11 = new ImageIcon(tile11.getCurImage()); Tile11.setIcon(t11);
      tile18 = g.getAt(2,3);ImageIcon t18 = new ImageIcon(tile18.getCurImage()); Tile18.setIcon(t18);
      tile25 = g.getAt(3,3);ImageIcon t25 = new ImageIcon(tile25.getCurImage()); Tile25.setIcon(t25);
      tile32 = g.getAt(4,3);ImageIcon t32 = new ImageIcon(tile32.getCurImage()); Tile32.setIcon(t32);
      tile39 = g.getAt(5,3);ImageIcon t39 = new ImageIcon(tile39.getCurImage()); Tile39.setIcon(t39);
      tile46 = g.getAt(6,3);ImageIcon t46 = new ImageIcon(tile46.getCurImage()); Tile46.setIcon(t46);
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for First Down
  class ButtonListener12 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,1,1,1);
      //Link the 49 tile labels with the 49 tiles in the grid
      
      tile2 = g.getAt(0,1);ImageIcon t2 = new ImageIcon(tile2.getCurImage()); Tile2.setIcon(t2);
      tile9 = g.getAt(1,1);ImageIcon t9 = new ImageIcon(tile9.getCurImage()); Tile9.setIcon(t9);
      tile16 = g.getAt(2,1);ImageIcon t16 = new ImageIcon(tile16.getCurImage()); Tile16.setIcon(t16);
      tile23 = g.getAt(3,1);ImageIcon t23 = new ImageIcon(tile23.getCurImage()); Tile23.setIcon(t23);
      tile30 = g.getAt(4,1);ImageIcon t30 = new ImageIcon(tile30.getCurImage()); Tile30.setIcon(t30);
      tile37 = g.getAt(5,1);ImageIcon t37 = new ImageIcon(tile37.getCurImage()); Tile37.setIcon(t37);
      tile44 = g.getAt(6,1);ImageIcon t44 = new ImageIcon(tile44.getCurImage()); Tile44.setIcon(t44);
          //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Last Right
  class ButtonListener13 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,5,1,4);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile36 = g.getAt(5,0);ImageIcon t36 = new ImageIcon(tile36.getCurImage()); Tile36.setIcon(t36);
      tile37 = g.getAt(5,1);ImageIcon t37 = new ImageIcon(tile37.getCurImage()); Tile37.setIcon(t37);
      tile38 = g.getAt(5,2);ImageIcon t38 = new ImageIcon(tile38.getCurImage()); Tile38.setIcon(t38);
      tile39 = g.getAt(5,3);ImageIcon t39 = new ImageIcon(tile39.getCurImage()); Tile39.setIcon(t39);
      tile40 = g.getAt(5,4);ImageIcon t40 = new ImageIcon(tile40.getCurImage()); Tile40.setIcon(t40);
      tile41 = g.getAt(5,5);ImageIcon t41 = new ImageIcon(tile41.getCurImage()); Tile41.setIcon(t41);
      tile42 = g.getAt(5,6);ImageIcon t42 = new ImageIcon(tile42.getCurImage()); Tile42.setIcon(t42);
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Last Left
  class ButtonListener14 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,5,1,2);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile36 = g.getAt(5,0);ImageIcon t36 = new ImageIcon(tile36.getCurImage()); Tile36.setIcon(t36);
      tile37 = g.getAt(5,1);ImageIcon t37 = new ImageIcon(tile37.getCurImage()); Tile37.setIcon(t37);
      tile38 = g.getAt(5,2);ImageIcon t38 = new ImageIcon(tile38.getCurImage()); Tile38.setIcon(t38);
      tile39 = g.getAt(5,3);ImageIcon t39 = new ImageIcon(tile39.getCurImage()); Tile39.setIcon(t39);
      tile40 = g.getAt(5,4);ImageIcon t40 = new ImageIcon(tile40.getCurImage()); Tile40.setIcon(t40);
      tile41 = g.getAt(5,5);ImageIcon t41 = new ImageIcon(tile41.getCurImage()); Tile41.setIcon(t41);
      tile42 = g.getAt(5,6);ImageIcon t42 = new ImageIcon(tile42.getCurImage()); Tile42.setIcon(t42);
     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  //Button for Last Up
  class ButtonListener15 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      tile50 = g.insert(tile50,1,5,3);
      //Link the 49 tile labels with the 49 tiles in the grid
      tile6 = g.getAt(0,5);ImageIcon t6 = new ImageIcon(tile6.getCurImage()); Tile6.setIcon(t6);
      tile13 = g.getAt(1,5);ImageIcon t13 = new ImageIcon(tile13.getCurImage()); Tile13.setIcon(t13);      
      tile20 = g.getAt(2,5);ImageIcon t20 = new ImageIcon(tile20.getCurImage()); Tile20.setIcon(t20);      
      tile27 = g.getAt(3,5);ImageIcon t27 = new ImageIcon(tile27.getCurImage()); Tile27.setIcon(t27);      
      tile34 = g.getAt(4,5);ImageIcon t34 = new ImageIcon(tile34.getCurImage()); Tile34.setIcon(t34);     
      tile41 = g.getAt(5,5);ImageIcon t41 = new ImageIcon(tile41.getCurImage()); Tile41.setIcon(t41);      
      tile48 = g.getAt(6,5);ImageIcon t48 = new ImageIcon(tile48.getCurImage()); Tile48.setIcon(t48);
     
      
      //Code for the spare Tile
      ImageIcon tileI = new ImageIcon(tile50.getCurImage());
      Tile50.setIcon(tileI);
      
      pack();
     }
     
  }
  
  //Button for Player Movement
  class ButtonListener16 implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String xs = textfield.getText();
      String ys = textfield2.getText();
      
      int x = Integer.parseInt(xs);
      int y = Integer.parseInt(ys);
      
     
      g.attemptMove(x,y,2);
      
      
      
      
      
      //Link the 49 tile labels with the 49 tiles in the grid
      tile1 = g.getAt(0,0);ImageIcon t1 = new ImageIcon(tile1.getCurImage()); Tile.setIcon(t1);
      tile2 = g.getAt(0,1);ImageIcon t2 = new ImageIcon(tile2.getCurImage()); Tile2.setIcon(t2);
      tile3 = g.getAt(0,2);ImageIcon t3 = new ImageIcon(tile3.getCurImage()); Tile3.setIcon(t3);
      tile4 = g.getAt(0,3);ImageIcon t4 = new ImageIcon(tile4.getCurImage()); Tile4.setIcon(t4);
      tile5 = g.getAt(0,4);ImageIcon t5 = new ImageIcon(tile5.getCurImage()); Tile5.setIcon(t5);
      tile6 = g.getAt(0,5);ImageIcon t6 = new ImageIcon(tile6.getCurImage()); Tile6.setIcon(t6);
      tile7 = g.getAt(0,6);ImageIcon t7 = new ImageIcon(tile7.getCurImage()); Tile7.setIcon(t7);
      
      tile8 = g.getAt(1,0);ImageIcon t8 = new ImageIcon(tile8.getCurImage()); Tile8.setIcon(t8);
      tile9 = g.getAt(1,1);ImageIcon t9 = new ImageIcon(tile9.getCurImage()); Tile9.setIcon(t9);
      tile10 = g.getAt(1,2);ImageIcon t10 = new ImageIcon(tile10.getCurImage()); Tile10.setIcon(t10);
      tile11 = g.getAt(1,3);ImageIcon t11 = new ImageIcon(tile11.getCurImage()); Tile11.setIcon(t11);
      tile12 = g.getAt(1,4);ImageIcon t12 = new ImageIcon(tile12.getCurImage()); Tile12.setIcon(t12);
      tile13 = g.getAt(1,5);ImageIcon t13 = new ImageIcon(tile13.getCurImage()); Tile13.setIcon(t13);
      tile14 = g.getAt(1,6);ImageIcon t14 = new ImageIcon(tile14.getCurImage()); Tile14.setIcon(t14);
      
      tile15 = g.getAt(2,0);ImageIcon t15 = new ImageIcon(tile15.getCurImage()); Tile15.setIcon(t15);
      tile16 = g.getAt(2,1);ImageIcon t16 = new ImageIcon(tile16.getCurImage()); Tile16.setIcon(t16);
      tile17 = g.getAt(2,2);ImageIcon t17 = new ImageIcon(tile17.getCurImage()); Tile17.setIcon(t17);
      tile18 = g.getAt(2,3);ImageIcon t18 = new ImageIcon(tile18.getCurImage()); Tile18.setIcon(t18);
      tile19 = g.getAt(2,4);ImageIcon t19 = new ImageIcon(tile19.getCurImage()); Tile19.setIcon(t19);
      tile20 = g.getAt(2,5);ImageIcon t20 = new ImageIcon(tile20.getCurImage()); Tile20.setIcon(t20);
      tile21 = g.getAt(2,6);ImageIcon t21 = new ImageIcon(tile21.getCurImage()); Tile21.setIcon(t21);
      
      tile22 = g.getAt(3,0);ImageIcon t22 = new ImageIcon(tile22.getCurImage()); Tile22.setIcon(t22);
      tile23 = g.getAt(3,1);ImageIcon t23 = new ImageIcon(tile23.getCurImage()); Tile23.setIcon(t23);
      tile24 = g.getAt(3,2);ImageIcon t24 = new ImageIcon(tile24.getCurImage()); Tile24.setIcon(t24);
      tile25 = g.getAt(3,3);ImageIcon t25 = new ImageIcon(tile25.getCurImage()); Tile25.setIcon(t25);
      tile26 = g.getAt(3,4);ImageIcon t26 = new ImageIcon(tile26.getCurImage()); Tile26.setIcon(t26);
      tile27 = g.getAt(3,5);ImageIcon t27 = new ImageIcon(tile27.getCurImage()); Tile27.setIcon(t27);
      tile28 = g.getAt(3,6);ImageIcon t28 = new ImageIcon(tile28.getCurImage()); Tile28.setIcon(t28);
      
      tile29 = g.getAt(4,0);ImageIcon t29 = new ImageIcon(tile29.getCurImage()); Tile29.setIcon(t29);
      tile30 = g.getAt(4,1);ImageIcon t30 = new ImageIcon(tile30.getCurImage()); Tile30.setIcon(t30);
      tile31 = g.getAt(4,2);ImageIcon t31 = new ImageIcon(tile31.getCurImage()); Tile31.setIcon(t31);
      tile32 = g.getAt(4,3);ImageIcon t32 = new ImageIcon(tile32.getCurImage()); Tile32.setIcon(t32);
      tile33 = g.getAt(4,4);ImageIcon t33 = new ImageIcon(tile33.getCurImage()); Tile33.setIcon(t33);
      tile34 = g.getAt(4,5);ImageIcon t34 = new ImageIcon(tile34.getCurImage()); Tile34.setIcon(t34);
      tile35 = g.getAt(4,6);ImageIcon t35 = new ImageIcon(tile35.getCurImage()); Tile35.setIcon(t35);
      
      tile36 = g.getAt(5,0);ImageIcon t36 = new ImageIcon(tile36.getCurImage()); Tile36.setIcon(t36);
      tile37 = g.getAt(5,1);ImageIcon t37 = new ImageIcon(tile37.getCurImage()); Tile37.setIcon(t37);
      tile38 = g.getAt(5,2);ImageIcon t38 = new ImageIcon(tile38.getCurImage()); Tile38.setIcon(t38);
      tile39 = g.getAt(5,3);ImageIcon t39 = new ImageIcon(tile39.getCurImage()); Tile39.setIcon(t39);
      tile40 = g.getAt(5,4);ImageIcon t40 = new ImageIcon(tile40.getCurImage()); Tile40.setIcon(t40);
      tile41 = g.getAt(5,5);ImageIcon t41 = new ImageIcon(tile41.getCurImage()); Tile41.setIcon(t41);
      tile42 = g.getAt(5,6);ImageIcon t42 = new ImageIcon(tile42.getCurImage()); Tile42.setIcon(t42);
      
      tile43 = g.getAt(6,0);ImageIcon t43 = new ImageIcon(tile43.getCurImage()); Tile43.setIcon(t43);
      tile44 = g.getAt(6,1);ImageIcon t44 = new ImageIcon(tile44.getCurImage()); Tile44.setIcon(t44);
      tile45 = g.getAt(6,2);ImageIcon t45 = new ImageIcon(tile45.getCurImage()); Tile45.setIcon(t45);
      tile46 = g.getAt(6,3);ImageIcon t46 = new ImageIcon(tile46.getCurImage()); Tile46.setIcon(t46);
      tile47 = g.getAt(6,4);ImageIcon t47 = new ImageIcon(tile47.getCurImage()); Tile47.setIcon(t47);
      tile48 = g.getAt(6,5);ImageIcon t48 = new ImageIcon(tile48.getCurImage()); Tile48.setIcon(t48);
      tile49 = g.getAt(6,6);ImageIcon t49 = new ImageIcon(tile49.getCurImage()); Tile49.setIcon(t49);
      
      pack();
     }
     
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