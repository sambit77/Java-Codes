package Multithreading;

public class ExtendEx{

   
    public static void main(String[] args) throws InterruptedException{
        

        System.out.println("Hello from driver : "+ Thread.currentThread().getName());

        Hello hthread = new Hello();
        Bye bthread = new Bye();
        hthread.start();
        bthread.start();
        System.out.println("Bye from main : "+ Thread.currentThread().getName());






    }


    
}

class Hello extends Thread
{
    public void run() 
    {
        Thread.currentThread().setName("Hello Thread");
        System.out.println("Hello from thread ? "+ Thread.currentThread().getName());
        //Thread.sleep(5000);

        //System.out.println("Bye from thread :=? "+ Thread.currentThread().getName());
    }
}

class Bye extends Thread
{
    public void run() 
    {
        Thread.currentThread().setName("Bye Thread");
        System.out.println("Bye from thread ? "+ Thread.currentThread().getName());
        //Thread.sleep(5000);

        //System.out.println("Bye from thread :=? "+ Thread.currentThread().getName());
    }
}


