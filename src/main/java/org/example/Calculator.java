package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        double num1 , num2 ;
        Scanner sc = new Scanner(System.in);

        double number1;

        System.out.print("Enter a number : ");
        number1 = sc.nextDouble();
        System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
        System.out.println("\n");



//        System.out.println("Enter two numbers :");
//
//       num1 = sc.nextDouble();
       //num2 = sc.nextDouble();

        //System.out.println("Choose any operation you want to perform on numbers");
        //System.out.println("1. Addition (+) ");

        //char op = sc.next().charAt(0);
       // double add = 0 ;
//        switch(op)
//        {
//            case '1':
//                add = num1 + num2 ;
//                break;
//
//
//            case '2':
//                System.out.println("Not available right now");
//                break;
//            default :
//                System.out.println("Wrong Option or No option Choosen");
//                System.out.println("............Exiting................");
//        }
//
//        System.out.println("Your Answer is : " + add );


    }


    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = fact(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
}