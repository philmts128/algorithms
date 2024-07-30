/**
* program to test the queu class
* auhor: Philippe Matias
*/


public class TestQueue
{
    public static void main(String[] args)
    {
        var integers = new Queue<Integer>();
        integers.enqueue(1);
        integers.enqueue(2);
        integers.enqueue(3);
        integers.enqueue(4);
        integers.enqueue(5);

        while (!integers.isEmpty()) {
            System.out.print(integers.dequeue() + " ");
        }

        System.out.println("\n");

        var bands = new Queue<String>();
        bands.enqueue("Evanescense");
        bands.enqueue("Linkin Park");
        bands.enqueue("Slipknot");
        bands.enqueue("Within Tempetation");
        bands.enqueue("Staind");

        while (!bands.isEmpty()) {
            System.out.println(bands.dequeue());
        }
    }
}
