package generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;  // array cant work with Generic
    private static int DefaultSize;
    private int size =0; // also working as a index value

    public CustomGenericArrayList(int size) {
        this.DefaultSize = size;
        this.data = new Object[DefaultSize];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        // copy the current arr in temp arr
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T removed(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void set(int index , T value){
        data[index] = value;
    }

    public int sized(){
        return size;
    }

    @Override
    public String toString() {
        System.out.println("Size of array now " + size);
        return "Array" + Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> obj1 = new CustomGenericArrayList<Integer>(5);

        for (int i = 1; i <= 10; i++){
            obj1.add(2*i);
        }
        System.out.println(obj1);

        obj1.add(55);
        System.out.println(obj1);
    }
}
