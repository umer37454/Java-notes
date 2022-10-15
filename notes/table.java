package notes;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int n,i,s;

        Scanner num = new Scanner(System.in);

        System.out.println("Enter number: ");
        n=num.nextInt();

        for (i=0;i<=9;i++){
            s=n*i;
            System.out.println(n + " x " + (i+1) + " = " + s);
        }
    }
}
