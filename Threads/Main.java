package Threads;

class Counter
{
    int count;
    public synchronized void countIncrement()
    {
        count++;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Counter c_obj = new Counter();
        Runnable obj = () -> {              // Lambda Function
            for(int i=0; i< 500; i++)
            {
                c_obj.countIncrement();
            }
        };
        Runnable obj1 = () -> {
            for(int i=0; i< 500; i++)
            {
                c_obj.countIncrement();
            }
        };

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);

        System.out.println("Output:");

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c_obj.count); // The Output : 1000
    }
}