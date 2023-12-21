package MultiThreadingDemo.SyncAndLocking;

public class Sync {
    public static void main(String[] args) throws InterruptedException{
        ResourceClass resourceClass = new ResourceClass();
        RunnableTask runnableTask = new RunnableTask(resourceClass);

        Thread t1 = new Thread(runnableTask);
        Thread t2 = new Thread(runnableTask);
        Thread t3 = new Thread(runnableTask);

        System.out.println("Thread Created : " + t1.getState());
        System.out.println("Thread Created : " + t1.getState());
        System.out.println("Thread Created : " + t1.getState());

        t1.start();
        t2.start();
        t3.start();

    }
}
