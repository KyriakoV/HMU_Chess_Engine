package com.chess.engine.pieces;

import java.util.List;
import com.chess.engine.board.Board;
import com.chess.engine.board.Colour;

public abstract class Piece {
    protected final int piecePosition;
    protected final Colour pieceColour;

    Piece(final int piecePosition,final Colour pieceColour) {
        this.piecePosition = piecePosition;
        this.pieceColour = pieceColour;
    }
    public Colour getColour() {
        return this.pieceColour;
    }
    public abstract List<Move> calculateLegalMoves(final Board board);
}
