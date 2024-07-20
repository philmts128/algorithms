/**
* Progrma to perform permutation of strings
* Author: Philippe Matias
*/

import java.util.ArrayList;


public class WordBuild
{
    public static void main(String[] args)
    {
        char[] letters = {'a', 'b', 'c', 'd'};

        for (String s : WordBuild.permute2(letters))
            System.out.print(s + " ");
    }

    public static ArrayList<String> permute1(char[] letters) //T(n) = 6n² + n + 2, therefore O(n²)
    {
        var perms = new ArrayList<String>();

        for (int i = 0; i < letters.length; ++i) {
            for (int j = 0; j < letters.length; ++j) {
                if (i != j) {
                    var sb = new StringBuilder();
                    sb.append(letters[i]);
                    sb.append(letters[j]);
                    perms.add(sb.toString());
                }
            }
        }

        return perms;
    }

    public static ArrayList<String> permute2(char[] letters) //T(n) = 5n² - 4n + 2, therefore O(n²)
    {
        var len = letters.length;
        var perms = new ArrayList<String>();
        perms.ensureCapacity(len * (len-1));

        for (int i = 0; i < len; ++i) {
            for (int k = i-1; k >= 0; --k) {
                var sb = new StringBuilder();
                sb.append(letters[i]);
                sb.append(letters[k]);
                perms.add(sb.toString());
            }

            for (int k = i+1; k < len; ++k) {
                var sb = new StringBuilder();
                sb.append(letters[i]);
                sb.append(letters[k]);
                perms.add(sb.toString());
            }
        }

        return perms;
    }
}
