/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test1
{
    public static void main(String[] args)
    {
        var arr = new Array();
        arr.append(5);
        arr.append(3);
        arr.append(2);
        arr.append(1);
        arr.append(555);
        arr.append(333);
        arr.append(222);
        arr.append(111);
        arr.append(50);
        arr.append(30);
        arr.append(20);
        arr.append(10);

        for (int i = 0; i < arr.length(); ++i)
            System.out.print(arr.get(i) + " ");
    }
}
