package sorting;

public class BubbleSort {
    
    public static void main(String[] args) {
        int[] arr = {7, 6, 9, 10, 2, 5, 3, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[j];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        print(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
