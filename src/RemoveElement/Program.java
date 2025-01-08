package RemoveElement;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7};
        Set<Integer> toRemove = Set.of(2, 5, 7);

        List<String> list = new ArrayList<>();

        int count = 0;
        for(int number : numbers){
            if(!toRemove.contains(number)){
                list.add(String.valueOf(number));
            }else{
                count++;
            }
        }

        for(int i = 0; i < count; i++){
            list.add("_");
        }
        System.out.println(list);
    }
}