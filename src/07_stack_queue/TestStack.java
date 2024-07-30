/**
* program to test the stack class
* auhor: Philippe Matias
*/


public class TestStack
{
    public static void main(String[] args)
    {
        var integers = new Stack<Integer>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        integers.push(5);

        while (!integers.isEmpty()) {
            System.out.print(integers.pop() + " ");
        }

        System.out.println("\n");

        var fruits = new Stack<String>();
        fruits.push("Strawberry");
        fruits.push("Apple");
        fruits.push("Pear");
        fruits.push("Mango");
        fruits.push("Pineapple");

        while (!fruits.isEmpty()) {
            System.out.println(fruits.pop());
        }
    }
}
