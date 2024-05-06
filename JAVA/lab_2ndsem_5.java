import java.util.Arrays;
import java.util.Scanner;
public class lab_2ndsem_5 {
    //Write a Java Program to sort the elements of an array in ascending order?
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an array of integers
        
        System.out.println("enter the range:");
        int rg = sc.nextInt();
        int[] array = new int[rg];
        for(int i=0;i<rg;i++){
            System.out.println("Enter array value index of "+i+" :");
            array[i] = sc.nextInt();
        }
        // Sort the array in ascending order
        Arrays.sort(array);
        System.out.println("Array values in ascending order: ");
        // Print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}
