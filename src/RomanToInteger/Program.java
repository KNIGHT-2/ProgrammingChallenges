package RomanToInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your roman number: ");
        String romanNumber = scan.nextLine().toUpperCase();
        int integerNumber = 0;

        char[] splittedNumber = romanNumber.toCharArray();
        for(int i = 0; i < splittedNumber.length; i++) {
            System.out.println(splittedNumber[i]);
        }
        List<Integer> integerNumberList = new ArrayList<>();

        for(char c : splittedNumber){
            integerNumberList.add(whatsNumberIs(c));
        }

        integerNumberList.forEach(s -> System.out.print(s + " "));

        for(int i = 0; i < (integerNumberList.size()-1); i++){
            if(shoudISum(integerNumberList.get(i), integerNumberList.get(i+1))){
                if(i>0){
                    integerNumber+= integerNumberList.get(i+1);
                }
                else{
                    integerNumber = integerNumberList.get(i) + integerNumberList.get(i+1);
                }
            }else{
                if(i>0){
                    integerNumber = integerNumberList.get(i+1) - integerNumber;
                }else{
                    integerNumber = integerNumberList.get(i+1) + integerNumber - integerNumberList.get(i);
                }
            }
            System.out.println("Dentro do for: " + integerNumber);
        }
        System.out.println("\n" + integerNumber);
    }

    static boolean shoudISum(int number1, int number2){
        if(number1 < number2){
            return false;
        }else if(number1 > number2){
            return true;
        }
        return true;
    }

    static int whatsNumberIs(char c){
        if(c == 'I'){
            return 1;
        }else if (c == 'V'){
            return 5;
        }else if (c == 'X'){
            return 10;
        }else if(c == 'L'){
            return 50;
        } else if(c == 'C'){
            return 100;
        }else if(c == 'D'){
            return 500;
        }else if(c == 'M'){
        return 1000;
        }
        return 0;
    }
}