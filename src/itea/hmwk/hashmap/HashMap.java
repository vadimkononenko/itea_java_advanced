package itea.hmwk.hashmap;

public interface HashMap {
    MyHashMap.Entry get(String s);
    void put(String key, String value);
    void clear();
    void remove(String key);
    int size();
}
