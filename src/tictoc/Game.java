/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictoc;

/**
 *
 * @author Sufyan
 */
public class Game extends Board{

private String[][] marksArray;
Game()
{
marksArray=new String[][]{{"","",""},{"","",""},{"","",""}};

}


public boolean move(String index,int player)
{
int x,y;
Board br =new Board();
if(validateCell(index))
{
                    String[]tokens= index.split(",");
                    x=Integer.parseInt(tokens[0]);
                    y=Integer.parseInt(tokens[1]);
                    if (player==0)
                        marksArray[x][y]="O";
                    else if (player==1)
                        marksArray[x][y]="X";
                    
                    
                    
                    br.printBoard(marksArray);
                    return true;

}
return false;


}







private boolean validateCell(String s)
{
        int x,y;
        try {
            if (s.contains(","))
                {
                    String[]tokens= s.split(",");
                    x=Integer.parseInt(tokens[0]);
                    y=Integer.parseInt(tokens[1]);
                    if(x<0||x>2||y<0||y>2)
                        return false;
                    else
                    if (!marksArray[x][y].equals(""))
                    return false;
                    else
                        return true;


               }
            else
                return false;
            }
        catch (Exception ex)
        {
        return false;
        }


}




 public int gameStatus()
 {
     int draw=0;
     int playerWon=1;
     int comWon=2;
     int nextTurn=3;
     
      if(playerWonTest())
         return playerWon;
     else if(comWonTest())
         return comWon;
     else if (turnTest())
         return nextTurn;
      else
         return draw;
     
       
 
 
 }
 private boolean turnTest()
 {
     boolean tt= false;
 for(int x =0; x<3;x++)
     {
     for (int y =0;y<3;y++)
     {
         if(marksArray[x][y].equals(""))
             tt=true;
     
     }
     
     }
 return tt;
 
 }

private boolean playerWonTest()
{
String symbol="X";
if (    (marksArray[0][0].equals(symbol)&&marksArray[0][1].equals(symbol)&&marksArray[0][2].equals(symbol)) ||//first row
        (marksArray[1][0].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[1][2].equals(symbol)) ||//second row
        (marksArray[2][0].equals(symbol)&&marksArray[2][1].equals(symbol)&&marksArray[2][2].equals(symbol)) ||//third row
        (marksArray[0][0].equals(symbol)&&marksArray[1][0].equals(symbol)&&marksArray[2][0].equals(symbol)) ||//first column
        (marksArray[0][1].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[2][1].equals(symbol)) ||//second column
        (marksArray[0][2].equals(symbol)&&marksArray[1][2].equals(symbol)&&marksArray[2][2].equals(symbol)) ||//third column
        (marksArray[0][0].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[2][2].equals(symbol)) ||//diagonal
        (marksArray[0][2].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[2][0].equals(symbol))   //non diagonal   
        )
return true;
else return false;
}

private boolean comWonTest()
{
String symbol="O";
if (    (marksArray[0][0].equals(symbol)&&marksArray[0][1].equals(symbol)&&marksArray[0][2].equals(symbol)) ||//first row
        (marksArray[1][0].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[1][2].equals(symbol)) ||//second row
        (marksArray[2][0].equals(symbol)&&marksArray[2][1].equals(symbol)&&marksArray[2][2].equals(symbol)) ||//third row
        (marksArray[0][0].equals(symbol)&&marksArray[1][0].equals(symbol)&&marksArray[2][0].equals(symbol)) ||//first column
        (marksArray[0][1].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[2][1].equals(symbol)) ||//second column
        (marksArray[0][2].equals(symbol)&&marksArray[1][2].equals(symbol)&&marksArray[2][2].equals(symbol)) ||//third column
        (marksArray[0][0].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[2][2].equals(symbol)) ||//diagonal
        (marksArray[0][2].equals(symbol)&&marksArray[1][1].equals(symbol)&&marksArray[2][0].equals(symbol))   //non diagonal   
        )
return true;
else return false;
}

public String comMove()
{
 int x, y;
 String m ="";
    boolean i = true;
    while(i)
    {
     
    x= (int)Math.floor(Math.random()*3);
    y= (int)Math.floor(Math.random()*3);
    m=x+","+y;
    if(validateCell(m))
    {
    i= false;
  
    
    }
    else i= true;
    
    }
  return m;


}


}

