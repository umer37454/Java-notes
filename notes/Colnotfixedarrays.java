package notes;

import java.util.Arrays;

public class Colnotfixedarrays {
    public static void main(String[] args) {
        int[][] marks = {
                {1,2,3}, // 0th index
                {4,5},  // 1st index
                {6,7,8,9}  //2nd index
        };

        //printing output for not coln fixed
        for(int i = 0; i<marks.length; i++){
            for (int j = 0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }


        //for each loop
        for (int[] i : marks){
            System.out.println(Arrays.toString(i));
        }
    }
}
