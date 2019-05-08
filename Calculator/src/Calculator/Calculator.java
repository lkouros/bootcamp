package Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LKouros
 */
public class Calculator {

    private static final List<String> SYMBOLS = new ArrayList<>();
    private static final Map<String, Calculation> MAP = new HashMap<>();
    static Double last;
    static Double last2;
    static int listsize;
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //valid symbols
        SYMBOLS.addAll(Arrays.asList("+", "-", "*", "/", "sqrt", "%"));
        //map symbols to actions
        map();
        //Intro
        System.out.println("Welcome to a simple calculator ...");
        System.out.println("This computes addition,substraction,multiplication"
                + ",division and modulo of two numbers \n"
                + "or the square root of a number");
        System.out.println("Do a second calculation for extras!!!");
        //ask for calculation
        getInputForAction();
        //continue to next calculation or extra content
        Continue();
    }

    //map SYMBOLS to actions
    private static void map() {

        Calculation add = new Addition();
        MAP.put("+", add);
        Calculation sub = new Substraction();
        MAP.put("-", sub);
        Calculation mul = new Multiplication();
        MAP.put("*", mul);
        Calculation div = new Division();
        MAP.put("/", div);
        Calculation mod = new Mod();
        MAP.put("%", mod);
        Calculation sqrt = new Sqrt();
        MAP.put("sqrt", sqrt);
    }

    private static void getInputForAction() {
        //get input for action
        
        System.out.println("Please enter a symbol for the calculation you want "
                + SYMBOLS.toString());
        String symbol = reader.nextLine();
        //check for invalid symbol
        while (!SYMBOLS.contains(symbol.trim())) {
            System.out.println("Please enter one of the following symbols "
                    + SYMBOLS.toString() + ":");
            symbol = reader.nextLine();
        }
        /*trigger appropriate input request according to symbol
        "sqrt" needs one positive number,"/" needs divisor!=0,
        "%" needs integer*/
        System.out.println("You have asked for " + MAP.get(symbol).name);
        System.out.println("");
        MAP.get(symbol).input();
    }
    //continue to next calculation ,extras or exit
    private static void Continue() {
        if (Calculation.results.size() < 2) {
            System.out.println("Enter any key to perform another calculation or 'n' to exit...");
            String con = reader.nextLine();
            if (con.toLowerCase().trim().equals("n")) {
                System.exit(0);
            } else {
                getInputForAction();
            }
        }
        //retrieve last 2 results
        listsize = Calculation.results.size();
        last2 = Calculation.results.get(listsize - 2);
        last = Calculation.results.get(listsize - 1);
        System.out.println("Last two results are : ");
        System.out.printf("%.3f %s %.3f %s\n", last2, " and ", last, " .");
        System.out.println();
        System.out.println("They will be converted tο positive integers \n"
                + "to compute the Greatest Common Divisor,\n"
                + "test if the last result is a prime number,\n"
                + "find the corresponing fibonacci number of the last result \n"
                + "and check if last result is a fibonacci number");
        System.out.println("Enter 'c' to continue ,'n' to exit or any key for a new calculation ");

        String con = reader.nextLine();
        switch (con.toLowerCase().trim()) {
            case "c":
                extra();
                break;
            case "n":
                System.exit(0);
                break;
            default:
                getInputForAction();
                Continue();
        }
    }

    private static void extra() {//extra calculations with positive  integers
        long Last = Math.round(last);
        long Last2 = Math.round(last2);
        //GDC
        Calculation.GreatestCommonDivisor(Math.abs(Last2), Math.abs(Last));
        System.out.println();
        //check for prime
        Calculation.isPrime(Math.abs(Last));
        System.out.println();
        //check for corresponding fibonacci number
        Calculation.Fibonacci(Math.abs(Last));
        System.out.println();
        //  check if last result ia a fibonacci number
        Calculation.isFibo(Math.abs(Last));
        System.out.println();
    }

}
