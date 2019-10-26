package itea.hmwk.arraylist;

import java.util.Arrays;

public class MyArrayList implements ArrayList {
    private int array[];
    private int size;

    public MyArrayList() {
        array = new int[10];
        size = 0;
    }

    @Override
    public void add(int num) {
        if (size == array.length - 1) {
            int newArr[] = new int[array.length * 2];
            System.arraycopy(array, 0, newArr, 0, size);
            array = newArr;
        }
        array[size++] = num;
    }

    @Override
    public void clear() {
        array = new int[10];
    }

    @Override
    public int size() {
        return getSize();
    }

    @Override
    public int get(int index) {
        int res = array[index];
        return res;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{"
                + "array=" + Arrays.toString(array)
                + '}';
    }
}
