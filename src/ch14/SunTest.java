package ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SunTest {
    private static Sum sum = new Sum();
    public static void main(String[] args) throws InterruptedException {


        ExecutorService executor =
                Executors.newFixedThreadPool(100);
        for (int k = 0;k<100; k++) {
            Runnable r = () -> {
                sum.inc();
            };
            executor.execute(r);
        }
            executor.shutdown();
            Thread.sleep(3000);
            System.out.println(sum.get());
        }

    }


