class Area
{
    void calculateArea(int side)
    {
        System.out.println("Square = " + side * side);
    }

    void calculateArea(int length, int breadth)
    {
        System.out.println("Rectangle = " + length * breadth);
    }

    void calculateArea(double radius)
    {
        System.out.println("Circle = " + 3.14 * radius * radius);
    }

    public static void main(String[] args)
    {
        Area a = new Area();

        a.calculateArea(5);
        a.calculateArea(5, 4);
        a.calculateArea(3.0);
    }
}
