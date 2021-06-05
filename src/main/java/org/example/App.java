package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 19 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight: ");
        int weight = 0;
        if(in.hasNextInt()) {
            weight = in.nextInt();
        } else {
            System.out.print("Please try again and enter an integer.\n");
            System.exit(1);
        }
        System.out.print("Enter height(inches): ");
        int height = 0;
        if(in.hasNextInt()) {
            height = in.nextInt();
        } else {
            System.out.print("Please try again and enter an integer.\n");
            System.exit(1);
        }


        double bmi = (weight / (height * height * 1.0)) * 703;

        if(bmi >= 18.5 && bmi <= 25) {
            System.out.printf("Your BMI is %.1f.\nYou are within the ideal weight range.", bmi);
        } else {
            System.out.printf("Your BMI is %.1f.\nYou are overweight. You should see your doctor.", bmi);
        }
    }
}
