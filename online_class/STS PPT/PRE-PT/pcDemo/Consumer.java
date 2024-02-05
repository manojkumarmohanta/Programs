package pcDemo;

public class Consumer extends Thread {
    Stack stack;
    public Consumer(Stack stack){
        super();
        this.stack = stack;
    }
    public void run(){
        int item = 0;
        while(true){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            item = stack.pop();
            System.out.println("poped item successfully"+ item);
            

        }
    }
}
