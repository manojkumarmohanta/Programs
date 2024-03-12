import java.util.*;

public class missingNumber {
    // finding missing number
    public static int printMissingNum(int[] arr, int n) {
        int sum = ((n + 1) * (n + 2)) / 2;
        int asum = 0;
        for (int i = 0; i < n; i++) {
            asum += arr[i];
        }
        return sum - asum;
        // int[] arr1 =new int[n+1];
        // int sum = 0;
        // for(int i=0; i<=n; i++){
        //     arr1[arr[i]+1]
        // }
        // for(int i=0; i<=n; i++){
            
        // }
        // for(int i=0; i<=n; i++){
            
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length 1 - 10 you want to input:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            nums[i] = sc.nextInt();
        }
        // Sorting the array in ascending order
        Arrays.sort(nums);
        // for (int i = 0; i < n; i++) {
        //     System.out.println("number  " + (i + 1) + ": " + nums[i]);
        // }
        System.out.print("The missing number is: " + printMissingNum(nums, n));

    }

}