package MultiThreadingDemo.SyncAndLocking.ThreadsDemo;

class Hi implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hello implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        Thread.sleep(10);
        t2.start();

        System.out.println(t1.isAlive() ? "Thread T1 is Live! " : "Thread T1 is Dead!");
        System.out.println(t2.isAlive() ? "Thread T2 is Live! " : "Thread T2 is Dead!");
        t1.join();
        t2.join();
        System.out.println(t1.isAlive() ? "Thread T1 is Live! " : "Thread T1 is Dead!");
        System.out.println(t2.isAlive() ? "Thread T2 is Live! " : "Thread T2 is Dead!");

        System.out.println("Thread T1 & T2 have been executed : Exit with Status 0");
    }
}
