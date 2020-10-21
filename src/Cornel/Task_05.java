package Cornel;

import java.util.Arrays;

public class Task_05 {


    public static void main(String args[]){

        int [] num = new int [10];
        int y = 3;
        int b = 0;

        for(int i = 0;i < 10;i++){

            int x = (int) (Math.random()*10);
            num[i] = x;

            System.out.print(num[i]+" ");



        }

        System.out.println("...........");
        for(int i = 0;i < 10;i++){

            if(y == num[i]){
                b++;

            }

        }

        System.out.println(b + " Elements found");

    }
}
