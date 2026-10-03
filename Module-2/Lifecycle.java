class LifeCycle extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Thread completed");
    }

    public static void main(String[] args)
    {
        LifeCycle t = new LifeCycle();

        System.out.println("New");
        t.start();
        System.out.println("Runnable");
    }
}
