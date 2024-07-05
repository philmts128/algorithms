/*
* Implementation of dynamic array
* Author: Philippe Matias
*/


//--------------------------------------
public class OrderedArray<T extends Comparable<T>> extends Array<T>
{
    //--------------------------------------
    OrderedArray() { super(); }

    //--------------------------------------
    @SuppressWarnings("unchecked")
    OrderedArray(T... args)
    {
        var oa = OrderedArray.bubbleSort(new Array<T>(args));
        super(oa);
    }

    //--------------------------------------
    @Override
    public void append(T item)
    {
        if (this.isEmpty()) {
            super.append(item);
            return;
        }

        super.append(item);
        OrderedArray.bubbleSort(this);
    }

    //--------------------------------------
    private static <T extends Comparable<T>> Array<T> bubbleSort(Array<T> arr)
    {
        for (int i = arr.length()-1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arr.get(j).compareTo(arr.get(j+1)) > 0)
                {
                    var temp = arr.get(j+1);
                    arr.set(j+1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }
}