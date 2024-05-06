//Write a Java Program to copy all elements of one array into another array?
import java.util.Scanner;
public class lan_2ndsem_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create two arrays
        System.out.println("Enter a range : ");
        int rg = sc.nextInt();
        int[] originalArray = new int[rg];
        int[] newArray = new int[originalArray.length];

        for(int i=0;i<rg;i++){
            System.out.println("Enter index value of "+i+" :");
            originalArray[i] =sc.nextInt(); 
        }
        // Copy all elements of the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Print the new array to show that the elements have been copied
        System.out.println("copied array is : ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        sc.close();
    }
}