/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerscise2;

/**
 *
 * @author lemonk
 */
public class Exerscise2 {

    /**
     * @param args the command line arguments
     */
    private static final float KM=1.852f;
    private static final float ML=1.150779f;
    private static final float NAUTICAL_MILES=96.5f;
    public static void main(String[] args) {
        /* TODO Write a Java class that declares named constants to represent 
        the number of kilometres(1.852) and the number of miles(1.150779) in a
        nautical mile.
        Also declare a variable to represent a number of nautical miles and 
        assign a value to it.
        Compute and display with explanatory text the value in kms and miles.
        */
        
            
        
        
        System.out.println(NAUTICAL_MILES +" nautical miles equals to "
                            +(NAUTICAL_MILES*KM)+" kilometres or "
                            +(NAUTICAL_MILES*ML) +" miles");
    }
    
}
