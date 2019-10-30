package itea.task4.hashmap;

import java.util.Arrays;

public class MyHashMapGeneric<K, V> implements HashMap<K, V> {
    private int size = 16;
    private Entry[] table = new Entry[16];

    class Entry<K,V> {
        final K key;
        V value;
        Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }
    }

    @Override
    public Entry get(K key) {
        int hash = key.hashCode() % size;
        Entry e = table[hash];

        while (e != null) {
            if (e.key.equals(key)) {
                return e;
            }
            e = e.next;
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        int hash = key.hashCode() % size;
        Entry e = table[hash];

        if (e != null) {
            if (e.key.equals(key)) {
                e.value = value;
            } else {
                while (e.next != null) {
                    e = e.next;
                }
            }
            Entry oldBucket = new Entry(key, value);
            e.next = oldBucket;
        } else {
            Entry newBucket = new Entry(key, value);
            table[hash] = newBucket;
        }
    }

    @Override
    public void clear() {
        table = new Entry[size];
    }

    @Override
    public void remove(K key) {
        int hash = key.hashCode() % size;
        Entry e = table[hash];

        for (int i = 0; i < table.length; i++) {
            if (table[i] == table[hash] && e.key.equals(key)) {
                for (int j = i; j < table.length - i; j++) {
                    table[j] = table[j + 1];
                }
            }
            return;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashMapGeneric{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
