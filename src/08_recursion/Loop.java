/**
* recursive iteration through array
* author: Pihilippe Matias
*/


public class Loop
{
    public static void main(String[] args)
    {
        String[] foods = {"burger", "fries", "pizza", "pop corn"};

        Loop.rprint(foods, 0);
    }

    public static void print(String[] words)
    {
        for (int i = 0; i < words.length; ++i) {
            System.out.println(words[i]);
        }
    }

    public static void rprint(String[] words, int start)
    {
        System.out.println(words[start]);

        if (start == words.length-1)
            return;
        Loop.rprint(words, start+1);
    }
}
