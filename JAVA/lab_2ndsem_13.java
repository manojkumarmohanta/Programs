import java.util.Scanner;

public class lab_2ndsem_13 {
    public static int findLargest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the numbers in the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int largest = findLargest(array);
        System.out.println("The largest number in the array is: " + largest);
        insertionSort(array);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}