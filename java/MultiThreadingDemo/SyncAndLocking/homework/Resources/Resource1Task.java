package MultiThreadingDemo.SyncAndLocking.homework.Resources;
import java.util.concurrent.locks.ReentrantLock;

public class Resource1Task implements Runnable {
    private final ReentrantLock lock;

    public Resource1Task(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("Task 1: Lock 1 acquired.");
            Thread.sleep(30000);
            System.out.println("Task 1: Lock 1 released.");
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        } finally {
            lock.unlock();
        }
    }
}
