class Shape
{
    void draw()
    {
        System.out.println("Shape");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("Rectangle");
    }
}

class Dispatch
{
    public static void main(String[] args)
    {
        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}
