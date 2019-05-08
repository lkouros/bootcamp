package Calculator;

public final class Division extends Calculation {

    Division() {
        name = "Division";
    }

    //input for division
    @Override
    final void input() {
        System.out.println("Please give me the divident : ");
        //keep reading if input is string
        while (!reader.hasNextDouble()) {
            System.out.println("That's not a number!");
            reader.next();
        }
        num1 = reader.nextDouble();
        //do this if divisor is zero
        do {
            System.out.println("Please give me the divisor (can not be zero)");
            //keep reading if input is string
            while (!reader.hasNextDouble()) {
                System.out.println("That's not a number!");
                reader.next();
            }
            num2 = reader.nextDouble();
        } while (num2 == 0);
        //trigger calculation
        calc(num1, num2);
        //keep result to list
        results.add(result);

    }

    //calculate and print result
    @Override
    final double calc(double num1, double num2) {
        result = num1 / num2;
        System.out.printf("(%.3f) %s (%.3f) %s %.3f\n", num1, "/", num2, " = ", result);
        System.out.println("");
        return result;
    }
}
