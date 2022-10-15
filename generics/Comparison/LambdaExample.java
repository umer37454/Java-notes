package generics.Comparison;

import java.util.*;
import java.util.function.*;

class consim implements Consumer<Integer>{

    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(5);
        obj.add(8);
        obj.add(6);
        obj.add(7);

        //simple way to print for each loop
        for (Integer i : obj) {
            System.out.println(i);
        }

        //other way of printing obj elements by using for each loop which requird interface consumer implementation
        // and for that we have to create another class
        Consumer<Integer> a = new consim();
        obj.forEach(a);

        //one more way by creating anony class for consumer iinterface
        obj.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        //last and short way by lambda func
        // i is the value that is getting passed to a consumer interface meth
        obj.forEach(i -> System.out.println(i));

    }
}
