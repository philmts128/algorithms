/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test3
{
    public static void main(String[] args)
    {
        var nums = new Array<Integer>(1,2,3,4,5);

        nums.insert(1, 666);
        nums.remove(4);

        for (int i = 0; i < nums.length(); ++i)
            System.out.print(nums.get(i) + " ");
    }
}
