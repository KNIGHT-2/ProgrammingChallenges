package SortNumbers;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        System.out.println(sortNumbers(84323));

    }
    static List<Integer> sortNumbers(int number){

        List<Integer> list = Arrays.stream(String.valueOf(number).split("")).sorted().toList().stream()
                .map(s -> Integer.parseInt(s)).toList();

        return list;
    }
}
