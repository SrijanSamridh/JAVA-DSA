package MultiThreadingDemo.SyncAndLocking;


import java.util.concurrent.Semaphore;


public class ResourceClass {


    public static Semaphore semaphore = new Semaphore(2);


    public void useResource() throws InterruptedException {


        semaphore.acquire();


        try {
            System.out.println("This Resource is being used by " + Thread.currentThread().getId());
            Thread.sleep(10000);
        } finally {
            System.out.println("This Resource execution is completed by" + Thread.currentThread().getId());
            semaphore.release();
        }
    }


}
