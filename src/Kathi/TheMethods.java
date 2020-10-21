package Kathi;

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
}
