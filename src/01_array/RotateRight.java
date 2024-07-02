/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class RotateArr
{
    public static void main(String[] args)
    {
        var nums = new Array<Integer>(0,1,2,3,4);

        System.out.print("** before right rotating: ");
        for (int i : nums)
            System.out.print(i + " ");

        rightRotate(nums);
        System.out.print("\n** after right rotating: ");
        for (int i : nums)
            System.out.print(i + " ");

        rightRotate(nums);
        System.out.print("\n** again: ");
        for (int i : nums)
            System.out.print(i + " ");
    }

    public static <T> Array<T> rightRotate(Array<T> arr)
    {
        T temp = arr.last();
        rightShift(arr, 0, arr.length()-1);
        arr.set(0, temp);
        return arr;
    }

    public static <T> Array<T> rightShift(Array<T> arr, int start, int end)
    {
        int k = end-1;

        for (int i = end; i > start; --i) {
            arr.set(i, arr.get(k));
            k -= 1;
        }

        return arr;
    }
}
