package com.chess.engine.board;
import java.util.HashMap;
import java.util.Map;

import com.chess.engine.pieces.Piece;

public abstract class Square {
    protected final int squareCoordinate;

    private static final Map<Integer,EmptySquare> EMPTY_SQUARE_CACHE = createAllEmptySquares();
    private static Map<Integer, EmptySquare> createAllEmptySquares() {
        final Map<Integer,EmptySquare> emptySquareMap = new HashMap<>();
        for (int i = 0; i < 64; i++) {
            emptySquareMap.put(i, new EmptySquare(i));
            return emptySquareMap;
        }
        return null;
    }
    

public static Square createSquare(final int squareCoordinate,final Piece piece) {
    return piece != null ? new OccupiedSquare(squareCoordinate, piece) : EMPTY_SQUARE_CACHE.get(squareCoordinate);
}


   private Square(int squareCoordinate) {
        this.squareCoordinate = squareCoordinate;
    }
    public abstract boolean isOccupied();

    public abstract Piece getPiece();

    public static final class EmptySquare extends Square {
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
    public static final class OccupiedSquare extends Square {
        
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
