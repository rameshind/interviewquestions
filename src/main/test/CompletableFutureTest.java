package main.test;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random ran = new Random(200);
        Supplier<String> dummyTask = () -> {
            /*try {
                Thread.sleep(ran.nextInt());
            } catch (InterruptedException ignored) {
            }*/
            System.out.println(Thread.currentThread().getName());
            return  ""+Thread.currentThread().getName();
        };

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(dummyTask);
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(dummyTask);
       // f1 = f1.whenComplete((aVoid, throwable) -> System.out.println("Completed f1"));
        //f2 = f2.whenComplete((aVoid, throwable) -> System.out.println("Completed f2"));
        CompletableFuture[] all = {f1, f2};
        CompletableFuture.allOf(all).join();
        /*allOf.whenComplete((aVoid, throwable) -> {
            System.out.println("Completed allOf");
        });
        allOf.join();*/
        System.out.println("Joined");
    }
}