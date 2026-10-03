import java.util.Scanner;

class Sum2DArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        int sum = 0;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }
}
