import java.util.*;

class Calculator {

    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }

    int subtract(int a, int b) { return a - b; }

    double multiply(double a, double b) { return a * b; }

    int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return a / b;
    }
}

public class CalculatorApp {

    static Scanner sc = new Scanner(System.in);
    static Calculator calc = new Calculator();

    static void performAddition() {
        System.out.print("Enter number of inputs (2 or 3): ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.print("Enter two integers: ");
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("Result: " + calc.add(a, b));
        } else if (n == 3) {
            System.out.print("Enter three integers: ");
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            System.out.println("Result: " + calc.add(a, b, c));
        } else System.out.println("Invalid input count!");
    }

    static void performSubtraction() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    static void performMultiplication() {
        System.out.print("Enter two doubles: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    static void performDivision() {
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        try {
            System.out.println("Result: " + calc.divide(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: performAddition(); break;
                case 2: performSubtraction(); break;
                case 3: performMultiplication(); break;
                case 4: performDivision(); break;
                case 5: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid Choice!");
            }
        }
    }
}