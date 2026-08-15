package Multithreading.LifeCycleThread;

public class SharedResource
{
    private boolean isAvailable;
    public SharedResource()
    {
        isAvailable = false;
    }

    synchronized public void helper()
    {
        System.out.println("Lock Acquired: " + Thread.currentThread().getName());
        isAvailable = true;
        try
        {
            Thread.sleep(9000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("Lock Release: " + Thread.currentThread().getName());
    }
}
