/**
* Simples example of linked list
* Author: Philippe Matias
*/


import java.util.Iterator;
import java.util.NoSuchElementException;


/*-------------------------*/
public class LinkedList<T> implements Iterable<T>
{
    protected Node<T> first;
    protected Node<T> last;
    protected int length;

    /*-------------------------*/
    LinkedList()
    {
        this.first = this.last = null;
        this.length = 0;
    }

    /*-------------------------*/
    public void append(T item)
    {
         var newNode = new Node<T>(item);

        if (this.isEmpty()) {
            this.first = newNode;
            this.last = first;
            this.length = 1;
            return;
        }

        newNode.prev = this.last;
        this.last.next = newNode;
        this.last = newNode;
        this.length += 1;
    }

    /*-------------------------*/
    public void preppend(T item)
    {
         var newNode = new Node<T>(item);

        if (this.isEmpty()) {
            this.first = newNode;
            this.last = first;
            this.length = 1;
            return;
        }

        newNode.next = this.first;
        this.first.prev = newNode;
        this.first = newNode;
        this.length += 1;
    }

    /*-------------------------*/
    public T removeBack()
    {
        if (this.isEmpty())
            return null;

        if (this.length == 1) {
            var temp = this.first;
            this.length = 0;
            this.first = this.last = null;
            return (T)first.data;
        }

        var temp = this.last.data;
        this.last = last.prev;
        this.length -= 1;
        return temp;
    }

    /*-------------------------*/
    public T removeFront()
    {
        if (this.isEmpty())
            return null;

        if (this.length == 1) {
            var temp = this.first;
            this.length = 0;
            this.first = this.last = null;
            return (T)first.data;
        }

        var temp = this.last.data;
        this.first = first.next;
        this.length -= 1;
        return temp;
    }

    /*-------------------------*/
    public T remove(T item)
    {
        var i = this.search(item);
        if (i != null) {
            var node = i.node();
            var temp = node.data;
            var prev = node.prev;
            prev.next = node.next;
            this.length -= 1;
            return temp;
        }
        return null;
    }

    /*-------------------------*/
    public ListIt search(T item)
    {
        var it = this.first();

        while (it.hasNext())
        {
            var i = it.node().data;
            if (i.equals(item)) {
                return it;
            } else {
                it.next();
            }
        }

        return null;
    }

    /*-------------------------*/
    public int length() { return this.length; }
    public boolean isEmpty() { return (this.length == 0); }
    public ListIt first() { return new ListIt(this.first); }
    public ListIt last() { return new ListIt(this.last); }

    /*-------------------------*/
    @Override
    public Iterator<T> iterator()
    {
        return new ListIt(this.first);
    }


    /*-------------------------*/
    private class Node<T>
    {
        /*-------------------------*/
        public Node<T> prev = null;
        public Node<T> next = null;
        public T data;

        /*-------------------------*/
        public Node(T data)
        {
            this.data = data;
        }
    }

    //----------------------------------------
    public class ListIt implements Iterator<T>
    {
        //----------------------------------------
        private Node<T> currentNode = null;

        //----------------------------------------
        ListIt(Node<T> listNode)
        {
            this.currentNode = listNode;
        }

        //----------------------------------------
        public T data() { return (currentNode == null ? null : currentNode.data); }
        public Node<T> node() { return this.currentNode; }

        @Override
        public boolean hasNext() { return (currentNode != null); }

        //----------------------------------------
        @Override
        public T next()
        {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }

            T temp = (T)currentNode.data;
            currentNode = currentNode.next;
            return temp;
        }
    }
}
