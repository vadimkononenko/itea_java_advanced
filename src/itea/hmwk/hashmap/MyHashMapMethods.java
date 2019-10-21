package itea.hmwk.hashmap;

public interface MyHashMapMethods {
    MyHashMap.Entry get(String s);
    void put(String key, String value);
    void clear();
    void remove(String key);
    int size();
}
