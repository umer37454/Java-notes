package notes;

public class strings {
    public static void main(String[] args) {

        String str1 = "Ansari"; // this will point to same because created in pool
        String str2 = "Ansari"; // reason :  not use of new. same ref var

        String str3 = new String("Umer");  // not equal cos of new and created in heap
        String str4 = new String("Umer"); // this also

        // not equal because of new keyword
        System.out.println(str1 == str2); // true  same ref var and value
        System.out.println(str1.equals(str2)); // true same vale

        System.out.println(str3 == str4); // false. diff ref var
        System.out.println(str3.equals(str4)); // true. same val
        // new keyword create new object.

        System.out.println(str1.charAt(2));


        str1 = "Ansa";
        System.out.println(str1); // creating new in pool. previous one not change. garbage

    }
}

