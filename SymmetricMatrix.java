import java.util.Scanner;

class Symmetric
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        boolean flag = true;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(a[i][j] != a[j][i])
                    flag = false;
            }
        }

        if(flag)
            System.out.println("Symmetric");
        else
            System.out.println("Not Symmetric");
    }
}
