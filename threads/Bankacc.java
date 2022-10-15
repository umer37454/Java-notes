package threads;

import java.util.Scanner;

class C {
    String n;
    private int b;
    int a;

    public C(String n, int b) {
        this.n = n;
        this.b = b;
    }

    public boolean Sufficientbal() {
        Scanner input = new Scanner(System.in);
        System.out.println(n + " Enter amount");
        a = input.nextInt();
        return b > a;
    }

    public void withdraw() {
        System.out.println("Withdrawl money is " + a);
        b = b - a;
        System.out.println("Balance money in your account is " + b);
    }
}

class A {
    private final C c;

    public A(C c) {
        this.c = c;
    }

    public void run() {
        if (c.Sufficientbal()) {
            c.withdraw();
        } else
            System.out.println("Insufficient Balance");
    }
}

public class Bankacc {
    public static void main(String[] args) {
        C cus1 = new C("Raj", 1000);
        C cus2 = new C("Rahul", 2000);

        A acc1 = new A(cus1);
        A acc2 = new A(cus2);

        acc1.run();
        acc2.run();
    }
}