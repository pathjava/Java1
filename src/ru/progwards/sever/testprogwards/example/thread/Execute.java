package ru.progwards.sever.testprogwards.example.thread;

import java.util.concurrent.*;

/**
 * @author Oleg Kiselev
 */
public class Execute {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

//        service.execute(new Runnable() {
//            public void run() {
//                System.out.println("Another thread was executed");
//            }
//        });

//        Future<?> future = service.submit(new Runnable() {
//            public void run() {
//                System.out.println("Another thread was executed");
//            }
//        });
//        try {
//            future.get();
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }

        Future<?> future = service.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Another thread was executed");
                return "result";
            }
        });
        try {
            System.out.println("Result: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

}
