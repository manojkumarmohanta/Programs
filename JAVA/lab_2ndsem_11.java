//Write a Java program to find the combination c(n,r) by inheriting from a class that computes the factorial of a number?

import java.util.Scanner;

public class lab_2ndsem_11 {
    static class Factorial {

        static long factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }

    static long combination(int n, int r) {
        return Factorial.factorial(n) / (Factorial.factorial(r) * Factorial.factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Enter r: ");
        int r = scanner.nextInt();

        System.out.println("c(n,r) = " + combination(n, r));
        scanner.close();
    }
}