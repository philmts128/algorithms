/**
* test of generic hash table
* author: Philippe Matias
*/



public class Test3
{
    public static void main(String[] args)
    {
        var freq = new GenHashTable<String>();

        freq.put("Ozzy", "Osbourne");
        freq.put("Robert", "Plant");
        freq.put("Jim", "Morrison");
        freq.put("Jimi", "Hendrix");
        freq.put("Bon", "Scott");

        System.out.println(freq.get("Ozzy"));
        System.out.println(freq.get("Robert"));
        System.out.println(freq.get("Jim"));
        System.out.println(freq.get("Jimi"));
        System.out.println(freq.get("Bon"));
    }
}
