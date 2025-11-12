package advance.Thread;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicC{
   AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.incrementAndGet();

    }
}


public class AtomicObj {
    public static void main(String[] args) throws InterruptedException {
        AtomicC c = new AtomicC();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++)
                c.increment();
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++)
                c.increment();
        });


        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.printf("Final Count ="+ c.count.get());

    }
}
