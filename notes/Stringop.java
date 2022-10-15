package notes;

import java.util.ArrayList;

public class Stringop {
    public static void main(String[] args) {
        //out is the object in printstream class which uses println mehthod / func.

        //formated
        int a = 45;
        float ans = 3.4575863f;

        // % | argument index | flags | width | .precision | conversion
        System.out.printf("%2$+10.2f and %1$(5d ", a, ans);
        System.out.println();

        //concat
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        System.out.println("a" + new ArrayList<>());

        // + operator is used only for primitive or one string and object. not works with obj. put in string

        //performance
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            //series = series + ch;  creating space complexity prob.
            System.out.print(ch + " ");
        }

        // string builder

        StringBuilder buil = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
                buil.append(ch);

        }
        System.out.print(buil.toString());
        System.out.println();

        //regular expression
        String str = "umer37454@gmail.com";
        System.out.println(str.matches(".")); //single character

        // [abc] - only 1 in this
        // [^abc] - not only 1 in this
        // [a-z1-9] - only 1 in this range either number or letter
        // [a-z][1-9] - 2 in this range either number or letter
        // abc - exactly like abc

        /*
        meta charac
        \w - either num or letter
        \d - digit
        \D - not digit
        \W - not num and digit
        \S - space

        Qauntifier
        * - 0 or more time eg. a then bcdfg
        [a-z]* - a to z ant num of times. abc6Mf > false
        + - should be 1 minimum.eg. [abc]+ - means abc any num of time.
        [abc]{3} - letter can be any but exact 3 time
        .*gmail.* - to check gmail
        \w*@gmail(.*) - can use bracket
        */
        System.out.println(str.matches("\\w*@gmail(.*)"));
    }
}
