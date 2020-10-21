package Kathi;

import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;


/**
 * this class is only for the functions.
 */

public class TheMethods {

    public static void loopOne(){   // <--- for BasicOne class
        for(int i = 1; i <=100; i++){
            System.out.println(i);
        }
    }

    public static void loopTwo(){  // <--- for BasicTwo class
        for(int i = 1; i <=100; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void loopThree(){    // <--- for IntermediateOne class
        Scanner in = new Scanner(System.in);

        System.out.println("give me the first number");
        int one = in.nextInt();
        System.out.println("now,the second number");
        int two = in.nextInt();

        for(int i = one; i < two; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void calculateSum(){  // <--- for IntermediateTwo class
        int[] calcArray = new int[6];
        int theSum = 0;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < calcArray.length; i++){
            System.out.println("please, enter a number");
            calcArray[i] += in.nextInt();
            //theSum = theSum + calcArray[elements];
        }

        for (int element : calcArray){
            theSum += element;
        }

        System.out.println("the sum of the inputs is: " + theSum);

    }

    public static void myProgram(){ // <--- for Advanced class
        /*
        Write a program that does following:
         */

        //1. Creates an array of 10 items and fills it with various numbers, for example: 3, 10, 42, 12, ....
        int[] myItems = {1, 2, 3, 4, 5, 6, 66, 65, 64, 63};
        boolean gefunden = true;

        //2. User can enter a number and ask to find it in the array
        Scanner in = new Scanner(System.in);
        System.out.println("which number you look for?");
        int enter = in.nextInt();

        //3. The program loops through the array and counts the number of found item(s)
        for(int value : myItems){

            // 5. If one item is found - display the number of found items.
            if(enter == value){
                gefunden = false;
                System.out.println("numbermatch: " + enter);
            }
        }

        // 4. If nothing is found -  display “Nothing found”.
        if(gefunden){
            System.out.println("Nothing found" );
        }
    }

    public static void fillAnd(){      // <--- for ArrayBasicOne class
        int[] toFill = new int[10];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < toFill.length; i++){
            System.out.println("please, enter a number");
            toFill[i] += in.nextInt();
        }

        for(int element : toFill){
            System.out.println(element);
        }
    }

    public static void rueckwerts(){   // <--- for Array class
        int[] rew = new int[10];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < rew.length; i++){
            System.out.println("please, enter a number");
            rew[i] += in.nextInt();
        }

        for(int i = rew.length -1; i >= 0; i--){
            System.out.println(rew[i]);
        }
    }

    public static void average(){
        int[] durchschnitt = new int[4];
        int sum = 0;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < durchschnitt.length; i++){
            System.out.println("please, enter a number");
            durchschnitt[i] += in.nextInt();
        }

        for (int value : durchschnitt) {
            sum += value;
        }

        double average = sum/ durchschnitt.length;
        System.out.println("the average is: " + average);
    }


}
