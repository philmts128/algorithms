/**
* Simples example of linked list
* Author: Philippe Matias
*/

public class Test2
{
    public static void main(String[] args)
    {
        var films = new LinkedList<String>();
        films.append("Terminator");
        films.append("Robocop");
        films.append("Rambo");
        films.append("Tango & Cash");
        films.append("Sonic");
        films.append("Sparks");
        films.append("Woodpecker");

        if (films.search("Dragon Ball") != null)
            System.out.println("Dragon ball exists");
        else
            System.out.println("Dragon ball doesnt exist");

        for (String i : films)
            System.out.print(i + "\n");
    }
}
