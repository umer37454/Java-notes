package notes;

import java.util.Scanner;

//it will stop if u enter X or x

public class basicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans;
        ans = 0;

        while (true) {
            System.out.print("Enter operator to be performed: ");
            char op = in.next().charAt(0);
            {
                if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {

                    System.out.print("Enter 1st operand: ");
                    int num1 = in.nextInt();

                    System.out.print("Enter 2nd operand: ");
                    int num2 = in.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    System.out.println("Your answer is " + ans);
                } else if (op == 'X' || op == 'x') {
                    break;
                } else
                {
                    System.out.println("Invalid operation");
                }
            }
        }
    }
}