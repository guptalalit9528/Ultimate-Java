package advance.ExecutiveFramework;

import java.util.concurrent.*;

class Square implements Callable <Integer>{
    private int num;

    public  Square(int num){
        this.num = num;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("Calculating square of "+num+" in "+Thread.currentThread());
        Thread.sleep(1000);
        return num*num;
    }
}

public class CallFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Create thread pool of 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit callable tasks -> get Future objects
        Future<Integer> future1 = executor.submit(new Square(5));
        Future<Integer> future2 = executor.submit(new Square(10));

        System.out.println("Tasks submitted, main thread can do other work...");

        // Fetch results later
        System.out.println("Result from task1: " + future1.get());   // blocks until result ready
        System.out.println("Result from task2: " + future2.get());

        executor.shutdown();
    }
}
