package generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DefaultSize;
    private int size = 0; // also working as a index value

    public CustomArrayList(int size) {
        this.DefaultSize = size;
        this.data = new int[DefaultSize];
    }

    public void add(int num){
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
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int removed(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index , int value){
        data[index] = value;
    }

    public int sized(){
        return size;
    }

    @Override
    public String toString() {
        return "Array" + Arrays.toString(data);
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList(7);
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list);
        int a = list.removed();
        System.out.println("Removed item in array is " + a);
        list.add(45);
        System.out.println("Modifies list in " + list);


        for (int i = 0; i < 14 ; i++){
            list.add(2*i);
        }

        System.out.println(list);
        int b = list.sized();
        System.out.println("list size is " + b);

        new CustomArrayList(7).add(5);

        char x = 's';
        char y = 'k';
        char z = 'o';
        String str = new StringBuilder().append(x).append(y).append(z).toString();
        System.out.println(str);
    }
}
