import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * Created by student on 5/30/18.
 */
public class ConnectFourMain extends JPanel {
    //instance fields
    private int[][] grid;
    private int turn = 0;
    private JButton one, two, three, four, five, six, seven;
    private boolean[][] red, blue;


    //constructor
    public ConnectFourMain(int width, int height){
        setSize(width, height);
        grid = new int[6][7];
        red= new boolean[6][7];
        blue= new boolean[6][7];

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
                for (int r = 0; r < grid.length; r++) {
                    turnCounter();
                    int hi = grid.length - 1;
                    int lo = 0;
                    int mid = 0;
                    while(lo <= hi){
                        mid = (hi + lo)/2;
                        if(grid[mid][4] == 0){
                            lo = mid + 1;
                        }else{
                            hi = mid - 1;
                        }
                    }
                        grid[mid][4] = turn; // returns the most recent 0 spot whatever
                }
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
                for (int r = 0; r < grid.length; r++) {
                    turnCounter();
                    int hi = grid.length - 1;
                    int lo = 0;
                    int mid = 0;
                    while(lo <= hi){
                        mid = (hi + lo)/2;
                        if(grid[mid][5] == 0){
                            lo = mid + 1;
                        }else{
                            hi = mid - 1;
                        }
                    }
                    grid[mid][5] = turn; // returns the most recent 0 spot whatever
                }
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
                for (int r = 0; r < grid.length; r++) {
                    turnCounter();
                    int hi = grid.length - 1;
                    int lo = 0;
                    int mid = 0;
                    while(lo <= hi){
                        mid = (hi + lo)/2;
                        if(grid[mid][6] == 0){
                            lo = mid + 1;
                        }else{
                            hi = mid - 1;
                        }
                    }
                    grid[mid][6] = turn; // returns the most recent 0 spot whatever
                }
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

        //-1 is blue, 0 is open, 1 is red
        //assigns 0 to all positions
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = 0;
            }
        }

//        this.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//            }
//
//            public void mousePressed(MouseEvent e) {
//                int x = e.getX();
//                int y = e.getY();
//                int w = ConnectFourMain.this.getWidth() / 3;
//                int h = ConnectFourMain.this.getHeight() / 3;
//                int r = y / h;
//                int c = x / w;
//
//                    ConnectFourMain.this.turnCounter();
//
//                ConnectFourMain.this.repaint();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//            }
//
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            public void mouseExited(MouseEvent e) {
//            }
//        });

    }

    //check if it is in the board
    public boolean isLegal(int r, int c){
        if(r >= 0 && r < grid.length && c >= 0 && c < grid[0].length)
            return true;
        return false;
    }

    //TODO
    //check if win (4 in a row)
    public boolean didWin(){
        if(checkRow() || checkCol() || checkDiagA() || checkDiagB())
            return true;
        return false;
    }

    //return true if didWin is false && everything is filled up
//    public boolean didTie(){
//
//    }

    //TODO: do we need this???
    //check if 4 in a row
    public boolean checkRow(){
        Piece a = new Piece (1); //TODO: move that to other places cause not making new piece in check
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                while(count < 4){
                    if(isLegal(r, c) && grid[r][c] == a.getColor()) //TODO: check the colors
                        count ++;
                    if(isLegal(r, c + 1) && grid[r][c + 1] == a.getColor())
                        count ++;
                    if(isLegal(r, c + 2) && grid[r][c + 2] == a.getColor())
                        count ++;
                    if(isLegal(r, c + 3) && grid[r][c + 3] == a.getColor())
                        count ++;
                }
            }
        }
        if(count == 4)
            return true;
        return false;
    }

    //check if 4 in a col
    public boolean checkCol(){
        Piece a = new Piece (1); //TODO: move that to other places cause not making new piece in check
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                while(count < 4 && a.getColor() != 0){
                    if(isLegal(r, c) && grid[r][c] == a.getColor()) //TODO: check the colors
                        count ++;
                    if(isLegal(r + 1, c) && grid[r + 1][c] == a.getColor())
                        count ++;
                    if(isLegal(r + 2, c) && grid[r + 2][c] == a.getColor())
                        count ++;
                    if(isLegal(r + 3, c) && grid[r + 1][c] == a.getColor())
                        count ++;
                }
            }
        }
        if(count == 4)
            return true;
        return false;
    }

    //check if 4 in diagonal
    public boolean checkDiagA(){
        Piece a = new Piece (1); //TODO: move that to other places cause not making new piece in check
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                while(count < 4 && a.getColor() != 0){
                    if(isLegal(r, c) && grid[r][c] == a.getColor()) //TODO: check the colors
                        count ++;
                    if(isLegal(r + 1, c + 1) && grid[r + 1][c + 1] == a.getColor())
                        count ++;
                    if(isLegal(r + 2, c + 2) && grid[r + 2][c + 2] == a.getColor())
                        count ++;
                    if(isLegal(r + 3, c + 3) && grid[r + 1][c + 3] == a.getColor())
                        count ++;
                }
            }
        }

        if(count == 4)
            return true;
        return false;
    }

    public boolean checkDiagB(){
        Piece a = new Piece (1); //TODO: move that to other places cause not making new piece in check
        int count = 0;
        for (int r = grid.length; r <= 0; r--) {
            for (int c = 0; c < grid[0].length; c++) {
                while(count < 4 && a.getColor() != 0){
                    if(isLegal(r, c) && grid[r][c] == a.getColor()) //TODO: check the colors
                        count ++;
                    if(isLegal(r - 1, c - 1) && grid[r - 1][c - 1] == a.getColor())
                        count ++;
                    if(isLegal(r - 2, c - 2) && grid[r - 2][c - 2] == a.getColor())
                        count ++;
                    if(isLegal(r - 3, c - 3) && grid[r - 1][c - 3] == a.getColor())
                        count ++;
                }
            }
        }

        if(count == 4)
            return true;
        return false;
    }

    public void turnCounter(){
        if (turn == 0)
            turn--;

        if(turn == 1) {
            turn -= 2;
        }else if(turn == -1){
            turn += 2;
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2= (Graphics2D) g;

        int squarelength= 103;
        g2.setColor(new Color(255, 255, 93));
        g2.fillRect(10,10, 7*squarelength, 6*squarelength);
        for (int r = 15; r < 7*squarelength; r= r+103) {
            for (int c = 15; c < 6*squarelength; c= c+103) {
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
