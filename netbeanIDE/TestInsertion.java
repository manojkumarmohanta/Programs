import java.util.*;

public class TestInsertion {
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    static int insertElementInArray(int element, int position, int arr[]) {
        if (position >= arr.length) {
            return -1;
        }
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        display(arr);
        int element = 7, position = 3;
        arr = Arrays.copyOf(arr, arr.length + 1);
        insertElementInArray(element, position, arr);
        display(arr);
    }

}