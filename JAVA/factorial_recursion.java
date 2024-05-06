import java.util.*;

public class factorial_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The factorial is : "+ factorial(num));
        sc.close();
    }
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }
    
}