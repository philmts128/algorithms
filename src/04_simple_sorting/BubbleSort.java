/**
* Simple impl. of bubble sort
* Author: Philippe Matias
*/


public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] nums = {9,8,7,6,5,4,3,2,1};

        BubbleSort.sort(nums);

        for (int i : nums)
            System.out.print(i + " ");
    }

    public static int[] sort(int[] items)
    {
        for (int i = 0; i < items.length-1; ++i)
        {
            for (int j = 0; j < items.length-1; ++j)
            {
                if (items[j] > items[j+1])
                {
                    var temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }

        return items;
    }
}
