package itea.task4.hashmap;

public interface HashMap<K, V> {
    MyHashMapGeneric.Entry get(K key);

    void put(K key, V value);

    void clear();

    void remove(K key);

    int size();
}
