/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author lemonk
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO Write an application that stores 11 integers in an array.
        Display the integers from first to last and then display the ins from
        last to first.
        Determine and print the smallest and largest values of the array.
        */
        int Ints[] = new int[11];
        for(int i=0; i < Ints.length; i++){
        Ints[i]  =  (int) (Math.random()*100);}
        int max=Ints[0];int min=Ints[0];
    for(int i=0; i < Ints.length; i++){
        
        System.out.print(Ints[i]+" ");
        
        if (Ints[i]>max){ 
            max=Ints[i];
        }
        if (Ints[i]<min){ 
            min=Ints[i];
        }
    }
    System.out.println();
    for(int j=Ints.length-1; j >=0; j--){
        
        System.out.print(Ints[j]+" ");
        
    }
    System.out.println();
        
    System.out.println("Max number is : "+max);
    System.out.println("Min number is : "+min);
    }
}


