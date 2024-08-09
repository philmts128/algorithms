/**
* simple factorial impl. using recursion
* author: Pihilippe Matias
*/


public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println("Number\tFactorial:");

        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d\t%d\n", i, Factorial.f(i));
        }
    }

    public static int f(int num)
    {
        if (num == 1)
            return 1;
        else
            return num * f(num-1);
    }
}
