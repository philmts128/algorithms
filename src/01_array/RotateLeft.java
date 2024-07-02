/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class RotateLeft
{
    public static void main(String[] args)
    {
        var nums = new Array<Integer>(0,1,2,3,4);

        System.out.print("** before left rotating: ");
        for (int i : nums)
            System.out.print(i + " ");

        leftRotate(nums);
        System.out.print("\n** after left rotating: ");
        for (int i : nums)
            System.out.print(i + " ");

        leftRotate(nums);
        System.out.print("\n** again: ");
        for (int i : nums)
            System.out.print(i + " ");
    }

    public static <T> Array<T> leftRotate(Array<T> arr)
    {
        T temp = arr.first();
        leftShift(arr, 0, arr.length()-1);
        arr.set(arr.length()-1, temp);
        return arr;
    }

    public static <T> Array<T> leftShift(Array<T> arr, int start, int end)
    {
        int k = start+1;

        for (int i = start; i < end; ++i) {
            arr.set(i, arr.get(k));
            k += 1;
        }

        return arr;
    }
}
