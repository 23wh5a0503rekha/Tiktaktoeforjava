import java.util.*;
public class tiktactoe{
    public static void main(String [] args)
    {
       char[][] board=new char[3][3];
       for(int r=0;r<board.length;r++)
       {
        for(int c=0;c<board[r].length;c++)
        {
            board[r][c]=' ';
        }
       }
       char player='X';
       boolean gameOver=false;
       Scanner sc=new Scanner(System.in);
       while(!gameOver)
       {
        printboard(board);
        System.out.println("player" +player +" Enter:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(board[row][col]==' ')
        {
           board[row][col]=player;
           gameOver = haveWon(board,player);
           if(gameover)
           {
            System.out.println("player" +player+" has won");
           }
           else{
           if(player=='X')
           {
            player='O';
           }
           else{
            player='X';
           }

           }
        }
        else{
            System.out.println("Invalid move");
        }
       }
    }
    public boolean haveWon(char[][]board,int player)
    {
        //row
        for(int r=0;r<board.length;r++)
        {
         if(board[r][1]==player && board[r][1]==player && board[r][2]==player)
         {
            return true;
         }
       }
       //col
        for(int c=0;c<board[r].length;c++)
        {
            if(board[0][c]==player && board[1][c]==player && board[2][c]==player)
         {
            return true;
         } 
        }
        //diagonal
        if(board[0][0] ==palyer && board[1][1]==player && board[2][2]==player)
        {
            return true;
        }
        if(board[0][2] ==palyer && board[1][1]==player && board[2][0]==player)
        {
            return true;
        }
    }
    
    public static void printboard(char [][] board)
    {
        for(int r=0;r<board.length;r++)
       {
        for(int c=0;c<board[r].length;c++)
        {
           System.out.println(board[r][c]+" ");
        }
        System.out.println();
       }
           
    }