import java.util.Scanner;

class LargestandSmallest2DArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];

        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        int large = a[0][0];
        int small = a[0][0];

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                if(a[i][j] > large)
                    large = a[i][j];

                if(a[i][j] < small)
                    small = a[i][j];
            }
        }

        System.out.println("Largest = " + large);
        System.out.println("Smallest = " + small);
    }
}
