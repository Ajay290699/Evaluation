package Recursion;

import java.util.Scanner;

public class MultiplicatioByRecursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you want a multipication table :");
        int num = sc.nextInt();
        multiplication(num, 1);

    }

    public static void multiplication(int num, int i) {
        if (i > 10)
            return;
        System.out.println(num + " * " + i + " = " + num * i);
        multiplication(num, i + 1);

    }
}
