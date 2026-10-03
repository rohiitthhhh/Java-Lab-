import java.io.*;

class StudentData
{
    public static void main(String[] args)
    {
        try
        {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("student.dat"));

            out.writeInt(10);
            out.writeUTF("Rohith");
            out.writeDouble(85.5);
            out.close();

            DataInputStream in = new DataInputStream(new FileInputStream("student.dat"));

            int roll = in.readInt();
            String name = in.readUTF();
            double mark = in.readDouble();

            in.close();

            System.out.println(roll);
            System.out.println(name);
            System.out.println(mark);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
