/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbo;

/**
 *
 * @author lemonk
 */
public class Fibbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer= "+fibonacci(50));
    }
    public static long fibonacci(int n){
        if(n==0||n==1)
        return n;
        else
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
    
}
