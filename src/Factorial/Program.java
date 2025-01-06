package Factorial;

public class Program {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n1){
        int n2 = n1;
        for(;;){
            n1--;
            if(n1 == 0){
                break;
            }
            n2 = n2 * n1;
        }
        return n2;
    }
}
