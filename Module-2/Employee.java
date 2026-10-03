import java.io.*;
import java.util.Scanner;

class Employee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            DataOutputStream out =
                new DataOutputStream(new FileOutputStream("employee.dat"));

            out.writeInt(id);
            out.writeUTF(name);
            out.writeDouble(salary);
            out.close();

            DataInputStream in =
                new DataInputStream(new FileInputStream("employee.dat"));

            System.out.println(in.readInt());
            System.out.println(in.readUTF());
            System.out.println(in.readDouble());

            in.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
