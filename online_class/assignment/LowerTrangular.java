import java.util.Scanner;

public class LowerTrangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the lower triangular matrix: ");
        int size = scanner.nextInt();

        int[][] lowerTriangularMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                lowerTriangularMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The lower triangular matrix is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(lowerTriangularMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
