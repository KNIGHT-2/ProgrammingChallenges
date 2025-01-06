package Fibonacci;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibo(10)));

    }
    static int[] fibo(int howManyNumbers){

        int[] numbers = new int[howManyNumbers];
        int n1 = 1; int n2 = 0; int n3;
        for(int i = 0; i < howManyNumbers; i++){

            numbers[i] = n1;
            n3 = n2 + n1;
            n2 = n1;
            n1 = n3;

        }
        return numbers;
    }
}
