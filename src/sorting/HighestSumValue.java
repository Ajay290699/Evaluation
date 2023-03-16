package sorting;
//
//import java.util.Scanner;
//
//public class HighestSumValue {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number :");
//        int num = sc.nextInt();
//        int highestSum =0;
//        while (num>0){
//            int digit1 = num%10;
//            num = num/10;
//            while (num > 0){
//                int digit2 = num %10;
//                int sum = digit1+digit2;
//                if (sum>highestSum){
//                    highestSum=sum;
//                }
//                num= num/10;
//            }
//            num = num/10 +digit1*10;
//        }
//        System.out.println("highest two digit sum : "+highestSum);
//    }
//}

import java.util.Scanner;

public class HighestSumValue {
    public static int highestSumValue(int number) {
        // convert the number to a string to iterate over its digits
        String numberStr = Integer.toString(number);
        int maxSum = 0;

        // iterate over each pair of digits and calculate their sum
        for (int i = 0; i < numberStr.length(); i++) {
            for (int j = i + 1; j < numberStr.length(); j++) {
                int digitSum = Character.getNumericValue(numberStr.charAt(i)) + Character.getNumericValue(numberStr.charAt(j));

                // if the sum is greater than the current max, update it
                if (digitSum > maxSum) {
                    maxSum = digitSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(highestSumValue(123456));  // prints 9, which is the sum of 4 and 5
        System.out.println(highestSumValue(987694321));  // prints 17, which is the sum of 8 and 9
        System.out.println(highestSumValue(11111));  // prints 2, which is the sum of the two leftmost digits

        int[] arr = {24, 63, 1, 78, 96, 58, 26, 45, 5};
        HighestSumValue h = new HighestSumValue();
        System.out.println(h.linearSearch(arr, 5));
//        System.out.println("Enter a word :");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(h.reverseString(word));
    }

    public String reverseString(String word) {
        String newString = "";
        // saurabh style
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//             newString = c + newString;
//        }
        for (int i = word.length() - 1; i >= 0; i--) {
            newString = newString + word.charAt(i);
        }
        return newString;
    }

    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
