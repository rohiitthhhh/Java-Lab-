import java.util.Scanner;

class DiagonalSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int p = 0, s = 0;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for(int i = 0; i < 3; i++)
        {
            p = p + a[i][i];
            s = s + a[i][2 - i];
        }

        System.out.println("Principal = " + p);
        System.out.println("Secondary = " + s);
    }
}
