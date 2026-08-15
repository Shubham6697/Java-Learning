package Multithreading.PubSubExample;

public class ProducerConsumerLearning
{
    public static void main(String[] args) {

        SharedResourse resourse = new SharedResourse(5);

        Thread producerThread = new Thread(() ->{
            for(int i = 1;i <= 10;i++)
            {
                System.out.println("Run :"+ i);
                resourse.produce(i);
            }
        });

        Thread consumerThread = new Thread(() ->{
            for(int i = 1;i <= 10;i++)
            {
                System.out.println("Consumed item:" + resourse.consume());
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
