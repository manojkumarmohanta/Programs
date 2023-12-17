import java.util.*;
public class RockPaperScissor{
    public static void main(String[] args) {
        //0 rock
        //1 paper
        //2 scissor
        Scanner dom = new Scanner(System.in);
        Random random = new Random();
        System.out.println("You Can Choice 0 for rock, 1 for paper 2 for scissor");
        int UserInput = dom.nextInt();
        int SystemInput = random.nextInt(3);
        if(UserInput == SystemInput){
            System.out.println("Draw");
        }else if(UserInput == 0 && SystemInput == 2 || UserInput == 1 && SystemInput == 0 || UserInput == 2 && SystemInput == 1){
            System.out.println("You Win");
        }else {
            System.out.println("Computer Win");
        }
        System.out.println("computer choose: "+ SystemInput);
        dom.close();
    }
}