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

        //-1 is blue, 0 is open, 1 is red
        //assigns 0 to all positions
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = 0;
                red[r][c]= false;
                blue[r][c]= false;
            }
        }

        setLayout(null);
        one = new JButton("");
        add(one);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int r = grid.length - 1;

                    while (r > -1 && !isItPlayable(r, 0)) {
                        r--;
                    }
                    if(r < 0){
                        //no move in this col
                    }
                    else{
                        if (turn % 2 == 0) {
                            grid[r][0] = 1;
                            red[r][0] = true;
                            turn++;
                        }

                        else {
                            grid[r][0] = -1;
                            blue[r][0] = true;
                            turn++;
                        }

                    }

                System.out.println(turn);
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

                int r = grid.length - 1;

                while (r > -1 && !isItPlayable(r, 1)) {
                    r--;
                }
                if(r < 0){
                    //no move in this col
                }
                else{
                    if (turn % 2 == 0) {
                        grid[r][1] = 1;
                        red[r][1] = true;
                        turn++;

                    }

                    else {
                        grid[r][1] = -1;
                        blue[r][1] = true;
                        turn++;

                    }

                }

                System.out.println(turn);
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

                int r = grid.length - 1;

                while (r > -1 && !isItPlayable(r, 2)) {
                    r--;
                }
                if(r < 0){
                    //no move in this col
                }
                else{
                    if (turn % 2 == 0) {
                        grid[r][2] = 1;
                        red[r][2] = true;
                        turn++;

                    }

                    else {
                        grid[r][2] = -1;
                        blue[r][2] = true;
                        turn++;

                    }

                }

                System.out.println(turn);
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

                int r = grid.length - 1;

                while (r > -1 && !isItPlayable(r, 3)) {
                    r--;
                }
                if(r < 0){
                    //no move in this col
                }
                else{
                    if (turn % 2 == 0) {
                        grid[r][3] = 1;
                        red[r][3] = true;
                        turn++;

                    }

                    else {
                        grid[r][3] = -1;
                        blue[r][3] = true;
                        turn++;

                    }

                }

                System.out.println(turn);
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
                int r = grid.length - 1;

                while (r > -1 && !isItPlayable(r, 4)) {
                    r--;
                }
                if(r < 0){
                    //no move in this col
                }
                else{
                    if (turn % 2 == 0) {
                        grid[r][4] = 1;
                        red[r][4] = true;
                        turn++;

                    }

                    else {
                        grid[r][4] = -1;
                        blue[r][4] = true;
                        turn++;

                    }

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
                int r = grid.length - 1;

                while (r > -1 && !isItPlayable(r, 5)) {
                    r--;
                }
                if(r < 0){
                    //no move in this col
                }
                else{
                    if (turn % 2 == 0) {
                        grid[r][5] = 1;
                        red[r][5] = true;
                        turn++;

                    }

                    else {
                        grid[r][5] = -1;
                        blue[r][5] = true;
                        turn++;

                    }

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
                int r = grid.length - 1;

                while (r > -1 && !isItPlayable(r, 6)) {
                    r--;
                }
                if(r < 0){
                    //no move in this col
                }
                else{
                    if (turn % 2 == 0) {
                        grid[r][6] = 1;
                        red[r][6] = true;
                        turn++;

                    }

                    else {
                        grid[r][6] = -1;
                        blue[r][6] = true;
                        turn++;

                    }

                }
            }
        });
        seven.setBounds(640, 10, 80, 40);
/////////////////////////////////////////////////////////
//
//        //-1 is blue, 0 is open, 1 is red
//        //assigns 0 to all positions
//        for (int r = 0; r < grid.length; r++) {
//            for (int c = 0; c < grid[0].length; c++) {
//                grid[r][c] = 0;
//            }
//        }

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

    //check if win (4 in a row)
    public boolean didWin(){
        if(checkRow() || checkCol() || checkDiagARed() || checkDiagABlue() || checkDiagBRed() || checkDiagBBlue())
            return true;
        return false;
    }

    //return true if didWin is false && everything is filled up
    public boolean didTie(){
        boolean didNot = true;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(!didWin() && didNot)
                    if(grid[r][c] != 0)
                        didNot = false;
            }
        }
        if(!didNot)
            return true;
        return false;
    }

    //check if 4 in a row
    public boolean checkRow(){
        return false;
    }

    //check if 4 in a col
    public boolean checkCol(){
        return false;
    }

    //check if 4 in diagonal
    public boolean checkDiagARed(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(r >= 0 && r+3 <= 5 && c >= 0 && c+3 <=6) {
                    if(red[r][c] && red[r + 1][c + 1] && red[r + 2][c + 2] && red[r + 3][c + 3])
                        return true;
                }
            }
        }

        return false;

