package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        double number1, number2;

        do {
            System.out.println("------Mini Project - Scientific Calculator with DevOps----- \n # Please Choose any one option :");

            System.out.println("1. Square root \n2. Factorial \n3. Natural Logarithm (base e)\n4. Power\n5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {

                case 1:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = sc.nextDouble();
                    System.out.println("Square root of " + number1 + " is : " + calculator.squareRoot(number1));
                    System.out.println("\n");
                    break;

                case 2:
                    // Factorial
                    System.out.print("Enter a number : ");
                    number1 = sc.nextDouble();
                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                    System.out.println("\n");
                    break;

                case 3:
                    // Natural log
                    System.out.print("Enter a number : ");
                    number1 = sc.nextDouble();
                    System.out.println("Natural log of " + number1 + " is : " + calculator.naturalLog(number1));
                    System.out.println("\n");
                    break;

                case 4:
                    // Power
                    System.out.print("Enter the first number : ");
                    number1 = sc.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = sc.nextDouble();
                    System.out.println(number1 + " raised to power " + number2 + " is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;

                default:
                    System.out.println("----------Exiting-----------");
                    return;
            }
        } while (true);
    }

    public double squareRoot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = factorialHelper(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double factorialHelper(double num) {
        double fact = 1;
        for(int i = 1; i <= num; ++i)
        { fact *= i;   }
        return  fact;
    }
    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double number1) {
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
}