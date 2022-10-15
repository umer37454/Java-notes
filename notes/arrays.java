package notes;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //different ways of storing arr
//        int[] ar = new int[5];
//        ar = new int[]{4,5,6,7,8};
//        int [] arr = {1,2,3,4,5};
//        System.out.println(ar[4]);

        //input
//        int s = in.nextInt();
//        int[] arra = new int[s];
        /* array[0] = 4;
        array[1] = 7;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;

        System.out.println(arr[4]); */

        // input using for loop
//        for (int i = 0; i < arra.length; i++) {
//            arra[i] = in.nextInt();
//        }

        // for each loop to print array
//        for (int i : arra) {
//            System.out.print(i + " ");
//        }

//        System.out.println();
//        System.out.println(Arrays.toString(arra));

        // arrays of objects
        // string array
        /*
        String[] arrr = new String[4];
        for (int i = 0; i<arrr.length; i++){
            arrr[i] = in.next();
        }
        for (String j : arrr){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arrr));
        */

        // multidimensional array
        // 2d array
        int[][] marks2d = {
                {1,2,3}, // 0th index
                {4,5},  // 1st index
                {6,7,8,9}  //2nd index
        };


        int[][] marks = new int[3][3]; // not neces to add coln
        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j<marks.length; j++){
                marks[i][j] = in.nextInt();
             }
        }
//        for (int i = 0; i < marks.length; i++){
//
//           for (int j = 0; j<marks[i].length; j++){
//              System.out.print(marks[i][j] + "  ");
//          }
//           System.out.println();
//        }

        // anothe way
        for (int i = 0; i<marks.length; i++){
            System.out.println(Arrays.toString(marks[i]));
        }

        //for each loop
        for (int[] i : marks){
            System.out.println(Arrays.toString(i));
        }

    }
}