//        int r = 0, c = 0;
//        if(red[r][c] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//        else if(red[r+4][c+4] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//        else if(red[r+4][c+4] && red[r+5][c+5] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//
//        r++;
//
//        if(red[r][c] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//        else if(red[r+4][c+4] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//
//        r++;
//
//        if(red[r][c] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//
//        r = 0;
//        c++;
//
//        if(red[r][c] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//        else if(red[r+4][c+4] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//        else if(red[r+4][c+4] && red[r+5][c+5] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//
//        c++;
//
//        if(red[r][c] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//        else if(red[r+4][c+4] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//
//        c++;
//
//        if(red[r][c] && red[r+1][c+1] && red[r+2][c+2] && red[r+3][c+3])
//            return true;
//
//        return false;
    }

    public boolean checkDiagABlue(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(r >= 0 && r+3 <= 5 && c >= 0 && c+3 <=6) {
                    if(blue[r][c] && blue[r + 1][c + 1] && blue[r + 2][c + 2] && blue[r + 3][c + 3])
                        return true;
                }
            }
        }

        return false;
        //        Piece a = new Piece (1);
//        int count = 0;
//        for (int r = 0; r < grid.length; r++) {
//            for (int c = 0; c < grid[0].length; c++) {
//                while(count < 4 && a.getColor() != 0){
//                    if(isLegal(r, c) && grid[r][c] == a.getColor())
//                        count ++;
//                    if(isLegal(r + 1, c + 1) && grid[r + 1][c + 1] == a.getColor())
//                        count ++;
//                    if(isLegal(r + 2, c + 2) && grid[r + 2][c + 2] == a.getColor())
//                        count ++;
//                    if(isLegal(r + 3, c + 3) && grid[r + 1][c + 3] == a.getColor())
//                        count ++;
//                }
//            }
//        }
//
//        if(count == 4)
//            return true;
//        return false;
    }

    public boolean checkDiagBRed(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if(r >= 0 && r+3 <= 5 && c <= 6 && c-3 >= 0) {
                    if(red[r][c] && red[r + 1][c - 1] && red[r + 2][c - 2] && red[r + 3][c - 3])
                        return true;
                }
            }
        }

        return false;
//        Piece a = new Piece (1);
//        int count = 0;
//        for (int r = grid.length; r <= 0; r--) {
//            for (int c = 0; c < grid[0].length; c++) {
//                while(count < 4 && a.getColor() != 0){
//                    if(isLegal(r, c) && grid[r][c] == a.getColor())
//                        count ++;
//                    if(isLegal(r - 1, c - 1) && grid[r - 1][c - 1] == a.getColor())
//                        count ++;
//                    if(isLegal(r - 2, c - 2) && grid[r - 2][c - 2] == a.getColor())
//                        count ++;
//                    if(isLegal(r - 3, c - 3) && grid[r - 1][c - 3] == a.getColor())
//                        count ++;
//                }
//            }
//        }
//
//        if(count == 4)
//            return true;
//        return false;
    }

    public boolean checkDiagBBlue(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if(r >= 0 && r+3 <= 5 && c <= 6 && c-3 >= 0) {
                    if(blue[r][c] && blue[r + 1][c - 1] && blue[r + 2][c - 2] && blue[r + 3][c - 3]) //TODO
                        return true;
                }
            }
        }

        return false;
    }

    public boolean isItPlayable(int r, int c){

        if(grid[r][c]==0){
            return true;
        }

        return false;
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

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

                if(red[r][c]== true){
                    g2.setColor(new Color(255, 2, 0));
                    g2.fillOval(15+c*103, 15+r*103, 90,90);
                }

                if(blue[r][c]==true){
                    g2.setColor(new Color(5, 0, 255));
                    g2.fillOval(15+c*103, 15+r*103, 90,90);
                }

            }

        }


//        int j = 0;
//        int k = 0;
//        while (j<6){
//            for (int r = 15; r < 7*squarelength; r= r+103) {
//                for (int c = 15; c < 6*squarelength; c= c+103) {
//                    if (red[j][k]){
//                        g2.setColor(new Color(255, 2, 0));
//                        g2.fillOval(r, c, 90,90);
//                    }
//                    if(blue[j][k]){
//                        g2.setColor(new Color(5, 0, 255));
//                        g2.fillOval(r, c, 90,90);
//                    }
//                    k++;
//                    if(k==7){
//                        k=0;
//                        j++;
//                    }
////                    g2.setColor(new Color(255, 255, 255));
////                    g2.fillOval(r, c, 90,90);
//                }
//        }
//
//
//    }

    repaint();

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
