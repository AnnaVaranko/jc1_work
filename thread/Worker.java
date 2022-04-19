package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": working");
    }

    public static void main(String[] args) {
//        new Thread(new Worker()).start();
//        new Thread(new Worker()).start();
        final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.schedule(new Worker(), 15, TimeUnit.SECONDS);
        executorService.schedule(new Worker(), 20, TimeUnit.SECONDS);
    }
}
