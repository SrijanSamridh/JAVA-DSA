package MultiThreadingDemo.SyncAndLocking.homework.Resources;
import java.util.concurrent.locks.ReentrantLock;

public class Resource2Task implements Runnable {
    private final ReentrantLock lock;

    public Resource2Task(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("Task 2: Lock 2 acquired.");
            Thread.sleep(30000);
            System.out.println("Task 2: Lock 2 released.");
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        } finally {
            lock.unlock();
        }
    }
}
