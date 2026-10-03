class Student
{
    String name;
    int rollNo;
    double mark;

    void display()
    {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(mark);
    }

    public static void main(String[] args)
    {
        Student s = new Student();

        s.name = "Rohith";
        s.rollNo = 10;
        s.mark = 85;

        s.display();
    }
}
