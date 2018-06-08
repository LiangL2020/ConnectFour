
import java.awt.*;

/**
 * Created by the awesomest group on 5/31/18.
 */
public class Piece {
    private int color;

    public Piece (int color){
        this.color =color;
    }

    public int getColor(){
        return color;
    }

    //getColumn of Piece (JButton clicked)
    //

//    public int getRow(){
//        Piece a = new Piece (getColor());
//
//    }

    public void draw(Graphics2D g2){
        if(color == -1){
            g2.setColor(new Color(160, 191, 255));
            g2.fillOval(100,100,100,100);
        }
        if(color == 1){
            g2.setColor(new Color(250, 155, 160));
            g2.fillOval(200, 200, 100, 100);
        }



    }


}
