package src;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;

public class chessboard {
    
    public static final int WIDTH = 300; 
    public static final int HEIGHT = 200;
    JFrame frame = new JFrame("Chess");
    ArrayList<square> squares = new ArrayList<square>();


    public chessboard()
    {
        
        //window setup
        
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8,8,5,5));
        frame.setVisible(true);
        

        //fill the chessboard with squares
        
        for (int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                square sq  = null;
                squares.add(sq);
                System.out.println(j+i*8);

                if(j+i*8 == 0 || j+i*8 == 7){
                    sq = new square(j+i*8, (j + i)%2,"black_rook");
                }
                else if(j+i*8 == 1|| j+i*8 == 6){
                    sq = new square(j+i*8, (j + i)%2,"black_knight");
                }
                else if(j+i*8 == 2 || j+i*8 == 5){
                    sq = new square(j+i*8, (j + i)%2,"black_bishop");
                }
                else if(j+i*8 == 3){
                    sq = new square(j+i*8, (j + i)%2,"black_queen");
                }
                else if(j+i*8 == 4){
                    sq = new square(j+i*8, (j + i)%2,"black_king");
                }
                else if(j+i*8 > 7 && j+i*8 < 16){
                    sq = new square(j+i*8, (j + i)%2,"black_pawn");
                }
                else if(j+i*8 == 56 || j+i*8 == 63){
                    sq = new square(j+i*8, (j + i)%2,"white_rook");
                }
                else if(j+i*8 == 57|| j+i*8 == 62){
                    sq = new square(j+i*8, (j + i)%2,"white_knight");
                }
                else if(j+i*8 == 58 || j+i*8 == 61){
                    sq = new square(j+i*8, (j + i)%2,"white_bishop");
                }
                else if(j+i*8 == 59){
                    sq = new square(j+i*8, (j + i)%2,"white_queen");
                }
                else if(j+i*8 == 60){
                    sq = new square(j+i*8, (j + i)%2,"white_king");
                }
                else if(j+i*8 > 47 && j+i*8 < 56){
                    sq = new square(j+i*8, (j + i)%2,"white_pawn");
                    

                }
                else{
                    sq = new square(j+i*8, (j + i)%2,"");
                }
                
                frame.add(sq.getButton());
            }
        }
        frame.pack(); 
    
    

    
    }
    public square getSquare(int id){
        return squares.get(id);
    }
}