package MultiThreadingDemo.SyncAndLocking;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) {
        // Create two locks for two different resources
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        // first task
        Runnable task1 = () -> {
            try {
                lock1.lock();
                System.out.println("Task 1: Lock 1 acquired.");
                Thread.sleep(30000);
                System.out.println("Task 1: Lock 1 released.");
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                lock1.unlock();
            }
        };

        // second task
        Runnable task2 = () -> {
            try {
                lock2.lock();
                System.out.println("Task 2: Lock 2 acquired.");
                Thread.sleep(30000);
                System.out.println("Task 2: Lock 2 released.");
            } catch (InterruptedException e) {
                System.out.println(e);
            } finally {
                lock2.unlock();
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Both tasks completed. Exiting...");
    }
}
