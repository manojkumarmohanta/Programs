import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lab_2ndsem_14 {

    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("thread-1 :"+i);
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("thread-2 :"+i);
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("thread-3 :"+i);
                }
            }
        });

        
        executorService.shutdown();
    }
}