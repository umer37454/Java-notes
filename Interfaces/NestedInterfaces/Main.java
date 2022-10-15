package Interfaces.NestedInterfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        B obj = new B();

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println(obj.isodd(a));
    }
}
