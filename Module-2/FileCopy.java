import java.io.*;

class FileCopy
{
    public static void main(String[] args)
    {
        try
        {
            BufferedInputStream in =
                new BufferedInputStream(new FileInputStream("input.txt"));

            BufferedOutputStream out =
                new BufferedOutputStream(new FileOutputStream("output.txt"));

            int ch;

            while((ch = in.read()) != -1)
                out.write(ch);

            in.close();
            out.close();

            System.out.println("File copied");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
