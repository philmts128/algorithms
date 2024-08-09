/**
* author: Pihilippe Matias
*/


public class ArraySum
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5};

        System.out.println(ArraySum.s(nums, 4));
    }

    public static int s(int[] nums, int i)
    {
        if (i == 0)
            return nums[0];
        else
            return nums[i] + s(nums, i-1);
    }
}
