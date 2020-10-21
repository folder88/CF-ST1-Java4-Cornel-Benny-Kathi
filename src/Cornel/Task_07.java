package Cornel;

import java.util.Scanner;

public class Task_07 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int[] num2 = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            int x = scan.nextInt();
            num[i] = x;

        }




        for(int i=num.length-1;i>=0;i--)
            System.out.print(num[i] + "  ");

    }
}
