/**
* Impl. of insertion sort in java
* Author: Philippe Matias
*/

import java.security.SecureRandom;
import java.util.Arrays;


public class InsertionSort
{
    public static void main(String[] args)
    {
        var rnd = new SecureRandom();

        var nums = new int[20];
        Arrays.setAll(nums, x -> (rnd.nextInt(100)+1));

        Arrays.stream(InsertionSort.sort(nums))
            .forEach(x -> System.out.print(x + " "));
    }

    public static int[] sort(int[] items)
    {
        for (int i = 1; i < items.length; ++i) {
            for (int j = i-1; j >= 0; --j) {
                int temp = items[j+1];
                if (items[j] > temp) {
                    items[j+1] = items[j];
                    items[j] = temp;
                } else {
                    break;
                }
            }
        }

        return items;
    }
}
