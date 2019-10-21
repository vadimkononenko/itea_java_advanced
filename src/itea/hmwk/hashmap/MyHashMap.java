package itea.hmwk.hashmap;

import java.util.Arrays;

public class MyHashMap implements MyHashMapMethods {
    private int size = 16;

    private Entry table[] = new Entry[size];

    static class Entry {
        final String key;
        String value;
        Entry next;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getKey() {
            return key;
        }
    }

    @Override
    public Entry get(String key) {
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
    public void put(String key, String value) {
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
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
    }

    @Override
    public void remove(String key) {
        int hash = key.hashCode() % size;
        Entry e = table[hash];

        for (int i = 0; i < table.length; i++) {
            if (table[i] == table[hash] && e.key.equals(key)) {
                for (int j = i; j < table.length - i; j++) {
                    table[j] = table[j+1];
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
        return "MyHashMap{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
