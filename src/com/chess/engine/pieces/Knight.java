package com.chess.engine.pieces;
import com.chess.engine.board.Board;
import com.chess.engine.board.BoardTools;
import com.chess.engine.board.Colour;
import com.chess.engine.board.Square;
import java.util.ArrayList;
import java.util.List;
public class Knight extends Piece {
    
    private final static int[] CANDIDATE_MOVE_COORDINATES = {-17,-15,-10,-6,6,10,15,17}; //storring all possible moves (Knight)
    //constructor
    Knight(int piecePosition, Colour pieceColour) {
        super(piecePosition, pieceColour);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board) { //a method that checks each possible move to see if it is valid
        int candidateDestination;
        final List<Move> legalMoves = new ArrayList<>();//the legal moves are stored in a list
        for (final int currentCandidate: CANDIDATE_MOVE_COORDINATES) {//looping through all possible moves
            candidateDestination = this.piecePosition + currentCandidate;//aplying offset
            if (BoardTools.isInBounds(candidateDestination)) {//checking if square is out of bounds
                final Square destinationSquare = board.getSquare(candidateDestination);//get the Square with this scpecidic coordinate
                if (!destinationSquare.isOccupied()) {//checks if the square is empty
                    legalMoves.add(new Move());//adds move to the list(not yet defined)#moveTypeMove
                } else { //if square is occupied...
                    final Piece pieceAtDestination = destinationSquare.getPiece();//gets the piece that occupies this square
                    final Colour pieceColour = pieceAtDestination.getColour();//gets the colour of the piece
                    if (this.pieceColour != pieceColour) {// checks if the piece isnt friendly 
                        legalMoves.add(new Move());//adds  move to list(not yet defined)#moveTypeCaptrure
                    }
                }
            }
        }
        return legalMoves;//returns the list of legal moves
    }
}
