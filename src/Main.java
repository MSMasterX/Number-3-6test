import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first number: ");
        int number1 = scanner.nextInt();
        System.out.println("input second number: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int minus = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1 / number2;
        System.out.println("Sum = %d\nMinus = %d\nMultiply  = %d\nDivide = %d\n ", sum, minus, multiply, divide);
    }
}
