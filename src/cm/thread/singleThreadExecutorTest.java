package cm.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class singleThreadExecutorTest {
    public static void main(String[] args) {
        //ExecutorService pool = Executors.newSingleThreadExecutor();
        //ExecutorService pool = Executors.newFixedThreadPool(3);
        ExecutorService pool = Executors.newCachedThreadPool();
       /* Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();
        Thread thread5 = new MyThread();
        Thread thread6 = new MyThread();
        Thread thread7 = new MyThread();

        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.execute(thread4);
        pool.execute(thread5);
        pool.execute(thread6);
        pool.execute(thread7);

        pool.shutdown();*/
        ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(2);
        exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间就触发异常

            @Override
            public void run() {
                // TODO Auto-generated method stub
                //throw new RuntimeException();
                System.out.println("===================");

            }
        }, 1000, 5000, TimeUnit.MILLISECONDS);

        exec.scheduleAtFixedRate(new Runnable() {//每隔一段时间打印系统时间，证明两者是互不影响的

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println(System.nanoTime());

            }
        }, 1000, 2000, TimeUnit.MILLISECONDS);

    }
}
