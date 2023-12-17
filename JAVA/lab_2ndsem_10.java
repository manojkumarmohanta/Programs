import java.util.Scanner;
public class lab_2ndsem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt(); 
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.printf((j*i) +" ");
            }
            System.out.printf("\n");
        }
       sc.close();
    }
}
