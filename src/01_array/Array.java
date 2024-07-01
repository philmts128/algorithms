/*
* Implementation of dynamic array
* Author: Philippe Matias
*/



//----------------------------------------
public class Array
{
    //----------------------------------------
    private final int MUL_CAP = 8;
    private int[] data = null;
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
    Array(int... items)
    {
        var len = items.length;
        this.length = len;

        this.capacity = this.nextCap(len);
        this.reserve(this.capacity, items);
    }

    //----------------------------------------
    public void append(int item)
    {
        if (this.length == this.capacity) {
            this.capacity += MUL_CAP;
            this.reserve(this.capacity);
        }

        this.data[this.length] = item;
        this.length += 1;
    }

    //----------------------------------------
    public void set(int index, int value)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        this.data[index] = value;
    }

    //----------------------------------------
    public int get(int index)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        return this.data[index];
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
    private void reserve(int cap, int... data)
    {
        this.reserve(cap);
        int x=0;
        for (int i : data)
            this.data[x++] = i;
    }

    //----------------------------------------
    private void reserve(int cap)
    {
        if (this.data == null) {
            this.data = new int[cap];
            return;
        }

        int[] ndata = new int[cap];
        int lim = (this.length > cap) ? cap : this.length;
        for (int i = 0; i < lim; ++i) {
            ndata[i] = this.data[i];
        }

        this.data = ndata;
    }
}
