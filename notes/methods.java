package notes;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
//        int z = sum(10,20);
//        System.out.println(z);

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String cde = personalised(name); // this value is being passed in personalised method
        System.out.println(cde);
    }

    static String personalised(String name){ // name when value is being passed can be same
        String abc = "Hello " + name;
        return abc;
    }


//    static int sum(int a, int b){
//        int c = a+b;
//        return c;
//    }

}
