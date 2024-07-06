/**
* Simples example of linked list
* Author: Philippe Matias
*/

public class Test1
{
    public static void main(String[] args)
    {
        var nums = new LinkedList<Integer>();
        nums.append(444);
        nums.append(555);
        nums.append(666);
        nums.preppend(999);
        nums.preppend(1122);
        nums.removeBack();
        nums.removeFront();

        for (Integer i : nums)
            System.out.print(i + " ");
    }
}
