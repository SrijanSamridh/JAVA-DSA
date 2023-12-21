package MultiThreadingDemo.SyncAndLocking;


public class RunnableTask implements Runnable {
    public ResourceClass resourceClass;


    public RunnableTask(ResourceClass resourceClass) {
        this.resourceClass = resourceClass;
    }


    @Override
    public void run() {
        try {
            resourceClass.useResource();
        } catch (InterruptedException e) {
//
            System.out.println("Exception Came");
        }
    }
}
