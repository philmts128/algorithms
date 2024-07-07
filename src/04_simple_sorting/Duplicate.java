/**
* Simple impl. of duplicate checking
* Author: Philippe Matias
*/


public class Duplicate
{
    public static void main(String[] args)
    {
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        int[] arr2 = {9,8,7,7,4,4,3,2,2};

        Duplicate.check(arr1, "array 1");
        Duplicate.check(arr2, "array 2");
    }

    public static boolean hasDuplicate(int[] items)
    {
        int steps = 0;

        for (int i = 0; i < items.length-1; ++i) {
            for (int j = i+1; j < items.length; ++j) {
                if (items[i] == items[j]) {
                    System.out.println("Steps " + steps);
                    return true;
                }

                steps +=1;
            }
        }

        System.out.println("Steps " + steps);
        return false;
    }

    public static void check(int[] arr, String n)
    {
        if (Duplicate.hasDuplicate(arr))
            System.out.println("** " + n + " has duplicates.");
        else
            System.out.println("** " + n + " has no duplicates.");
    }
}
