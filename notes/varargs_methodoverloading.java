package notes;

import java.util.Arrays;

public class varargs_methodoverloading {

    public static void main(String[] args) {

        // var args
        fun(1,2,3,4);
        multiple(4,5,"Umer", "ansari");

        // method overloading
        method();
        method(5);
    }


    // method overloading. same name func but para differs
    static void method(){
        System.out.println("Hello");
    }

    // any differ type of para. para can be same name but with diff data type
    static void method(int a){
        System.out.println(a);
    }

    // another eg of var args
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + Arrays.toString(v));
    }

    static void fun(int... arr) {  //... means array. so we use this when we dont know how many para will be passed u can try string also
        System.out.println(Arrays.toString(arr));
    }
}