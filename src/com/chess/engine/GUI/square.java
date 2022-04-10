package src;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.*;
public class square {
        private int id;
        private int color;
        private String name;
        JButton button = new JButton();

        Color White = new Color(255, 206, 158);
        Color Black = new Color(209, 139, 71);


        public square(int id, int color,String name){
            this.id = id;
            this.color = color;
            this.name = name;

            //Button's icon
            this.updateSquare();
            
        //FOR TESTING PURPOSES text
            button.setText(String.valueOf(id));

            //Button's size
            button.setSize(50,50);

            //Button's color
            if(color == 0){
                button.setBackground(White);
            }
            else{
                button.setBackground(Black);
            }
            
            //button's size
            button.setPreferredSize(new Dimension(100, 100));
            //action listener
            ButtonPress buttonEar = new ButtonPress(this);

            button.addActionListener(buttonEar);
            
            //add button to chessboard
            button.setVisible(true);
        }


        public JButton getButton(){
            return button;
        }

        public void updateSquare(){
            if(name == "white_king"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/white_king45.png");
                button.setIcon(icon);
            }
            else if(name == "white_queen"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/white_qlt45.png");
                button.setIcon(icon);
            }
            else if(name == "white_rook"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/white_rlt45.png");
                button.setIcon(icon);
            }
            else if(name == "white_bishop"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/white_blt45.png");
                button.setIcon(icon);
            }
            else if(name == "white_knight"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/white_nlt45.png");
                button.setIcon(icon);
            }
            else if(name == "white_pawn"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/white_plt45.png");                
                button.setIcon(icon);
            }
            else if(name == "black_king"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/black_king45.png");
                button.setIcon(icon);
            }
            else if(name == "black_queen"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/black_qdt45.png");
                button.setIcon(icon);
            }
            else if(name == "black_rook"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/black_rdt45.png");
                button.setIcon(icon);
            }
            else if(name == "black_bishop"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/black_bdt45.png");
                button.setIcon(icon);
            }
            else if(name == "black_knight"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/black_ndt45.png");
                button.setIcon(icon);
            }
            else if(name == "black_pawn"){
                ImageIcon icon = new ImageIcon("C:/Users/mgeor/Documents/chess/icons/black_pdt45.png");
                button.setIcon(icon);
            }

        }

        //setters and getters
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public int getColor(){
            return color;
        }
        public void setColor(int color){
            this.color = color;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
                
    }
