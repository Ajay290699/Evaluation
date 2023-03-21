package programs;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word that you want to reverse : ");
        String word = sc.next();
        char[] charArray = word.toCharArray();
        System.out.println(reverse(charArray));
    }

    public static char[] reverse(char[] charArray) {
        int i = 0;
        int j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return charArray;
    }
}
