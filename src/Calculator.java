import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter operation");
        String operationString = scanner.next();
        char operation = operationString.charAt(0);
        double result = 0d;
        if (operation == '+') {
            result = firstNumber + secondNumber;
        }

        if (operation == '-') {
            result = firstNumber - secondNumber;
        }
        if (operation == '*') {
            result = firstNumber * secondNumber;
        } else {
            result = firstNumber / secondNumber;
        }

        System.out.println("The result is: " + result);
    }
}
