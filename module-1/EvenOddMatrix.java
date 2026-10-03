import java.util.Scanner;

class EvenOddMatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;

        int a[][] = new int[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                a[i][j] = sc.nextInt();

                if(a[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
