import java.util.Scanner;

public class lab_2ndsem_7 {
    public static void main(String[] args) {
        // Write a Java Program to determine whether a given string is palindrome?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean isPalindrome = isPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
    private static boolean isPalindrome(String inputString) {
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
    
}
