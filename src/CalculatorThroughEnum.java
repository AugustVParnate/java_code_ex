import java.util.Scanner;

public class CalculatorThroughEnum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Calculator through enum");
        System.out.println(".......................");

        System.out.print("Enter first number: ");
        double first = reader.nextDouble();

        System.out.print("Enter second number: ");
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        try {
            result = MathOperator.from(operator).performOperation(first, second);
        } catch (IllegalArgumentException e) {
            System.out.println("The operator you entered was not found, please enter a valid operator!");
            return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }

}
