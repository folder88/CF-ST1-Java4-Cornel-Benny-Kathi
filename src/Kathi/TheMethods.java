package Kathi;

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
}
