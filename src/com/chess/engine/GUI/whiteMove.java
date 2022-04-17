package com.chess.engine.GUI;

public class whiteMove {
    static short stepInTern = 0;
    static int previousSquare;
    static int nextSquare;
    static String nameOfThePiece;
    

    public whiteMove(){
        
    }

    public static void Move(square sq){

            if(stepInTern == 0)
            {
                previousSquare = sq.getId();
                nameOfThePiece = sq.getName();
                stepInTern = 1;
            }
        else{
            nextSquare = sq.getId();
            stepInTern = 0;
            System.out.println(previousSquare + "->" + nextSquare + "name" + nameOfThePiece);
            //chessboard.getSquare(previousSquare);
        }
    }

    
    
}
