import java.util.Scanner;

public class SumOfUpperTrangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the upper triangular matrix: ");
        int size = scanner.nextInt();

        int[][] upperTriangularMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                upperTriangularMatrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                sum += upperTriangularMatrix[j][i - j];
            }
        }
        System.out.println("The sum of the lower triangular matrix is: " + sum);
        scanner.close();
    }
}
