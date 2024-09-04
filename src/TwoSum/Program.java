package TwoSum;

import java.util.Arrays;

public class Program {
    public static void main(String[] args){

        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(answer(numbers, target)));
    
    }

    static boolean isTheTarget(int n1, int n2, int target){
        if(n1 + n2 == target){
            return true;
        }
        return false;
    }
    static int[] answer(int[] numbers, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    if (isTheTarget(numbers[i], numbers[j], target)) {
                        answer[0] = j;
                        answer[1] = i;
                    }
                }
            }
        }
        return answer;
    }
}
