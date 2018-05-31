import javax.swing.*;
import java.awt.*;

/**
 * Created by student on 5/30/18.
 */
public class ConnectFourMain extends JPanel {
    //instance fields
    private int[][] grid = new int[6][7];

    //constructor
    public ConnectFourMain(){
        grid = grid;
    }

    //check if win (4 in a row)
    public boolean didWin(){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

            }
        }
    }

    //return true if didWin is false && everything is filled up
    public boolean didTie(){

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Connect 4");
        frame.setDefaultCloseOperation(3);
        int width = 800;
        int height = 800; //short?
        frame.setPreferredSize(new Dimension(width, height + 24));
        ConnectFourMain panel = new ConnectFourMain(width, height);
        panel.setFocusable(true);
        panel.grabFocus();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
