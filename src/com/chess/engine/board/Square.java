package com.chess.engine.board;
import java.util.HashMap;
import java.util.Map;

import com.chess.engine.pieces.Piece;

public abstract class Square {
    protected final int squareCoordinate;

    private static final Map<Integer,EmptySquare> EMPTY_SQUARE_CACHE = createAllEmptySquares();// a map to contain all empty squares
    private static Map<Integer, EmptySquare> createAllEmptySquares() {//creates a map of all possible empty squares
        final Map<Integer,EmptySquare> emptySquareMap = new HashMap<>();
        for (int i = 0; i < 64;i++) {
            emptySquareMap.put(i, new EmptySquare(i));
            return emptySquareMap;
        }
        return null;
    }
public static Square createSquare(final int squareCoordinate,final Piece piece) {//creates a square
    return piece != null ? new OccupiedSquare(squareCoordinate, piece) : EMPTY_SQUARE_CACHE.get(squareCoordinate);//either returns an occupied square or points you to an empty squers position
}
   private Square(int squareCoordinate) {
        this.squareCoordinate = squareCoordinate;
    }
    public abstract boolean isOccupied();//method that checks if a square is occupied

    public abstract Piece getPiece();//a getter method for a piece

    public static final class EmptySquare extends Square {// a subClass of Square refering to an empty square. 
        private EmptySquare(final int coordinate){
            super(coordinate);
        }
        @Override
        public boolean isOccupied() {
            return false;
        }
        @Override
        public Piece getPiece() {
            return null;
        }
    }
    public static final class OccupiedSquare extends Square {//a subClass of Square refering to an occupied square.
        private final Piece pieceOnSquare;
       private OccupiedSquare(int squareCoordinate,Piece pieceOnSquare){
            super(squareCoordinate);
            this.pieceOnSquare = pieceOnSquare;
        }
        @Override
        public boolean isOccupied(){
            return true;
        }
        @Override
        public Piece getPiece(){
            return this.pieceOnSquare;
        }
    }
}
