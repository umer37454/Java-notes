package notes;

import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {

        int i, factorial = 1;
        Scanner num = new Scanner(System.in);

        System.out.print("enter number:");
        int number = num.nextInt();

        for (i=1;i<=number;i++){
            factorial=factorial*i;
        }

        System.out.println("ur factorial for number is: "+factorial);
    }
}
