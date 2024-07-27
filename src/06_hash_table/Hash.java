/**
* implementation of simple hash function
* author: Philippe Matias
*/


public class Hash
{
    public static void main(String[] args)
    {
        Hash.check("Dragon Age");
        Hash.check("Skyrim");
        Hash.check("Kotor");
        Hash.check("Oblivon");
        Hash.check("Morrowind");
        Hash.check("Baldurs Gate 2");
        Hash.check("tico");
        Hash.check("ocit");
    }

    public static void check(String text)
    {
        System.out.printf("* %s - %d\n", text, Hash.hash(text));
    }

    public static int hash(String text)
    {
        int sum = 0;
        int count = 0;
        for (char c : text.toCharArray()) {
            sum += ((int)c * count);
            count += 1;
        }
        return (sum % (text.length()));
    }
}
