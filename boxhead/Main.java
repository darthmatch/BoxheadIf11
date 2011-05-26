/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package boxhead;

import Objected2D.Objected2DExtended;
import Objected2D.Objected2DUtils;
import Objected2D.Objected2DWindow;
import Objected2D.objects.*;

/**
 *
 * @author benutzer
 */
public class Main {

    /**
     * @param args the command line arguments     */
    public static void main(String[] args) {
        Objected2DWindow window = new Objected2DWindow(400, 400, true);

        Objected2DExtended objected2D = window.getObjected2DExtended();

        Image image = new Image("/Users/benutzer/Desktop/golf_ball.png");
        objected2D.addObject(image);
        image.setVelocity(1);
        //image.changeDirectionTo(78);

        while (true) {
            if (image.isColliding())
                image.changeDirection(180);

            window.repaint();

            Objected2DUtils.usleep(50);
        }
    }

}
