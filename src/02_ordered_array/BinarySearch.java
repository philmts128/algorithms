/**
* binary search implementation
* Author: PM
*/

import java.util.Arrays;


public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        BinarySearch.test(nums, 1);
        BinarySearch.test(nums, 50);
        BinarySearch.test(nums, 4);
        BinarySearch.test(nums, 666);
        BinarySearch.test(nums, 10);
        BinarySearch.test(nums, 15);

    }

    public static void test(int[] nums, int val)
    {
        int res = BinarySearch.search(nums, val);
        if (res == -1) {
            System.out.println("- " + val + " doesn\'t exist!");
        } else {
            System.out.printf("- %d exists in the position %d!\n", val, res);
        }
    }

    public static int search(int[] nums, int val)
    {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (nums[mid] == val) {
                return mid;
            } else if (val > nums[mid]) {
                low = mid + 1;
            } else if (val < nums[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }
}
