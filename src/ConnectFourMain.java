import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by student on 5/30/18.
 */
public class ConnectFourMain extends JPanel {
    //instance fields
    private int[][] grid;
    private JButton one, two, three, four, five, six, seven;
    private boolean blue, red;


    //constructor
    public ConnectFourMain(int width, int height){
        setSize(width, height);
        grid = new int[6][7];
        blue= false;
        red= false;

        setLayout(null);
        one = new JButton("");
        add(one);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                }
            });

        one.setBounds(22, 10, 80, 40);
/////////////////////////////////////////////////////////
        setLayout(null);
        two= new JButton("");
        add(two);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        two.setBounds(125, 10, 80, 40);
/////////////////////////////////////////////////////////
        setLayout(null);
        three = new JButton("");
        add(three);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        three.setBounds(228, 10, 80, 40);
/////////////////////////////////////////////////////////
        setLayout(null);
        four = new JButton("");
        add(four);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        four.setBounds(331, 10, 80, 40);
/////////////////////////////////////////////////////////
        setLayout(null);
        five = new JButton("");
        add(five);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        five.setBounds(434, 10, 80, 40);
/////////////////////////////////////////////////////////
        setLayout(null);
        six = new JButton("");
        add(six);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        six.setBounds(537, 10, 80, 40);
/////////////////////////////////////////////////////////
        setLayout(null);
        seven = new JButton("");
        add(seven);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        seven.setBounds(640, 10, 80, 40);
/////////////////////////////////////////////////////////

        //-1 is blue, 0 is open, 1 is red
        //assigns 0 to all positions
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = 0;
            }
        }
    }

    //check if it is in the board
    public boolean isLegal(int r, int c){
        if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length)
            return true;
        return false;
    }

    public int colorPiece(){

        return 5;

    }

//    //check if win (4 in a row)
//    public boolean didWin(){
//        for (int r = 0; r < grid.length; r++) {
//            for (int c = 0; c < grid[0].length; c++) {
//                if(isLegal(r, c)){
//
//                }
//            }
//        }
//    }
//
//    //TODO: do we need this???
//    //check if 4 in a row
//    public boolean checkRow(int r){
//
//    }
//
//    //check if 4 in a col
//    public boolean checkCol(int c){
//
//    }
//
//    //check if 4 in diagonal
//    public boolean checkDiag(int d){
//
//    }
//
//    //return true if didWin is false && everything is filled up
//    public boolean didTie(){
//
//    }



    public void paintComponent(Graphics g) {
        Graphics2D g2= (Graphics2D) g;

        int squarelength= 103;
        g2.setColor(new Color(255, 255, 93));
        g2.fillRect(10,50, 7*squarelength, 6*squarelength);
        for (int r = 15; r < 7*squarelength; r= r+103) {
            for (int c =55; c < 6*squarelength; c= c+103) {
                g2.setColor(new Color(255, 255, 255));
                g2.fillOval(r, c, 90,90);
            }

        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Connect 4");
        frame.setDefaultCloseOperation(3);
        short width = 800;
        short height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));
        ConnectFourMain panel = new ConnectFourMain(width, height);
        panel.setFocusable(true);
        panel.grabFocus();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}
