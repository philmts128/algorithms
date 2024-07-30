/**
* implementation of stack ADS is java
* auhor: Philippe Matias
*/

import java.util.ArrayList;


/*--------------------------------*/
public class Stack<T>
{
    /*--------------------------------*/
    private ArrayList<T> data = null;

    /*--------------------------------*/
    Stack()
    {
        this.data = new ArrayList<T>();
    }

    /*--------------------------------*/
    public void push(T item)
    {
        this.data.add(item);
    }

    /*--------------------------------*/
    public T pop()
    {
        if (this.data.isEmpty()) {
            return null;
        }

        var len = this.data.size();
        T temp = this.data.get(len-1);
        this.data.remove(len-1);
        return temp;
    }

    /*--------------------------------*/
    public boolean isEmpty() { return this.data.isEmpty(); }
    public int length() { return this.data.size(); }
}
