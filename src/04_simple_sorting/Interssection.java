/**
* Example of intersection
* Author: Philippe Matias
*/

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;


public class Interssection
{
    public static void main(String[] args)
    {
        var rnd = new SecureRandom();

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,4,6,8,10,12,14,16,18,20};

        System.out.print("** Array 1: ");
        Arrays.stream(arr1)
            .forEach(x -> System.out.print(x + " "));

        System.out.print("\n** Array 2: ");
        Arrays.stream(arr2)
            .forEach(x -> System.out.print(x + " "));

        System.out.print("\n** Intersection: ");
        Interssection.intersect(arr1, arr2)
            .forEach(x -> System.out.print(x + " "));
    }

    public static ArrayList<Integer> intersect(int[] a1, int[] a2)
    {
        var inter = new ArrayList<Integer>();
        int steps = 0;

        for (int i = 0; i < a1.length; ++i) {
            for (int j = 0; j < a2.length; ++j) {
                if (a1[i] == a2[j]) {
                    inter.add(a1[i]);
                    break;
                }
            }
        }

        return inter;
    }
}
