/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictoc;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Sufyan
 */
public class Player {

private String [] players;
private String currentPlayer;
Player (String pname )
{
players= new String[]{"Computer",pname};


}

 public String getPlayerName(int i)
 {
 if(i>-1&&i<2)
     return players[i];
 else return"Invalid argument";
 
 }
 public String toss()
 {
 int x = (int)Math.floor(Math.random()*2);
 return players[x];
 
 }
 public String nextPlayer(int i)
 {
    switch (i)
    {
     case 0:
         return players[1];
     case 1:
         return players[0];
         
 
    }
    return "Invalid";
 
 }
 
 public String playerMove()
 {
 
 
return JOptionPane.showInputDialog("Enter cell index-seprated by ',' (1,0)");
 
 }
 
 public int currentPlayer(String s)
 {
 
 return Arrays.asList(players).indexOf(s);
 
 }
}
