/**
* program for performance comparison between bubble and selection sorts
* Author: Philippe Matias
*/


public class Comparison
{
    public static void main(String[] args)
    {
        System.out.println("Num. Elements\tBubble\tSelection\tRatio");
        for (int i = 1; i <= 20; ++i)
        {
            int n = i*10;
            int b = Comparison.bubble(n);
            int s = Comparison.select(n);
            double ratio = (double)b / (double)s;

            System.out.printf("%d\t\t%d\t%d\t\t%.2f\n", n, b, s, ratio);
        }
    }

    public static int bubble(int n)
    {
        return (n*n - 2*n + 1);
    }

    public static int select(int n)
    {
        return (n*n - n)/2 + n - 1;
    }
}
