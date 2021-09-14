/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
   Scanner scr = new Scanner(System.in);

   int A,choice,W,H;
   double BAC,r;
   System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
   choice=scr.nextInt();
   if(choice==1)
    r=0.73;
   else
    r=0.66;
   System.out.print("How many ounces of alcohol did you have? ");
   A=scr.nextInt();

   System.out.print("What is your weight, in pounds? ");
   W=scr.nextInt();

   System.out.print("How many hours has it been since your last drink? ");
   H=scr.nextInt();
      
   BAC=A*5.14/W*r-0.015*H;
   System.out.println();
      
   System.out.printf("Your BAC is %.6f", BAC);
      
   if(BAC<=0.08)
     System.out.println("\nIt is legal for you to drive.");
   else
     System.out.println("\nIt is not legal for you to drive.");
 }
}