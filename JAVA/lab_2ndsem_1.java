import java.util.Scanner;
public class lab_2ndsem_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j,count;

        int range = input.nextInt();
        
        System.out.println("1");
        for(i=2;i<=range;i++){
           count=0;
           for(j=1;j<=i/2;j++){
            if(i%j==0){
                count++;
            }
           }
           if(count>1){
            continue;

           }
           System.out.println(i);
        }
        
    }
}
