class Account
{
    int balance = 1000;

    synchronized void withdraw(int amount)
    {
        if(balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Balance: " + balance);
        }
        else
            System.out.println("Insufficient balance");
    }
}

class Customer extends Thread
{
    Account a;

    Customer(Account a)
    {
        this.a = a;
    }

    public void run()
    {
        a.withdraw(600);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Account a = new Account();

        Customer c1 = new Customer(a);
        Customer c2 = new Customer(a);

        c1.start();
        c2.start();
    }
}
