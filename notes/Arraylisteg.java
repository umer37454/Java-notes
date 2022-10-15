package notes;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylisteg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(45);
        list.add(55);
        list.add(75);
        list.add(85);
        list.add(25);
        list.add(35);

        //different methods

        System.out.println(list);

        list.set(3,28);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        // taking input
        ArrayList<String> cars = new ArrayList<>(4);

        System.out.println("Enter limit: ");
        int a = input.nextInt();
        System.out.println("Enter cars name: ");
        for (int i=0; i<a; i++){
            cars.add(input.next());
        }

        for (int i=0; i<a; i++){
            System.out.print(cars.get(i)+ " ");
        }
        System.out.println();

        //for each loop
        for (String i : cars){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(cars);

        // multidime arraylist

        ArrayList<ArrayList<Integer>> maths = new ArrayList<>();

        // initialisation
        for (int i = 0; i<3; i++){
            maths.add(new ArrayList<>());
        }

        //add elements
        for (int i=0;i<3;i++){
            for (int j = 0; j<3;j++){
                maths.get(i).add(input.nextInt());
            }
        }

        System.out.println(maths);

    }
}
