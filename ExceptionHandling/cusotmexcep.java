package ExceptionHandling;

public class cusotmexcep extends Exception {

    //can use many fucntion in our own exception to print the message

    @Override
    public String getMessage() {
        return "Invalid";
    }

    /*public cusotmexcep(String msg) {
        super(msg);
    }*/

    @Override
    public String toString() {
        return "Invalid" ;
    }
}
