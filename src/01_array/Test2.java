/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test2
{
    public static void main(String[] args)
    {
        var fruits = new Array<String>("papaya", "grape", "apple");
        fruits.append("orange");
        fruits.preppend("strawberry");
        fruits.append("banana");
        fruits.preppend("lemon");

        for (int i = 0; i < fruits.length(); ++i)
            System.out.println(fruits.get(i));

        fruits.removeFront();
        fruits.removeBack();

        System.out.println("\n* after deleting fron and end:");
        for (int i = 0; i < fruits.length(); ++i)
            System.out.println(fruits.get(i));
    }
}
