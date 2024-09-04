package RemoveElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7};

        int[] toRemove = new int[]{2, 5, 7};

        List<String> list = new ArrayList<>();
        int count = 0;
        for(int value : toRemove) {
            count += (int) Arrays.stream(numbers).filter(number -> number == value).count();

            list = Arrays.stream(numbers).filter(number -> number != value)
                    .mapToObj(number -> String.valueOf(number))
                    .collect(Collectors.toList());
        }
        for(int i = 0; i < count; i++){
            list.add("_");
        }
        System.out.println(list);
    }
}