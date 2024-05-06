import java.util.*;
public class Lotery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random(); 
        System.out.println("LOTERY GAME");
        System.out.println("Enter Number :");
        int n = scanner.nextInt();
        System.out.println(" | first num | second num  | third num |");
        System.out.println("------------------------------------------");
        int lotery1 = r.nextInt(10);
        int lotery2 = r.nextInt(10);
        int lotery3 = r.nextInt(10);
        
        System.out.println(" | \t"+lotery1+"\t|\t"+lotery2+"\t|\t"+lotery3+"\t|");
        if(n == lotery1 && n == lotery2 && n ==lotery3){
            System.out.println("Congratulations! You Win");
        }
        else{
            System.out.println("Sorry, Try Again");
        }
        
    }
}
