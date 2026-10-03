interface Printable
{
    void print();
}

class Student implements Printable
{
    public void print()
    {
        System.out.println("Student details");
    }
}

class Teacher implements Printable
{
    public void print()
    {
        System.out.println("Teacher details");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();
        Teacher t = new Teacher();

        s.print();
        t.print();
    }
}
