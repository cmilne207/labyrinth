import java.util.Random;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;


public class Grid_Gui extends JFrame 
{
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
  
  private ImageIcon back = new ImageIcon("Tile1.jpg");
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
  private JLabel Tile48 = new JLabel(back); 
 
  
  Tile tile1; Tile tile2; Tile tile3; Tile tile4; Tile tile5; Tile tile6; Tile tile7; 
  Tile tile8; Tile tile9; Tile tile10; Tile tile11; Tile tile12; Tile tile13; Tile tile14; 
  Tile tile15; Tile tile16; Tile tile17; Tile tile18; Tile tile19; Tile tile20; Tile tile21; 
  Tile tile22; Tile tile23; Tile tile24; Tile tile25; Tile tile26; Tile tile27; Tile tile28; 
  Tile tile29; Tile tile30; Tile tile31; Tile tile32; Tile tile33; Tile tile34; Tile tile35; 
  Tile tile36; Tile tile37; Tile tile38; Tile tile39; Tile tile40; Tile tile41; Tile tile42; 
  Tile tile43; Tile tile44; Tile tile45; Tile tile46; Tile tile47; Tile tile48; Tile tile49; 
 
  public Grid_Gui()
  { setTitle("Labrynth Game");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new GridLayout(7,7));
    
    //Build the Panels
    buildTilePanels();
    
    add(TilePanel1); add(TilePanel2); add(TilePanel3) ;add(TilePanel4); add(TilePanel5); add(TilePanel6); add(TilePanel7);
    add(TilePanel8); add(TilePanel9); add(TilePanel10) ;add(TilePanel11); add(TilePanel12); add(TilePanel13); add(TilePanel14);
    add(TilePanel15); add(TilePanel16); add(TilePanel17) ;add(TilePanel18); add(TilePanel19); add(TilePanel20); add(TilePanel21);
    add(TilePanel22); add(TilePanel23); add(TilePanel24) ;add(TilePanel25); add(TilePanel26); add(TilePanel27); add(TilePanel28);
    add(TilePanel29); add(TilePanel30); add(TilePanel31) ;add(TilePanel32); add(TilePanel33); add(TilePanel34); add(TilePanel35);
    add(TilePanel36); add(TilePanel37); add(TilePanel38) ;add(TilePanel39); add(TilePanel40); add(TilePanel41); add(TilePanel42);
    add(TilePanel43); add(TilePanel44); add(TilePanel45) ;add(TilePanel46); add(TilePanel47); add(TilePanel48); add(TilePanel49);
    
    
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
   TilePanel49 = new JPanel(); TilePanel49.add(Tile49); 

   
  
  
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