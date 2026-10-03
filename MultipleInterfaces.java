interface Sports
{
    void sports();
}

interface Academics
{
    void academics();
}

class Student implements Sports, Academics
{
    public void sports()
    {
        System.out.println("Football");
    }

    public void academics()
    {
        System.out.println("Computer Science");
    }

    public static void main(String[] args)
    {
        Student s = new Student();

        s.sports();
        s.academics();
    }
}
