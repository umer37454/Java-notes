package notes;

import java.util.Arrays;
import java.util.Scanner;

public class Passarraysinfun {

    static void change(int[] arr) {
        arr[1] = 10;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int a = input.nextInt();

        //If want to take arr from defining user length is neccessary
        int[] arr = new int[a];

        System.out.print("Now enter values in arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Your array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        change(arr);
        // it will change the value
        System.out.println("Your modified array is: " + Arrays.toString(arr));

    }
}
