package pcDemo;

public class Producer extends Thread{
    Stack stack;
    public Producer(Stack stack){
        super();
        this.stack = stack;
    }
    public void run(){
        int i = 0;
        while(true){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
            if(stack.push(i) < 0){
                System.out.println("Operation Failed");
            }else{
                System.out.println("Item pushed successfully"+ i);
            }
            

        }
    }
}
