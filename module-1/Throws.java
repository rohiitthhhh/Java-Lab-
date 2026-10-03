class Throws
{
    static void checkAge(int age) throws Exception
    {
        if(age < 18)
            throw new Exception("Age is less than 18");

        System.out.println("Eligible");
    }

    public static void main(String[] args)
    {
        try
        {
            checkAge(15);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
