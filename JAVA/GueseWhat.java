import java.util.*;
public class GueseWhat {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int SystemNumber = random.nextInt(100);
        System.out.println("GAME: - System Generate a number And You Have To Guess.");
        int UserInput = sc.nextInt();
        
        for(i=1;i<=100;i++){
            if(UserInput == SystemNumber){
                System.out.println("Your guess is correct ");
                break;
            }else if(UserInput > SystemNumber){
                System.out.println("Your number is greater");
                
            }else if(UserInput < SystemNumber){
                System.out.println("Your number is smaller");
            }
            UserInput = sc.nextInt();
        }
        System.out.println("System think the number "+SystemNumber);
        System.out.println("You choose "+i+" times");
     
    }
}
