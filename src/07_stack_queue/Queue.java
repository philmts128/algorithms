/**
* implementation of stack ADS is java
* auhor: Philippe Matias
*/

import java.util.ArrayList;


/*--------------------------------*/
public class Queue<T>
{
    /*--------------------------------*/
    private ArrayList<T> data;

    /*--------------------------------*/
    Queue()
    {
        this.data = new ArrayList<T>();
    }

    /*--------------------------------*/
    public void enqueue(T item)
    {
        this.data.add(item);
    }

    /*--------------------------------*/
    public T dequeue()
    {
        if (this.data.isEmpty()) {
            return null;
        }

        T temp = this.data.get(0);
        this.data.remove(0);
        return temp;
    }

    /*--------------------------------*/
    public boolean isEmpty() { return this.data.isEmpty(); }
    public int length() { return this.data.size(); }
}
