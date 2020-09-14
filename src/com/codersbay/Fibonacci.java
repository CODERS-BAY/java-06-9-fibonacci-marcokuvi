package com.codersbay;
 import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your number? ");
        int fibonacciNumber = input.nextInt();

        System.out.println("The " + fibonacciNumber + " Fibonacci Number is: " + fibonacciFormula(fibonacciNumber));
    }

    public static int fibonacciFormula (int number) {
        if ((number == 0) || (number == 1)) {
            return number;
        } else {
            return fibonacciFormula(number - 1) + fibonacciFormula(number - 2);
        }
    }
}