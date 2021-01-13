package edu.cuny.csi.csc330.lab1;

/**
 * Generates a unicode textual chessboard 
 * Reference:  https://en.wikipedia.org/wiki/Chess_symbols_in_Unicode 
 * @author lji
 *
 */
public class ChessBoard
{
   //Megan McNamee CSC 330 LAB#1 ChessBoard
   // Array of pieces values Rook, Knight, Bishop, King, Queen, Bishop, Knight, Rook
   static private final char [] WHITE_PIECES =
       {
       '\u2656', '\u2658', '\u2657', '\u2655', '\u2654', '\u2657', '\u2658', '\u2656'
   };
  
   // unicode value of a pawn
   static private final char PAWN = '\u2659';
   // our choice for "empty square" - medium rectangle ...
   static private final char EMPTY = '\u25AD';
  
   private static final int ROWS = 8;
   
  
   private static final String HEADING =
           "-----------------------------------------\n"
           + "   Unicode Symbols Chessboard\n"
           + "-----------------------------------------\n";
  
   // Black piece values are equivalent white pieces + 6
   private static final int BLACK_PIECE_DISPLACEMENT = 6;
  
   static private void displayHeading()
   {
       System.out.println(HEADING);
   }
  
   private static void displayBoard()
   {
	   int chars;
       for(int row = ROWS ; row >= 1 ; --row )
       {
           System.out.printf("%-5d", row);

           if(row==8)
           {
 //Converting character set of unicode into utf-16 (\u2656 translates to 0x2656)
//Adding Black piece displacement to the utf-16 as there is no integer implementation of the unicode characters of these characters

               System.out.print((char)(0x2656+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2658+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2657+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2655+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2654+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2657+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2658+BLACK_PIECE_DISPLACEMENT));
               System.out.print(" ");
               System.out.print((char)(0x2656+BLACK_PIECE_DISPLACEMENT));
              
           }
    for(chars=0;chars<8;chars++)
    {
           if(row==1)
           {
               System.out.print(WHITE_PIECES[chars]);
           }
           if(row==2)
           {
               System.out.print(PAWN);
           }
           if(row>=3 && row<=6)
           {
               System.out.print(EMPTY);
           }
           if(row==7)
           {  
               System.out.print((char)(0x2659+BLACK_PIECE_DISPLACEMENT));
           }
           System.out.print(" ");
       }
       System.out.println();
    }
           System.out.println(""); //
   }
  
   // Only Public Method Used Directly By main()
   static public void display() 
   {
       displayHeading(); // display heading
       displayBoard();
  
   }
  
   /**
   * @param args
   */
   public static void main(String[] args)
   {
       // invoke display method
       ChessBoard.display();
   }
  
}