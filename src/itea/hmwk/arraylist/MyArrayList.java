package itea.hmwk.arraylist;

import java.util.Arrays;

public class MyArrayList implements ArrayListMethods{
    private int arr[];
    private int size;

    public MyArrayList() {
        arr = new int[16];
        size = 0;
    }

    @Override
    public void add(int num) {
        if (size == arr.length - 1) {
            int newArr[] = new int[arr.length * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size++] = num;
    }

    @Override
    public void clear() {
        arr = new int[16];
    }

    @Override
    public int size() {
        return getSize();
    }

    @Override
    public int get(int index) {
        int res = arr[index];
        return res;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public int[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        MyArrayList m = new MyArrayList();
        m.add(1);
        for(int i = 0 ; i < m.size; i++){

        }
    }
}
