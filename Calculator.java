/**
 * Calculator
 */
public class Calculator {

    // Base class for arithmetic operations
    class Operation {
        int a = 4;
        int b = 6;

        void display() {
            System.out.println("Numbers: " + a + " and " + b);
        }
    }

    // Addition operation
    class Addition extends Operation {
        void calculate() {
            int sum = a + b;
            System.out.println("Addition: " + sum);
        }
    }

    // Multiplication operation
    class Multiplication extends Operation {
        void calculate() {
            int product = a * b;
            System.out.println("Multiplication: " + product);
        }
    }

    // Subtraction operation
    class Subtraction extends Operation {
        void calculate() {
            int difference = a - b;
            System.out.println("Subtraction: " + difference);
        }
    }

    // Division operation
    class Division extends Operation {
        void calculate() {
            if (b != 0) {
                int quotient = a / b;
                System.out.println("Division: " + quotient);
            } else {
                System.out.println("Error: Division by zero!");
            }
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Addition addition = calculator.new Addition();
        Multiplication multiplication = calculator.new Multiplication();
        Subtraction subtraction = calculator.new Subtraction();
        Division division = calculator.new Division();

        addition.display();
        addition.calculate();

        multiplication.display();
        multiplication.calculate();

        subtraction.display();
        subtraction.calculate();

        division.display();
        division.calculate();
    }
}