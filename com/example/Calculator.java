import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter operation (+, -, *, /, %, ^): ");
        String operation = scan.nextLine();
        doCalculate(firstNum, operation, secondNum);
        scan.close();
    }

    private static String doCalculate(int firstNum, String operation, int secondNum) {
        return switch (operation) {
            case "+" -> String.format("%d %s %d = %d", firstNum, operation, secondNum, (firstNum + secondNum));
            case "-" -> String.format("%d %s %d = %d", firstNum, operation, secondNum, (firstNum - secondNum));
            case "*" -> String.format("%d %s %d = %d", firstNum, operation, secondNum, (firstNum * secondNum));
            case "/" -> String.format("%d %s %d = %d", firstNum, operation, secondNum, (firstNum / secondNum));
            case "%" -> String.format("%d %s %d = %d", firstNum, operation, secondNum, (firstNum % secondNum));
            case "^" ->
                String.format("%d %s %d = %f", firstNum, operation, secondNum, (int) Math.pow(firstNum, secondNum));
            default -> "Not found";
        };
    }
}
