import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Welcome to basic calaculator ***");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *. /): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean ValidOperation = true;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;
            
            case '/':
                if (num2 != 0) {
                    result = num1/num2;
                }
                else {
                    System.out.println("Error: division by Zero is not allowed.");
                    ValidOperation = false;
                }
                break;
            default:
                System.out.println("Error Invalid operation");
                ValidOperation = false;
        }
        if (ValidOperation) {
            System.out.println("The result is: "+ result);

        }
        scanner.close();        
    }
}
