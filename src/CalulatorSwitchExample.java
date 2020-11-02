import java.util.Scanner;

public class CalulatorSwitchExample {
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
        switch (operation){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            default:
                System.out.println("command not found");
                break;
        }
        System.out.println("The result is: " + result);
    }
}
