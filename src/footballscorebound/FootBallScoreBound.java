/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorebound;

import java.util.Scanner;

/**
 *
 * @author TUFGAMING
 */
public class FootBallScoreBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean source = new LiveScoreBean();
        Subscriber sub1 = new Subscriber(1);
        Subscriber sub2 = new Subscriber(2);
        source.addPropertyChangeListener(sub1);
        source.addPropertyChangeListener(sub2);
        
        Scanner sc = new Scanner(System.in);
           
        while(true){
            System.out.print("Enter Score ");
            String resultScore = sc.nextLine();
            if(resultScore.length()==0){
                System.out.println("END SEND SCORE");
                break;
            }
            else {
                source.setScoreLine(resultScore);
                }
            }
    }
    
}
