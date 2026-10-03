class Demo
{
    void display()
    {
        System.out.println("Object");
    }

    protected void finalize()
    {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1 = null;
        d2 = null;

        System.gc();
    }
}
