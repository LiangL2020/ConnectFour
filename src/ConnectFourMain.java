import javax.swing.*;
import java.awt.*;

/**
 * Created by Liang Lu, Uma Paithankar, & Megan Sin on 5/30/18.
 */
public class ConnectFourMain extends JPanel {
    private int width, height;
    public ConnectFourMain(int width, int height){
        this.width = width;
        this.height = height;
    }

    Piece a = new Piece("blue");
    Piece b = new Piece ("red");

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        a.draw(g2);
        b.draw(g2);
    }


}

