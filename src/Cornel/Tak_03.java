package Cornel;

import java.util.Scanner;

public class Tak_03 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int x = scan.nextInt();
        System.out.println("Enter the second number ");
        int y = scan.nextInt();

        method(x,y);
    }

    public static void method(int x,int y){

        while(x <= y){


            System.out.println(x);

            x = x + 2;
        }

    }
}
