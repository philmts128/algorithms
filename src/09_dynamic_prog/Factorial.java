/**
* Fatorial recursivo usando programação dinâmica
* Auhor: Phil Matias
*/

import java.util.HashMap;


public class Factorial
{
    private HashMap<Long, Long> factorials = new HashMap<Long, Long>();

    public static void main(String[] args)
    {
        var fact = new Factorial();

        System.out.println("Num\tFactorial");
        for (int i = 0; i <= 5; ++i) {
            System.out.printf("%d\t%d\n", i, fact.dpf(i));
            System.out.printf("%d\t%d\n", i, fact.dpf(i));
        }
    }

    public static long f(long num)
    {
        if (num == 0)
            return 1;
        return num * f(num-1);
    }

    public Long dpf(long num)
    {
        if (!this.factorials.containsKey(num)) {
            long res = Factorial.f(num);
            this.factorials.put(num, res);
            return res;
        }

        return this.factorials.get(num);
    }
}
