/*
* Implementation of array with uique elements
* derived of the generic dynamic array
* Author: Philippe Matias
*/


/*------------------------------*/
public class UniqueArray<T> extends Array<T>
{
    /*------------------------------*/
    public UniqueArray() { super(); }

    /*------------------------------*/
    public UniqueArray(T... items)
    {

        super(UniqueArray.uniqueElements(items));
    }

    /*------------------------------*/
    @Override
    public void append(T item)
    {
        if (!super.exists(item)) {
            super.append(item);
        }
    }

    /*------------------------------*/
    private static <T> Array<T> uniqueElements(T... items)
    {
        var noDup = new Array<T>();
        for (T i : items) {
            if (!noDup.exists(i)) {
                noDup.append(i);
            }
        }

        return noDup;
    }
}
