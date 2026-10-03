import java.util.Scanner;

class Transpose
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];

        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
                System.out.print(a[j][i] + " ");

            System.out.println();
        }
    }
}
