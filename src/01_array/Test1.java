/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test1
{
    public static void main(String[] args)
    {
        var nums = new Array<Integer>(5,3,2,1,555,333);
        nums.append(222);
        nums.append(111);
        nums.append(50);
        nums.append(30);
        nums.append(20);
        nums.append(10);

        for (int i = 0; i < nums.length(); ++i)
            System.out.print(nums.get(i) + " ");

        var games = new Array<String>("Skyrim", "Oblivion", "Morrowind");
        games.append("Dragon Age: Origins");
        games.append("Star Wars: Knights of the Old Republic");
        games.append("Mass Effect");

        for (int i = 0; i < games.length(); ++i)
            System.out.println(games.get(i));
    }
}
