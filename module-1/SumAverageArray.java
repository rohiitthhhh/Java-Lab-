import java.util.Scanner;

class SumAverageArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        double avg = (double)sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
