package MultiThreadingDemo.SyncAndLocking.ThreadsDemo;
public class LambdaDemo {
    public static void main(String[] args) throws InterruptedException {
        //Runnable obj1 = () -> {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("hi");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            };
//        Runnable obj2 = () -> {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("hello");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            };
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Hi-Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"Hello-Thread");
        t1.start();;
        Thread.sleep(10);
        t2.start();
    }
}