import java.util.Scanner;

class SumColumn
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for(int j = 0; j < 3; j++)
        {
            int sum = 0;

            for(int i = 0; i < 3; i++)
                sum = sum + a[i][j];

            System.out.println("Column " + (j + 1) + " = " + sum);
        }
    }
}
