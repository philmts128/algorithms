/**
* Average of even numbers given an array
* Author: Philippe Matias
*/


public class EvenAverage1
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(EvenAverage1.evenAverage(nums));
    }

    public static double evenAverage(int[] nums) //T = 4n + 3, therefore O(n)
    {
        double sum = 0;
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                sum += i;
                count += 1;
            }
        }

        return (sum / (double)(count));
    }
}
