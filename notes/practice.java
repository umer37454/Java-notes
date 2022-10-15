package notes;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n, e, r, x, s;
        System.out.println("Enter number: ");
        n = num.nextInt();

        System.out.println("Enter second number: ");
        e = num.nextInt();

        System.out.println("Armstrong numbers are");
        for (n = 1; n <= e; n++) {
            s = 0;
            x = n;
            while (x != 0) {
                r = x % 10; // remainder give last digit
                s = (r * r * r) + s; // finding cube of reminder and storing it in arm
                x = x / 10; // removing last digit
            }
            if (s == n) {
                System.out.println(n);
            }


        }
    }
}
