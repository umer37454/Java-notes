package generics.Comparison;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpFun {
    public static void main(String[] args) {

        ArrayList<Integer> obj = new ArrayList<>();

        //simple for loop to print
        for (int i = 0; i<5; i++){
            obj.add(i + 1);
        }
        System.out.println(obj);

        //lamba inline funv.. here item is the argument passing in the func.
        // and then implementation after -> ..
        //obj.forEach(item -> System.out.println(item * 2));

        //long way of doing it by creating interface obj ref and then creating anony and lambda then
        //by this we dont have to create another class or implement the iterface with class
        Consumer<Integer> ojb = item -> System.out.println(item * 2);
        //passing consumer variable ojb in for each
        obj.forEach(ojb);

        func fun = (a, b) -> (a + b);
        func fun1 = (a, b) -> a * b;
        func fun2 = (a, b) -> a - b;

        //for this refer smflasmdl file
        LambdaExpFun mycalci = new LambdaExpFun();
        System.out.println("Sum " + mycalci.sum(5,8,fun));
        System.out.println("Multipli "+mycalci.sum(5,8,fun1));
        System.out.println("Sub "+mycalci.sum(5,8,fun2));

    }

    //making a fun and then passing parameter or var of interface func
    private int sum(int a, int b, func f){
        return f.oper(a,b);
    }
}

interface func{
    int oper(int a, int b);
}