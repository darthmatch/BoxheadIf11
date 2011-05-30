/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Objected2D.util.timer;

import Objected2D.objects.interfaces.Objected2DCollisionObject;
import Objected2D.objects.interfaces.Objected2DObject;
import java.util.Hashtable;

/**
 *
 * @author Till Ehrengruber <darthmatch@googlemail.com>
 * @copyright  2011 Till Ehrengruber <darthmatch@googlemail.com>
 */
public interface TimerCallback {
    /**
     *
     * @param step the step of the timer
     * @param object the object contained by the container
     */
    public void invoke (int step, Hashtable objects);
    
    /*public void invoke (Objected2DObject object);*=
    /*public void invoke (Objected2DCollisionObject object);*/
}
