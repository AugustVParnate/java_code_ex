import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Calculator through switch");
        System.out.println(".........................");

        System.out.print("Enter first number: ");
        double first = reader.nextDouble();

        System.out.print("Enter second number: ");
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.print("Error! Operator is not correct.");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
