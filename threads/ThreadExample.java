package threads;

import java.util.Scanner;

class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public boolean isSufficientbal(int w) {
        if (bal > w) {
            return true;
        } else return false;
    }

    public void withdrawamt(int amt) {
        bal = bal - amt;
        System.out.println("Withdrawl money is" + amt);
        System.out.println("Balance money in your account is" + bal);
    }
}

class Customer extends Thread {
    String name;

    private Account account;

    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public void run() {
        synchronized (account) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount");
            int amt = input.nextInt();
            if (account.isSufficientbal(amt)) {
                account.withdrawamt(amt);
            } else
                System.out.println("Insufficient Balance");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Account a1 = new Account(1000);

        Customer c1 = new Customer(a1,"Raj");
        Customer c2 = new Customer(a1,"Rahul");

        c1.start();
        c2.start();
    }
}
