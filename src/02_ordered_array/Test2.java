/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test2
{
    public static void main(String[] args)
    {
        var nums = new OrderedArray<Integer>();
        nums.append(5);
        nums.append(4);
        nums.append(666);
        nums.append(1);
        nums.append(0);
        nums.append(3);

        for (int i : nums)
            System.out.print(i + " ");
    }
}
