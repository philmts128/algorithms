/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


public class Test4
{
    public static void main(String[] args)
    {
        var jobs = new Array<String>("electrician", "painter", "nurse");
        jobs.append("engineer");

        String job1 = "engineer";
        int idx = jobs.find(job1);
        if (idx != -1) {
            System.out.printf("\'%s\' does exist in the array at position %d\n", job1, idx);
        } else {
            System.out.printf("\'%s\' does not exist in the array\n", job1);
        }

        String job2 = "singer";
        idx = jobs.find(job2);
        if (idx != -1) {
            System.out.printf("\'%s\' does exist in the array at position %d\n", job2, idx);
        } else {
            System.out.printf("\'%s\' does not exist in the array\n", job2);
        }

        String job3 = "nurse";
        if (jobs.exists(job3)) {
            System.out.printf("\'%s\' does exist in the array\n", job3);
        } else {
            System.out.printf("\'%s\' does not exist in the array\n", job3);
        }

        String job4 = "lawyer";
        if (jobs.exists(job4)) {
            System.out.printf("\'%s\' does exist in the array\n", job4);
        } else {
            System.out.printf("\'%s\' does not exist in the array\n", job4);
        }
    }
}
