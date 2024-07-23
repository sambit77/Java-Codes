//package Multithreading;

public class RunnableEx{

   
    public static void main(String[] args) throws InterruptedException{
        

        System.out.println("Hello from driver : "+ Thread.currentThread().getName());

        //Runnable objects
        Hello hthread = new Hello();
        Bye bthread = new Bye();

        Thread th1 = new Thread(hthread);
        Thread th2 = new Thread(bthread);
        th1.start();
        th2.start();
        System.out.println("Bye from main : "+ Thread.currentThread().getName());






    }


    
}

class Hello implements Runnable
{
    public void run() 
    {
        Thread.currentThread().setName("Hello Thread");
        System.out.println("Hello from thread ? "+ Thread.currentThread().getName());
        //Thread.sleep(5000);

        //System.out.println("Bye from thread :=? "+ Thread.currentThread().getName());
    }
}

class Bye implements Runnable
{
    public void run() 
    {
        Thread.currentThread().setName("Bye Thread");
        System.out.println("Bye from thread ? "+ Thread.currentThread().getName());
        //Thread.sleep(5000);

        //System.out.println("Bye from thread :=? "+ Thread.currentThread().getName());
    }
}


