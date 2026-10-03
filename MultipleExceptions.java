import java.util.Scanner;

class MultipleException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30};

        try
        {
            int index = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(a[index] / n);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        finally
        {
            System.out.println("Exception handling completed");
        }
    }
}
