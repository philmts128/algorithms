/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test1 
{
    public static void main(String[] args)
    {
        var nums = new OrderedArray<Integer>(5,4,3,2,1);

        for (int i : nums)
            System.out.print(i + " ");
    }
}
