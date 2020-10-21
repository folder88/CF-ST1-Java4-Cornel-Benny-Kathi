package Kathi;

import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;


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

        for(int elements : calcArray){
            System.out.println("please, enter a number");
            calcArray[elements] += in.nextInt();
            //theSum = theSum + calcArray[elements];
        }

        for (int value : calcArray){
            theSum += value;
        }

        System.out.println("the sum of the inputs is: " + theSum);

    }

    public static void myProgram(){
        /*
        Write a program that does following:
         */

        //1. Creates an array of 10 items and fills it with various numbers, for example: 3, 10, 42, 12, ....
        int[] myItems = {1, 2, 3, 4, 5, 6, 66, 65, 64, 63};

        //2. User can enter a number and ask to find it in the array
        Scanner in = new Scanner(System.in);
        System.out.println("which number you look for?");
        int enter = in.nextInt();

        //3. The program loops through the array and counts the number of found item(s)
        for(int value : myItems){

            //int theValues = myItems[value];

            if(enter == value){
                System.out.println("yay! the number " + enter + " is in the Array!" );
                if(enter != value){
                    System.out.println("o-oh the number " + enter + " is in not the Array!" );
                }
            }
        }
    }

}
