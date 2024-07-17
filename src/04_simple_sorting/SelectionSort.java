/**
* Example of selection sort in Java
* Author: Philippe Matias
*/

import java.security.SecureRandom;
import java.util.Arrays;


public class SelectionSort
{
    public static void main(String[] args)
    {
        var rnd = new SecureRandom();

        var nums = new int[20];
        Arrays.setAll(nums, x -> (rnd.nextInt(100)+1));

        Arrays.stream(SelectionSort.sort(nums))
            .forEach(x -> System.out.print(x + " "));
    }

    public static int[] sort(int[] items)
    {
        for (int i = 0; i < (items.length-1); ++i) {
            int min = i+1;
            for (int j = i+1; j < items.length; ++j) {
                if (items[min] > items[j]) {
                    min = j;
                }
            }

            if (items[i] > items[min]) {
                int temp = items[i];
                items[i] = items[min];
                items[min] = temp;
            }
        }

        return items;
    }
}
