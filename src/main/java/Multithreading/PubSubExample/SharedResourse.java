package Multithreading.PubSubExample;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResourse
{
    int bufferSize;
    Queue<Integer> queue;

    SharedResourse(int bufferSize)
    {
        this.bufferSize = bufferSize;
        queue = new LinkedList<>();
    }

    synchronized public void produce(int item)
    {
        while(bufferSize == queue.size())
        {
            System.out.println("Queue is full, producer have to wait for item:" + item);
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Item " + item + " has been added to Queue.");
        queue.add(item);

        //System.out.println("Notify thread to acquire lock who is waiting for this Producer resource");
        notify();
    }

    synchronized public int consume()
    {
        while(queue.isEmpty())
        {
            System.out.println("Queue is empty, so consumer have to wait.");

            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        int item = queue.poll();
        System.out.println("Item " + item + " has been polled to Queue.");
        notify();
        //System.out.println("Notify thread to acquire lock who is waiting for this Consumer resource");
        return item;
    }
}
