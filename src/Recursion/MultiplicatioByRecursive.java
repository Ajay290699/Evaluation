package Recursion;

public class MultiplicatioByRecursive {

    public static void main(String[] args) {
        int num = 7;
        int i = 1;
        multiplication(num, i);

    }

    static void multiplication(int num, int i) {
        if (i > 10)
            return;
        System.out.println(num + " * " + i + " = " + num * i);
        multiplication(num, i + 1);
    }
}
