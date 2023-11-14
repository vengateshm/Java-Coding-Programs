package concurrency;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        IntStream.range(0,1000).forEach(i-> executorService.submit(atomicInteger::incrementAndGet));
        Thread.sleep(2_000);
        System.out.println(atomicInteger.get());
        //LongAdder
        //LongAccumulator
        //ConcurrentMap

        //ConcurrentHashMap
        //Uses parallelism-threshold
        //If T is 100, size is 80 - operation will be performed on single thread
        //forEach order may vary, search, reduce
        //Thread handling by system
    }
}
