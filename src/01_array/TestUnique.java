/*
* Test of unique elements array
* Author: Philippe Matias
*/


public class TestUnique
{


    public static void main(String[] args)
    {
        var nums = new UniqueArray<Integer>(1,1,2,2,2,3,3,4,5,5,5);

        nums.append(666);
        nums.append(666);
        nums.append(666);

        for (int i : nums)
            System.out.print(i + " ");
    }
}
