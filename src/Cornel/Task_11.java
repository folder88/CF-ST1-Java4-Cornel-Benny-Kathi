package Cornel;

public class Task_11 {

    public static void main(String args[]){

        double [] num = {2,3,4,54,4};
        double summ = 0;

        for(int i = 0;i < num.length;i++){

            summ = summ + num[i];

        }
        double result = summ*2;
        System.out.println(result);
    }
}
