
import javax.swing.*;
import java.awt.*;

/**
 * Created by student on 5/31/18.
 */
public class Piece {
    private int color;

    public Piece (int color){
        this.color = color;
    }

    public int getColor(){
        return color;
    }

    public void draw(Graphics2D g2){
        //BLUE
        if(color == -1){
            g2.setColor(new Color(160, 191, 255));
            g2.fillOval(100,100,100,100);
        }
        //RED
        if(color == 1){
            g2.setColor(new Color(250, 155, 160));
            g2.fillOval(200, 200, 100, 100);
        }
    }

}
