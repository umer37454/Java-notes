package notes;


public class scoping {
    public static void main(String[] args) {

        //anything outside can be inside but anything inside can't outside
        int a = 10;
        int b = 20;



        // block scope - values initialisd in this block will remain in this
        // u can change 'a' here but cant initialise again like int a = 78;
        {
            a = 78;
            int c = 54; // this will remian here cant access from outside this block
        }

        int c = 44; // eg. there is two c.

        // scoping for loop
        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
        }
    }


    // function scope means variable is only accesible in that particular func.
    static void random(int marks) { //just for example using marks
        marks = 54;
//        System.out.println(marks);
    }
}

