package advance.Thread;

import java.util.concurrent.atomic.LongAdder;

class Cou {
    LongAdder count = new LongAdder();

    public void increment() {
        count.increment(); // thread-safe increment
    }

    public long getValue() {
        return count.sum(); // sab cells ka total
    }
}

public class AdderCla {
    public static void main(String[] args) throws InterruptedException {
            Cou c = new Cou();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count = " + c.getValue());
    }
}
