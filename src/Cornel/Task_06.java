package Cornel;

public class Task_06 {

    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {

            int x = (int) (Math.random() * 10);
            num[i] = x;

            System.out.print(num[i] + " ");


        }
    }
}
