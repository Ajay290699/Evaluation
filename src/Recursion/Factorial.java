package Recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
    }


    // using reverse number counting
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    // using forward number counting
    public static int factorialIterative(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result = result * i;
                System.out.println(result);
            }
            return result;
        }
    }
}
