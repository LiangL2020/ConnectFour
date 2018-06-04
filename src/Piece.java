
import javax.swing.*;
import java.awt.*;

/**
 * Created by student on 5/31/18.
 */
public class Piece {
    private int color;

    public Piece (int color){
        this.color =color;

    }

    public void draw(Graphics2D g2){
        if(color==-1){
            g2.setColor(Color.BLUE);
            g2.fillOval(100,100,100,100);
        }
        if(color==1){
            g2.setColor(Color.RED);
            g2.fillOval(200, 200, 100, 100);
        }

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Uma Paithankar");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 1200;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, width + 24));


        JPanel panel = new ConnectFourMain(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
