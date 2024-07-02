/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


import java.util.Iterator;
import java.util.NoSuchElementException;


//----------------------------------------
public class Array<T> implements Iterable<T>
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
    Array(@SuppressWarnings("unchecked") T... items)
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
    public void preppend(T item)
    {
        if (this.isEmpty()) {
            this.append(item);
            return;
        }

        if (this.length == this.capacity) {
            this.capacity += MUL_CAP;
            this.reserve(this.capacity);
        }

        this.rightShift(0);
        this.data[0] = (Object)item;
        this.length += 1;
    }

    //----------------------------------------
    public void insert(int index, T item)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        if (index == 0 && this.isEmpty()) {
            this.append(item);
            return;
        }

        if (this.length == this.capacity) {
            this.capacity += MUL_CAP;
            this.reserve(this.capacity);
        }

        this.rightShift(index);
        this.data[index] = (Object)item;
        this.length += 1;
    }

    //----------------------------------------
    @SuppressWarnings("unchecked")
    public T removeBack()
    {
        if (this.length == 0)
            return null;

        var temp = this.data[this.length - 1];
        this.length -= 1;

        var cap = this.nextCap(this.length);
        if (this.capacity > cap)
            this.reserve(cap);

        return (T)temp;
    }

    //----------------------------------------
    @SuppressWarnings("unchecked")
    public T removeFront()
    {
        if (this.length == 0)
            return null;

        var temp = this.data[0];
        this.leftShift(0);
        this.length -= 1;

        var cap = this.nextCap(this.length);
        if (this.capacity > cap)
            this.reserve(cap);

        return (T)temp;
    }

    //----------------------------------------
    @SuppressWarnings("unchecked")
    public T remove(int index)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        var temp = this.data[index];
        this.leftShift(index);
        this.length -= 1;

        var cap = this.nextCap(this.length);
        if (this.capacity > cap)
            this.reserve(cap);

        return (T)temp;
    }

    //----------------------------------------
    public void set(int index, T value)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        this.data[index] = (Object)value;
    }

    //----------------------------------------
    @SuppressWarnings("unchecked")
    public T get(int index)
    {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException("");

        return (T)this.data[index];
    }

    //----------------------------------------
    @SuppressWarnings("unchecked")
    public int find(T item)
    {
        for (int i = 0; i < this.length; ++i) {
            if (((T)this.data[i]).equals(item)) {
                return i;
            }
        }

        return -1;
    }

    //----------------------------------------
    public int capacity()    { return this.capacity; }
    public int length()      { return this.length; }
    public boolean isEmpty() { return (this.length == 0); }
    public boolean exists(T item) { return (this.find(item) != -1); }
    
    @SuppressWarnings("unchecked")
    public T first() { return (!this.isEmpty()) ? (T)this.data[0]             : null; }
    @SuppressWarnings("unchecked")
    public T last()  { return (!this.isEmpty()) ? (T)this.data[this.length-1] : null; }

    //----------------------------------------
    private void rightShift(int start)
    {
        int len = this.length;
        int k = len-1;

        for (int i = len; i > start; --i) {
            this.data[i] = this.data[k];
            k -= 1;
        }
    }

    //----------------------------------------
    private void leftShift(int start)
    {
        int len = this.length;
        int k = start+1;

        for (int i = start; i < len; ++i) {
            this.data[i] = this.data[k];
            k += 1;
        }
    }

    //----------------------------------------
    private int nextCap(int cap)
    {
        int nc = (cap + MUL_CAP);
        return nc - (cap % MUL_CAP);
    }

    //----------------------------------------
    @SuppressWarnings("unchecked")
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

    //----------------------------------------
    @Override
    public Iterator<T> iterator()
    {
        return new ArrayIt(this);
    }

    //----------------------------------------
    private class ArrayIt implements Iterator<T>
    {
        //----------------------------------------
        private int index = 0;
        private Array<T> array = null;

        //----------------------------------------
        ArrayIt(Array<T> arr) { this.array = arr; }

        @Override
        public boolean hasNext() { return (index < this.array.length()); }

        //----------------------------------------
        @Override
        public T next()
        {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }

            T temp = (T)this.array.get(this.index);
            this.index += 1;
            return temp;
        }
    }
}
