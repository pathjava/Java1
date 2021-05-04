package ru.progwards.sever.testprogwards.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * @author Oleg Kiselev
 */
public class RacingConditionTest {

    ReentrantLock lock = new ReentrantLock();
    int count = 0;

    void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public void incrementCount() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        IntStream.range(0, 10000)
                .forEach(i -> executor.submit(this::increment));

        executor.shutdown();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        RacingConditionTest rct = new RacingConditionTest();

        rct.incrementCount();
    }

}
