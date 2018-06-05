
import java.awt.*;

/**
 * Created by student on 5/31/18.
 */
public class Piece {
    private int color;

    public Piece (int color){
        this.color =color;
    }

    public void draw(Graphics2D g2, int x, int y){
        if(color == -1){
            g2.setColor(new Color(160, 191, 255));
            g2.fillOval(x,y,90,90);
        }
        if(color == 1){
            g2.setColor(new Color(250, 155, 160));
            g2.fillOval(x, y, 90, 90);
        }
    }

}
