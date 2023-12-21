package MultiThreadingDemo.SyncAndLocking.homework;
import MultiThreadingDemo.SyncAndLocking.homework.Resources.*;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        Thread thread1 = new Thread(new Resource1Task(lock1));
        Thread thread2 = new Thread(new Resource2Task(lock2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        System.out.println("Both tasks completed. Exiting...");
    }
}
