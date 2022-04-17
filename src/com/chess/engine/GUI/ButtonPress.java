package com.chess.engine.GUI;
import java.awt.event.ActionListener;
import java.util.IdentityHashMap;
import java.awt.event.ActionEvent;

public class ButtonPress implements ActionListener
{
    square sq;
    ButtonPress(square sq){
        this.sq = sq;
    }


    //this is what happens went a button pressed
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("button pressed");
        
        whiteMove.Move(sq);
        
    }

}

