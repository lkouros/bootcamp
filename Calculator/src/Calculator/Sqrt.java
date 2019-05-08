package Calculator;

public final class Sqrt extends Calculation {

    Sqrt() {
        name = "Square Root";
    }

    //input for square root
    @Override
    final void input() {
        //do this if number is not positive
        do {
            System.out.println("Please give me a positive number :");
            //keep reading if input is string
            while (!reader.hasNextDouble()) {
                System.out.println("That's not a number!");
                reader.next();
            }
            num = reader.nextDouble();
        } while (num <= 0);
        //trigger calculation
        calc(num, num);
        //keep result to list
        results.add(result);

    }

    // calculate and print result
    @Override
    final double calc(double num, double num2) {
        result = Math.sqrt(num);
        System.out.printf("%s (%.3f) %s %.3f\n", "Square root of ", num, " is ", result);
        System.out.println("");
        return result;
    }
}
