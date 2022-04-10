package com.chess.engine.board;

public class BoardTools {
    

    
    private BoardTools() {
        throw new RuntimeException("you can not instantiate this");
    }
    public static boolean isInBounds(int coordinate) {
        return coordinate >= 0 && coordinate < 64;
    }

}
