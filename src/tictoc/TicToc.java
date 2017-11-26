/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictoc;

import javax.swing.JOptionPane;

/**
 *
 * @author Ans Bilal
 */
public class TicToc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // statuscode draw:0 playerwon:1 comwon:2 nextturn:3
        
        int statusCode, playerIndex;
        String currentPlayer;
        Game gm = new Game();
        Player pl = new Player(input("Enter your name"));
        currentPlayer=  pl.toss();
        print(currentPlayer +" will turn first");
         statusCode=gm.gameStatus();
         while(statusCode==3){
            
           
             print(currentPlayer+"'s turn");
        if(pl.currentPlayer(currentPlayer)==0)
        {
          if( gm.move(gm.comMove(), 0))
      currentPlayer=pl.nextPlayer(0);
        }
        else
        {
           if( gm.move(pl.playerMove(),1))
            currentPlayer =pl.nextPlayer(1);
      
        }
          statusCode=gm.gameStatus();
        }
         switch(statusCode)
         {
         
             case 0:
                 print("Draw");
                 break;
             case 1:print("You Won");break;
             case 2:print("Computer Won");break;
         
         }
       
        
    }
    
    public static void print (String s)
    {
    
        JOptionPane.showMessageDialog(null, s);
    
    
    }
    public static String input(String s)
    {
    
    return JOptionPane.showInputDialog(s);
    
    }
    
}
