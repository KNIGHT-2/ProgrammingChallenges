package SquareEveryDigit;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareDigits(123456789)));

    }
    static int[] squareDigits(int number){

        String[] stringArrayOfNumbers = String.valueOf(number).split("");

        int[] numbers = new int[stringArrayOfNumbers.length];

        for(int i = 0; i < stringArrayOfNumbers.length; i++){
            numbers[i] = Integer.parseInt(stringArrayOfNumbers[i]);
        }

        int[] squareNumbers = Arrays.stream(numbers).map(s -> (int) Math.pow(s, 2)).toArray();

        return squareNumbers;
    }
}
