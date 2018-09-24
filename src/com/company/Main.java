package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int theInteger = input.nextInt();


        if (theInteger % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");

        }

        //----------Divide by 3 Example-------------------
        System.out.println("Enter number to divide by 3: ");
        int num = input.nextInt();

        double result = divideBy3(num);
        System.out.println(result);
        //-------------------------------------------

        printHello(); // call to printHello method
    } //end public static void main

    public static void printHello() {
        System.out.println("Hello");
    } // end printHello method

    public static double divideBy3(int input) {
        double result = input / 3;
        return result;
    }

} //end class Main





