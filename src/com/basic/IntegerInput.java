package com.basic;
import javax.swing.*;
import java.util.Scanner;  // Import the Scanner class


public class IntegerInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the Integer");
        int number = myObj.nextInt();
        if (number > 0){
            System.out.println("The Given Number is Positive");
        } else if (number < 0 ) {
            System.out.println("The Given Number is Negative");
        }
else {
                System.out.println("The Given Number is Zero");
            }

        }

    }

