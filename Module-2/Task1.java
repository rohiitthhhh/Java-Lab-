class Task1 implements Runnable
{
    public void run()
    {
        System.out.println("Task 1");
    }
}

class Task2 implements Runnable
{
    public void run()
    {
        System.out.println("Task 2");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());

        t1.start();
        t2.start();
    }
}
