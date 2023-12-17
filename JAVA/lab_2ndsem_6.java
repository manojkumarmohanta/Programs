import java.util.Scanner;

public class lab_2ndsem_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix: ");
        int rows = input.nextInt();

        System.out.println("Enter the number of columns in the matrix: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the number at row " + i + ", column " + j + ": ");
                matrix[i][j] = input.nextInt();
            }
        }
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 2 == 1) {
                    oddCount++;
                } else {
                    evenCount++;
                }
            }
        }

        System.out.println("The frequency of odd numbers is " + oddCount);
        System.out.println("The frequency of even numbers is " + evenCount);
        input.close();
    }
}
