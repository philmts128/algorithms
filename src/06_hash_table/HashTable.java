/**
* Implementação de hash table
* author: Philippe Matias
*/


/*----------------------------*/
public class HashTable
{
    /*----------------------------*/
    private final int CAPACITY = 256;
    private final double MAX_LOAD_FACTOR = 0.7;
    private Block[] data;
    private int length;
    private int capacity;

    /*----------------------------*/
    public HashTable()
    {
        this.capacity = CAPACITY;
        this.data = new Block[CAPACITY];
        this.length = 0;
    }

    /*----------------------------*/
    public void put(String key, int value)
    {
        int index = hash(key);

        while (this.data[index] != null) {
            index = (index + 1) % this.capacity;
        }

        this.length += 1;
        data[index] = new Block(key, value);
        this.checkExpand();
    }

    /*----------------------------*/
    public void put_quad(String key, int value)
    {
        int index = hash(key);

        int j = 1;
        while (this.data[index] != null) {
            index = (index + j*j) % this.capacity;
            j += 1;
        }

        this.length += 1;
        data[index] = new Block(key, value);
        this.checkExpand();
    }

    /*----------------------------*/
    public int get(String key)
    {
        int index = this.hash(key);

        while (this.data[index] != null) {
            if (this.data[index].key == key) {
                return this.data[index].value;
            }

            index = (index + 1) % this.capacity;
        }

        return this.data[index].value;
    }

    /*----------------------------*/
    public int get_quad(String key)
    {
        int index = this.hash(key);
        int j = 1;

        while (this.data[index] != null) {
            if (this.data[index].key == key) {
                return this.data[index].value;
            }

            index = (index + j*j) % this.capacity;
            j += 1;
        }

        return this.data[index].value;
    }

    /*----------------------------*/
    private void expand()
    {
        var hs = new HashTable();
        hs.capacity = this.capacity * 2;
        hs.length = this.length;
        hs.data = new Block[hs.capacity];

        for (Block b : this.data) {
            if (b != null) {
                hs.put(b.key, b.value);
            }
        }

        this.capacity = hs.capacity;
        this.data = hs.data;
    }

    /*----------------------------*/
    private void checkExpand()
    {
        double lf = this.length / this.capacity;
        if (lf >= MAX_LOAD_FACTOR) {
            this.expand();
        }
    }

    /*----------------------------*/
    private int hash(String text)
    {
        int sum = 0;
        int mul = 1;

        for (char ch : text.toCharArray()) {
            sum += (int)ch * mul;
            mul += 1;
        }

        return (sum % this.capacity);
    }

    /*----------------------------*/
    private class Block
    {
        Block(String k, int v)
        {
            this.key = k;
            this.value = v;
        }

        public String key;
        public int value;
    }
}
