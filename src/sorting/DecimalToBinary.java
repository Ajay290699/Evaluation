package sorting;

public class DecimalToBinary {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a decimal number: ");
//        int decimal = sc.nextInt();
//        int[] binary = new int[32];
//        int i = 0;
//        while (decimal > 0) {
//            binary[i++] = decimal % 2;
//            decimal /= 2;
//        }
//        System.out.print("Binary equivalent: ");
//        for (int j = i - 1; j >= 0; j--) {
//            System.out.print(binary[j]);
//        }
        binaryNo(20);
    }

    public static void binaryNo(int num) {
        int[] arr = new int[20];
        int i = 0;
        while (num > 0) {
            arr[i++] = num % 2;
            num = num / 2;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
