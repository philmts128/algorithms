/**
* Implementação de hash table
* author: Philippe Matias
*/



public class Test1
{
    public static void main(String[] args)
    {
        var freq = new HashTable();

        freq.put("skyrim", 555);
        freq.put("mass effect", 444);
        freq.put("dragon age", 666);
        freq.put("neverwinter nights", 2);
        freq.put("the witcher", 88);

        System.out.println(freq.get("skyrim"));
        System.out.println(freq.get("mass effect"));
        System.out.println(freq.get("dragon age"));
        System.out.println(freq.get("neverwinter nights"));
        System.out.println(freq.get("the witcher"));
    }
}
