/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorebound;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author TUFGAMING
 */
public class ScoreSource implements Serializable {
    
    public static final String SCORE_PROPERTY = "score";
    
    private String score;
    
    private PropertyChangeSupport propertySupport;
    
    public ScoreSource() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScore() {
        return score;
    }
    
    public void setScore(String value) {
        String oldScore = score;
        score = value;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldScore, score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
