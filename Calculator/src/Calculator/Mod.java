package Calculator;

public final class Mod extends Calculation {

    Mod() {
        name = "Modulo";
    }

    //input for modulo
    @Override
    final void input() {
        System.out.println("Please give me two integer numbers :");
        //keep reading if input is string or non integer
        while (!reader.hasNextInt()) {
            System.out.println("That's either not a number or not an integer");
            reader.next();
        }
        num1 = reader.nextDouble();
        //keep reading if input is string or non integer
        while (!reader.hasNextInt()) {
            System.out.println("That's either not a number or not an integer");
            reader.next();
        }
        num2 = reader.nextDouble();
        //trigger calculation
        calc(num1, num2);
        //keep result to list
        results.add((double) result);
    }

    // calculate and print result
    @Override
    final double calc(double num1, double num2) {
        result = num1 % num2;
        System.out.printf("(%.0f) %s (%.0f) %s %.0f\n", num1, "%", num2, " = ", result);
        System.out.println("");
        return result;
    }

}
