import java.util.Scanner;
public class DuplicateNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Duplicate numbers are: ");
        findDuplicates(arr);

        scanner.close();
    }

    public static void findDuplicates(int[] arr) {
        int i, j, n = arr.length;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}