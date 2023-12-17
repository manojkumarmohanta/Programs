import java.util.Scanner;

public class DecimalToBinary {
    public static String convertDecimalToBinary(int decimal) {
    StringBuilder binary = new StringBuilder();
    while (decimal > 0) {
        int remainder = decimal % 2;
        decimal /= 2;
        binary.append(remainder);
    }
    return binary.reverse().toString();
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int decimal = scan.nextInt();
        System.out.println("The binary representation of " + decimal + " is " + convertDecimalToBinary(decimal));
    }
}
