/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorebound;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author TUFGAMING
 */
public class Subscriber implements PropertyChangeListener{
    int no;
    public Subscriber(){
    }
    public Subscriber(int no){
        this.no=no;
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Sub No."+this.no+" live score : "+evt.getNewValue());
    }
    
}
