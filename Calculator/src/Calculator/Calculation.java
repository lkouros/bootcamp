package Calculator;

import static java.lang.Math.max;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lemonk
 */
public abstract class Calculation {

    public static List<Double> results = new ArrayList<>(0);
    Scanner reader = new Scanner(System.in);
    Double result;
    Double num;
    Double num1;
    Double num2;
    String name;

    Calculation() {
    }

    //Default input for addition , substraction and multiplication
    void input() {
        System.out.println("Please give me two numbers : ");
        /*keep readingif input is string*/
        while (!reader.hasNextDouble()) {
            System.out.println("That's not a number!");
            reader.next();
        }
        num1 = reader.nextDouble();
        /*keep reading if input is string*/
        while (!reader.hasNextDouble()) {
            System.out.println("That's not a number!");
            reader.next();
        }
        num2 = reader.nextDouble();
        //trigger calculation
        calc(num1, num2);
        //keep result to list
        results.add(result);
    }

    abstract double calc(double num1, double num2);

    //calculate GCD for last two integers
    static void GreatestCommonDivisor(long last2, long last) {
        if (last2 == 0) {
            System.out.println(last + " is the GCD of " + last2 + " and " + last);
        } else if (last == 0) {
            System.out.println(last2 + " is the GCD of " + last2 + " and " + last);
        } else {
            int max = 0;
            for (int i = 1; i <= max(last2, last); i++) {
                if (last2 % i == 0 && last % i == 0) {
                    max = i;
                }
            }
            System.out.println(max + " is the Greatest Common Divisor of " + last2 + " and " + last);
        }
    }

    //check if last result is prime
    static void isPrime(long last) {
        if (last == 0) {
            System.out.println("Zero is neither prime nor not prime...");
        } else {
            boolean b = true;
            for (int i = 2; i < last; i++) {
                if (last % i == 0) {
                    System.out.println(last + " is not prime");
                    b = false;
                    break;
                }
            }
            if (b == true) {
                System.out.println(last + " is a Prime");
            }
        }
    }

    //calculate the corresponding fibonacci number
    static void Fibonacci(long last) {
        if (last == 0) {
            System.out.println("Fibonacci sequence has numbers in it....");
        } else {
            BigInteger f0 = BigInteger.valueOf(1);
            BigInteger f1 = BigInteger.valueOf(1);
            for (int i = 3; i <= last; i++) {
                BigInteger temp = f1;
                f1 = f0.add(f1);
                f0 = temp;
            }
            System.out.println("The " + Math.abs(last) + "th fibonacci number is " + f1);
        }
    }

    /*next two methods check if last result is a fibonacci number
   (hint from internet,iterrative loop takes forever to compute large numbers)*/
    static boolean isPerfectSquare(long last) {
        double s = Math.round(Math.sqrt(last) * 1000d) / 1000d;
        return (s * s == last);
    }

    static void isFibo(long last) {
        if (isPerfectSquare(5 * last * last + 4) == true
                || isPerfectSquare(5 * last * last - 4) == true) {
            System.out.println(last + " is a fibonacci number");
        } else {
            System.out.println(last + " is not a fibonacci number");
        }
    }
}
