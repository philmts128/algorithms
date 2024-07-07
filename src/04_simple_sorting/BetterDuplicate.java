/**
* Simple impl. of duplicate checking
* Author: Philippe Matias
*/

import java.util.HashMap;


public class BetterDuplicate
{
    public static void main(String[] args)
    {
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int[] arr2 = {9,8,7,7,4,4,3,2,2};

        BetterDuplicate.check(arr1, "array 1");
        BetterDuplicate.check(arr2, "array 2");
    }

    public static boolean hasDuplicate(int[] items)
    {
        int steps = 0;
        var dups = new HashMap<Integer, Integer>();

        for (int i : items) {
            steps += 1;
            Integer k = dups.get(i);
            if (k == null) {
                dups.put(i, 1);
            } else {
                System.out.println("** Steps: " + steps);
                return true;
            }
        }

        System.out.println("** Steps: " + steps);
        return false;
    }

    public static void check(int[] arr, String n)
    {
        if (BetterDuplicate.hasDuplicate(arr))
            System.out.println("** " + n + " has duplicates.");
        else
            System.out.println("** " + n + " has no duplicates.");
    }
}
