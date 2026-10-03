import java.io.FileInputStream;

class FileRead
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream f = new FileInputStream("input.txt");
            int ch;

            while((ch = f.read()) != -1)
                System.out.print((char)ch);

            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
