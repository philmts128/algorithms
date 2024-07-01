/*
* Implementation of dynamic array
* Author: Philippe Matias
*/



//----------------------------------------
public class Array<T>
{
    //----------------------------------------
    private final int MUL_CAP = 8;
    private Object[] data = null;
    private int length;
    private int capacity;

    //----------------------------------------
    Array()
    {
        this.length = 0;
        this.capacity = MUL_CAP;
        this.reserve(this.capacity);
    }

    //----------------------------------------
    Array(T... items)
    {
        var len = items.length;
        this.length = len;

        this.capacity = this.nextCap(len);
        this.reserve(this.capacity, items);
    }

    //----------------------------------------
    public void append(T item)
    {
        if (this.length == this.capacity) {
            this.capacity += MUL_CAP;
            this.reserve(this.capacity);
        }

        this.data[this.length] = (Object)item;
        this.length += 1;
    }

    //----------------------------------------
    public void set(int index, T value)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        this.data[index] = (Object)value;
    }

    //----------------------------------------
    public T get(int index)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        return (T)this.data[index];
    }

    //----------------------------------------
    public int capacity()    { return this.capacity; }
    public int length()      { return this.length; }
    public boolean isEmpty() { return (this.length == 0); }

    //----------------------------------------
    private int nextCap(int cap)
    {
        int nc = (cap + MUL_CAP);
        return nc - (cap % MUL_CAP);
    }

    //----------------------------------------
    private void reserve(int cap, T... data)
    {
        this.reserve(cap);
        int x=0;
        for (T i : data)
            this.data[x++] = (Object)i;
    }

    //----------------------------------------
    private void reserve(int cap)
    {
        if (this.data == null) {
            this.data = new Object[cap];
            return;
        }

        var ndata = new Object[cap];
        int lim = (this.length > cap) ? cap : this.length;
        for (int i = 0; i < lim; ++i) {
            ndata[i] = this.data[i];
        }

        this.data = ndata;
    }
}



