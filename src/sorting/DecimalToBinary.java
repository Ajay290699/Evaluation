package sorting;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int[] binary = new int[32];
        int i = 0;
        while (decimal > 0) {
            binary[i++] = decimal % 2;
            decimal /= 2;
        }
        System.out.print("Binary equivalent: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}
