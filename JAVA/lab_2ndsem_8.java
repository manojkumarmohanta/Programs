import java.util.Scanner;

public class lab_2ndsem_8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("The binary number is: " + binaryNumber);
        scanner.close();
    }
}
