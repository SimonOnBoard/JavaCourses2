import java.util.Scanner;

public class CalculatorTernarVersion {
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
        result = operation == '+' ? firstNumber + secondNumber :
                operation == '-'? firstNumber - secondNumber :
                        operation == '*' ? firstNumber * secondNumber : firstNumber / secondNumber;
        System.out.println("The result is: " + result);

    }
}
