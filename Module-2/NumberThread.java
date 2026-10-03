class NumberThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

class CharacterThread extends Thread
{
    public void run()
    {
        for(char c = 'A'; c <= 'E'; c++)
            System.out.println(c);
    }
}

class MessageThread extends Thread
{
    public void run()
    {
        System.out.println("Hello Java");
    }
}

class Main
{
    public static void main(String[] args)
    {
        NumberThread t1 = new NumberThread();
        CharacterThread t2 = new CharacterThread();
        MessageThread t3 = new MessageThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
