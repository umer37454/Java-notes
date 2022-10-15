package notes;

import java.util.Arrays;

public class methods2 {
    public static void main(String[] args) {

        int[] arr = {54,45,85};

        swap(arr);
        System.out.println(Arrays.toString(arr));

        String naam = "ansari";
        swap1(naam);
        System.out.println(naam);

    }

    static void swap(int[] rr){
        rr[0] = 99;
    }

    static void swap1(String name){
        name = "umer";
    }
}
