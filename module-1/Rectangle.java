class Rectangle
{
    int length, breadth;

    Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    Rectangle(int s)
    {
        length = s;
        breadth = s;
    }

    void area()
    {
        System.out.println(length * breadth);
    }

    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 4);
        Rectangle r3 = new Rectangle(5);

        r1.area();
        r2.area();
        r3.area();
    }
}
