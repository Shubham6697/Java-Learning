package Multithreading.LifeCycleThread;

public class Main
{
    public static void main(String[] args)
    {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(()->{
            System.out.println("Calling helper from " + Thread.currentThread().getName());
            resource.helper();
        });
        t1.setName("Thread 1");

        Thread t2 = new Thread(()->{
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("Calling helper from " + Thread.currentThread().getName());
            resource.helper();
        });

        t2.setName("Thread 2");

        t1.start();
        t2.start();

//        try {
//            t1.stop();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
