/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

/**
 *
 * @author lemonk
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO Calculate and print the sum of ints from 1 to 10
        use a while statement to loop through the calculation and increment statements.
        Loop should terminate when x becomes 11
        */
        int x=1;
        int sum=0;
        while (x<11){
            sum=sum+x;
            x++;
        }
        System.out.println("sum is : "+sum);
    }
    
}
