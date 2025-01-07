package MultiplesOf3Or5;

import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<Integer> multiples = multiplesBelow(23);
        System.out.println(multiples + "\n" + sumOfMultiples(multiples));
    }
    static Set<Integer> multiplesBelow(int number){
        Set<Integer> multiples = new TreeSet<>();
        for(int i = number - 1; i > 0; i--){
            if(i%3 == 0 || i%5 == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }
    static int sumOfMultiples(Set<Integer> multiples){
        int sum = multiples.stream().reduce(0, (x, y) -> x + y);
        return sum;
    }
}
