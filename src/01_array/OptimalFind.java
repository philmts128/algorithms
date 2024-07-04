/*
* Implementation of optimal linear search
* Author: Philippe Matias
*/


public class OptimalFind
{
    public static <T> int find(Array<T> arr, T value)
    {
        int tries = 0;

        for (int i = 0; i < arr.length(); ++i) {
            tries += 1;
            if (value.equals(arr.get(i))) {
                if (i > 0) {
                    T temp = arr.get(i);
                    arr.set(i, arr.get(i-1));
                    arr.set(i-1, temp);
                }

                System.out. println("Tries: " + tries);
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        var nums = new Array<Integer>(1,2,3,4,5);

        OptimalFind.find(nums, 5);
        OptimalFind.find(nums, 5);
        OptimalFind.find(nums, 5);
        OptimalFind.find(nums, 5);
        OptimalFind.find(nums, 5);
        OptimalFind.find(nums, 5);
        OptimalFind.find(nums, 5);
    }
}
