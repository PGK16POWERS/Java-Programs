import java.util.LinkedList;
import java.util.List;

class MyHashSet {

    private final int capacity;
    private final List<Integer>[] table;

    public MyHashSet() {
        this(1000); // Default capacity
    }

    public MyHashSet(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int index = hash(key);
        if (!table[index].contains(key)) {
            table[index].add(key);
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    public void remove(int key) {
        int index = hash(key);
        table[index].remove(Integer.valueOf(key)); // Important: Remove by object
    }

    private int hash(int key) {
        // A better hash function using Java's built-in hashCode
        int h = key;
        h ^= (h >>> 20) ^ (h >>> 12);
        return Math.abs(h ^ (h >>> 7) ^ (h >>> 4)) % capacity;
        //return Math.abs(key % capacity); //simple version, prone to collision
    }

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet.contains(1)); // returns true
        System.out.println(hashSet.contains(3)); // returns false
        hashSet.add(2); // add 2 again, does nothing as it's already there
        System.out.println(hashSet.contains(2)); // returns true
        hashSet.remove(2);
        System.out.println(hashSet.contains(2)); // returns false

        MyHashSet hashSet2 = new MyHashSet(10);
        for (int i = 0; i < 20; i++) {
            hashSet2.add(i);
        }
        System.out.println(hashSet2.contains(15)); // returns true
        hashSet2.remove(15);
        System.out.println(hashSet2.contains(15)); // returns false
    }
}
