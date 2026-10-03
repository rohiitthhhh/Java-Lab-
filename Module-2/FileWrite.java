import java.io.FileOutputStream;
import java.util.Scanner;

class FileWrite
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter text: ");
            String s = sc.nextLine();

            FileOutputStream f = new FileOutputStream("output.txt", true);
            f.write((s + "\n").getBytes());
            f.close();

            System.out.println("Data written");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
