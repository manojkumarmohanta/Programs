import java.util.Scanner;

public class lab_2ndsem_9 {
    
    public static void main(String[] args) {
        //Write a program to add two times given in hour minutes and seconds using class and object?
        Scanner sc = new Scanner(System.in);
        int tsec;
        System.out.printf("Enter the first time (hours): ");
        int hr = sc.nextInt();
        System.out.printf("Enter the first time (minute): ");
        int min = sc.nextInt();
        System.out.printf("Enter the first time (second): ");
        int sec = sc.nextInt();
        System.out.println("Your given time is - "+hr+":"+min+":"+sec);

        hr *= 3600;
        min *= 60;
        tsec = (hr+min+sec);
        System.out.println("total seconds of your time is: "+tsec);
        sc.close();
    }
    
}

