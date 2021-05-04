package ru.progwards.sever.testprogwards.example.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.StampedLock;
import java.util.stream.IntStream;

/**
 * @author Oleg Kiselev
 */
public class ThreadExample {

    public void semaphore() {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(5);

        Runnable longRunningTask = () -> {
            boolean permit = false;
            try {
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if (permit) {
                    System.out.println("Semaphore acquired");
                    TimeUnit.SECONDS.sleep(1);
                } else {
                    System.out.println("Could not acquire semaphore");
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } finally {
                if (permit) {
                    semaphore.release();
                }
            }
        };

        IntStream.range(0, 10)
                .forEach(i -> executor.submit(longRunningTask));

        executor.shutdown();
    }

    /* ------------------- */

    public void stampedLock() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();
        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                TimeUnit.SECONDS.sleep(1);
                map.put("foo", "bar");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        Runnable readTask = () -> {
            long stamp = lock.readLock();
            try {
                System.out.println(map.get("foo"));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } finally {
                lock.unlockRead(stamp);
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

        executor.shutdown();
    }

    /* ------------------- */

    public void incrementCountLock() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ReentrantLock lock = new ReentrantLock();

        executor.submit(() -> {
            lock.lock();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        executor.submit(() -> {
            System.out.println("Locked: " + lock.isLocked());
            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
            boolean locked = lock.tryLock();
            System.out.println("Lock acquired: " + locked);
        });

        executor.shutdown();
    }


    /* ------------------- */

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
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }

    /* ------------------- */

    public void scheduledExecutorService() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
        ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

        try {
            TimeUnit.MILLISECONDS.sleep(1337);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms\n", remainingDelay);

        executor.shutdown();
    }

    /* ------------------- */

    public void callableFuture() {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());

        Integer result = null;
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("future done? " + future.isDone());
        System.out.print("result: " + result);
        executor.shutdown();
    }

    /* ------------------- */

    public void callableTask() {
        try {
            Callable<?> task = () -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    return 123;
                } catch (InterruptedException e) {
                    throw new IllegalStateException("task interrupted", e);
                }
            };

            System.out.println(task.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
        executor.shutdown();
    }

    /* ------------------- */

    public void runnableTaskTwo() {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /* ------------------- */

    public void runnableTask() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }

    /* ------------------- */

//    public Callable<String> callable(String result, long sleepSeconds) {
//        return () -> {
//            TimeUnit.SECONDS.sleep(sleepSeconds);
//            return result;
//        };
//    }
//
//    public void callableList() {
//        ExecutorService executor = Executors.newWorkStealingPool();
//
//        List<Callable<String>> callables = Arrays.asList(
//                callable("task1", 2),
//                callable("task2", 1),
//                callable("task3", 3));
//
//        String result = null;
//        try {
//            result = executor.invokeAny(callables);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//        System.out.println(result);
//    }

    /* ------------------- */

    public static void main(String[] args) {
        ThreadExample example = new ThreadExample();

//        example.callableList();

//        example.scheduledExecutorService();

//        example.incrementCount();

//        example.incrementCountLock();

//        example.stampedLock();

//        example.semaphore();

        System.out.println(ForkJoinPool.getCommonPoolParallelism());

    }

}
