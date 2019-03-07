package ch14;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class Concurrent {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,Integer > c = new ConcurrentHashMap<>();
       // c.put("tom",0);
       // c.put("tom",new LongAdder());
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable r = ()->{
           // c.put("tom",new LongAdder());
           // c.putIfAbsent("tom",new LongAdder()).increment();
            c.merge("tom",1,Integer::sum);
        };
        for(int i= 0;i<10000;i++){
            executorService.execute(r);
        }
        Thread.sleep(3000);
        executorService.shutdown();
        System.out.println(c.get("tom"));

    }
}
