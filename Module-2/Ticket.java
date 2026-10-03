class Ticket
{
    int tickets = 5;

    synchronized void book(String name, int count)
    {
        if(tickets >= count)
        {
            tickets = tickets - count;
            System.out.println(name + " booked " + count + " tickets");
            System.out.println("Remaining = " + tickets);
        }
        else
            System.out.println("Tickets not available for " + name);
    }
}

class Customer extends Thread
{
    Ticket t;
    String name;

    Customer(Ticket t, String name)
    {
        this.t = t;
        this.name = name;
    }

    public void run()
    {
        t.book(name, 2);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Ticket t = new Ticket();

        Customer c1 = new Customer(t, "A");
        Customer c2 = new Customer(t, "B");
        Customer c3 = new Customer(t, "C");

        c1.start();
        c2.start();
        c3.start();
    }
}
