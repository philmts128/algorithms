/**
* quadratic probing test - hash_table
* author: Philippe Matias
*/



public class Test2
{
    public static void main(String[] args)
    {
        var freq = new HashTable();

        freq.put_quad("Black Sabbath", 1);
        freq.put_quad("Deep Purple", 2);
        freq.put_quad("Led Zeppelin", 3);
        freq.put_quad("The Doors", 4);
        freq.put_quad("Jefferson Airplane", 5);

        System.out.println(freq.get_quad("Black Sabbath"));
        System.out.println(freq.get_quad("Deep Purple"));
        System.out.println(freq.get_quad("Led Zeppelin"));
        System.out.println(freq.get_quad("The Doors"));
        System.out.println(freq.get_quad("Jefferson Airplane"));
    }
}
