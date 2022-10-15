package ExceptionHandling;

import java.io.IOException;

public class Main {
    //throws just used to tell that handled the upcoming error
    public static void main(String[] args) throws IOException {
        int a = 5;
        int b = 0;

        //here we r handling it
        try {
            throw new IOException();
        } catch (IOException f){
            System.out.println("IO exception");
        }

        try {
            throw new cusotmexcep();
        } catch (cusotmexcep ce){
            System.out.println(ce);
            System.out.println(ce.getMessage());
        }

        try {
            int c = a/b;
        } catch (Exception e){
            System.out.println("Cant divide by zero");
        }



    }
}
