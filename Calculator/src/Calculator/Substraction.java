package Calculator;

public final class Substraction extends Calculation {

    Substraction() {
        name = "Substraction";
    }

    //calculate and print result
    @Override
    final double calc(double num1, double num2) {
        result = num1 - num2;
        System.out.printf("(%.3f) %s (%.3f) %s %.3f\n", num1, "-", num2, " = ", result);
        System.out.println("");
        return result;
    }
}
