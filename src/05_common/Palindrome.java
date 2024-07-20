/**
* Algorith to check palindrome strings
* Author: Philippe Matias
*/


public class Palindrome
{
    public static void main(String[] args)
    {
        Palindrome.print("ana");
        Palindrome.print("felipe");
        Palindrome.print("banana");
        Palindrome.print("ata");
        Palindrome.print("kilik");
        Palindrome.print("cherry");
        Palindrome.print("rat");
        Palindrome.print("lol");
        Palindrome.print("row");
        Palindrome.print("madam");
    }

    public static void print(String text)
    {
        if (Palindrome.check(text)) {
            System.out.printf("%s is palindrome!\n", text);
        } else {
            System.out.printf("%s is not palindrome!\n", text);
        }
    }

    public static boolean check(String text) //T(n) = n/2 + 1 -> T(n) = O(n)
    {
        var len = text.length();

        for (int i = 0, j = len-1; i < len/2; ++i, --j)
        {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
