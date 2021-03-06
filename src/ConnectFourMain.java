import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Liang, Megan, Uma. on 5/30/18.
 */
public class ConnectFourMain extends JPanel {
    //instance fields
    private int[][] grid;
    private int turn = 0;
    private JButton one, two, three, four, five, six, seven, restart;
    private boolean[][] red, blue;
    private int winner; //if winner is 1, red won; if winner is 2, blue won; if 0, it's open.


    //constructor
    public ConnectFourMain(int width, int height){
        setSize(width, height);
        grid = new int[6][7];
        red= new boolean[6][7];
        blue= new boolean[6][7];

        //-1 is blue, 0 is open, 1 is red
        //assigns 0 to all positions even though int array elements are always initialized as 0 and boolean arr elems as false XD
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                grid[r][c] = 0;
                red[r][c]= false;
                blue[r][c]= false;
            }
        }

        //buttons
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

        setLayout(null);
        restart= new JButton("Restart");
        add(restart);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[0].length; j++) {
                        grid[i][j]=0;
                        red[i][j]=false;
                        blue[i][j]=false;
                    }
                }

                winner=0;
                one.setEnabled(true);
                two.setEnabled(true);
                three.setEnabled(true);
                four.setEnabled(true);
                five.setEnabled(true);
                six.setEnabled(true);
                seven.setEnabled(true);
            }
        });
        restart.setBounds(67, 675, 80, 40);
    }

    //is there a 4 in a row
    public boolean didWin(){
        if(checkRow() || checkCol() || checkDiagARed() || checkDiagABlue() || checkDiagBRed() || checkDiagBBlue()){
            return true;
        }
        return false;
    }

    //return true if didWin is false && all spaces are filled up
    public boolean didTie(){
        boolean x = true;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(grid[r][c]==0){
                    x = false;
                }
            }
        }
        if(x && !didWin()){
            return true;
        }
        return false;
    }

    //check rows
    public boolean checkRow(){

        //check red win
        for (int r = 5; r > -1; r--) {
            //for (int c = 0; c < 1; c++) {
            if (red[r][0] == red[r][1] && red[r][1]==red[r][2]&& red[r][2] == red[r][3]&& red[r][0]) {
                winner=1;
                return true;
            }
            if (red[r][1] == red[r][2] && red[r][2]==red[r][3]&& red[r][3] == red[r][4]&& red[r][1]) {
                winner = 1;
                return true;
            }
            if (red[r][2] == red[r][3] && red[r][3]==red[r][4]&& red[r][4] == red[r][5]&& red[r][2]) {
                winner =1;
                return true;
            }
            if (red[r][3] == red[r][4] && red[r][4]==red[r][5]&& red[r][5] == red[r][6]&& red[r][3]) {
                winner = 1;
                return true;
            }
//
        }

        //check blue win
        for (int r = 5; r > -1; r--) {
            if (blue[r][0] == blue[r][1] && blue[r][1]==blue[r][2]&& blue[r][2] == blue[r][3]&& blue[r][0]) {
                winner=2;
                return true;
            }
            if (blue[r][1] == blue[r][2] && blue[r][2]==blue[r][3]&& blue[r][3] == blue[r][4]&& blue[r][1]) {
                winner=2;
                return true;
            }
            if (blue[r][2] == blue[r][3] && blue[r][3]==blue[r][4]&& blue[r][4] == blue[r][5]&& blue[r][2]) {
                winner=2;
                return true;
            }
            if (blue[r][3] == blue[r][4] && blue[r][4]==blue[r][5]&& blue[r][5] == blue[r][6]&& blue[r][3]) {
                winner = 2;
                return true;
            }
//
        }
        return false;
    }

    //check columns
    public boolean checkCol() {

        //check red win
        for (int c = 0; c < 7; c++) {
            //for (int c = 0; c < 1; c++) {
            if (red[5][c] == red[4][c] && red[4][c] == red[3][c] && red[3][c] == red[2][c] && red[5][c]) {
                winner = 1;
                return true;
            }
            if (red[4][c] == red[3][c] && red[3][c] == red[2][c] && red[2][c] == red[1][c] && red[4][c]) {
                winner = 1;
                return true;
            }
            if (red[3][c] == red[2][c] && red[2][c] == red[1][c] && red[1][c] == red[0][c] && red[3][c]) {
                winner = 1;
                return true;
            }
        }

        //check blue win
        for (int c = 0; c < 7; c++) {
            if (blue[5][c] == blue[4][c] && blue[4][c] == blue[3][c] && blue[3][c] == blue[2][c] && blue[5][c]) {
                winner = 2;
                return true;
            }
            if (blue[4][c] == blue[3][c] && blue[3][c] == blue[2][c] && blue[2][c] == blue[1][c] && blue[4][c]) {
                winner = 2;
                return true;
            }
            if (blue[3][c] == blue[2][c] && blue[2][c] == blue[1][c] && blue[1][c] == blue[0][c] && blue[3][c]) {
                winner = 2;
                return true;
//
            }
        }
        return false;
    }

    //check diagonals (A is top left - bottom r; B is top right - bottom l)

    //check red win A
    public boolean checkDiagARed(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(r >= 0 && r+3 <= 5 && c >= 0 && c+3 <=6) {
                    if(red[r][c] && red[r + 1][c + 1] && red[r + 2][c + 2] && red[r + 3][c + 3]){
                        winner=1;
                        return true;

                    }
                }
            }
        }
        return false;
    }

    //check blue win A
    public boolean checkDiagABlue(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(r >= 0 && r+3 <= 5 && c >= 0 && c+3 <=6) {
                    if(blue[r][c] && blue[r + 1][c + 1] && blue[r + 2][c + 2] && blue[r + 3][c + 3]){
                        winner = 2;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //check red win B
    public boolean checkDiagBRed(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if(r >= 0 && r+3 <= 5 && c <= 6 && c-3 >= 0) {
                    if(red[r][c] && red[r + 1][c - 1] && red[r + 2][c - 2] && red[r + 3][c - 3]){
                        winner = 1;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //check blue win B
    public boolean checkDiagBBlue(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = grid[0].length - 1; c >= 0; c--) {
                if(r >= 0 && r+3 <= 5 && c <= 6 && c-3 >= 0) {
                    if(blue[r][c] && blue[r + 1][c - 1] && blue[r + 2][c - 2] && blue[r + 3][c - 3]){
                        winner=2;
                        return true;

                    }
                }
            }
        }
        return false;
    }

    //is the space open
    public boolean isItPlayable(int r, int c){
        if(grid[r][c]==0){
            return true;
        }
        return false;
    }

    //paint
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
                    g2.setColor(new Color(250, 62, 59));
                    g2.fillOval(15+c*103, 15+r*103, 90,90);
                }

                if(blue[r][c]==true){
                    g2.setColor(new Color(160, 191, 255));
                    g2.fillOval(15+c*103, 15+r*103, 90,90);
                }

            }
        }

        g2.setColor(new Color(255, 255, 93));
        g2.fillRect(175, 675, 100, 40);

        g2.setColor(Color.black);
        g2.drawString("Turn:", 195, 700);

        if(turn%2==0){
            g2.setColor(Color.RED);
            g2.drawString("RED", 230, 700);
        }

        if(turn%2==1){
            g2.setColor(Color.BLUE);
            g2.drawString("BLUE", 230, 700);
        }

        if(winner ==1){
            g2.setColor(Color.RED);
            g.setFont(new Font("TimesRoman", Font.BOLD, 20));
            g2.drawString("RED WINS", 400, 700);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            seven.setEnabled(false);
        }
        if(winner ==2){
            g2.setColor(Color.BLUE);
            g.setFont(new Font("TimesRoman", Font.BOLD, 20));
            g2.drawString("BLUE WINS!", 400, 700);
            one.setEnabled(false);
            two.setEnabled(false);
            three.setEnabled(false);
            four.setEnabled(false);
            five.setEnabled(false);
            six.setEnabled(false);
            seven.setEnabled(false);
        }

        if(didTie()){
            g2.setColor(new Color (196, 4, 255));
            g.setFont(new Font("TimesRoman", Font.BOLD, 20));
            g2.drawString("IT'S A TIE!", 400, 700);
        }

        //it's a method-calling partay
        checkRow();
        checkCol();
        checkDiagARed();
        checkDiagABlue();
        checkDiagBRed();
        checkDiagBBlue();
        didTie();

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
}//557 is the 102nd prime number :)