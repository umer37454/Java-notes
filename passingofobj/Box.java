package passingofobj;

public class Box {
    int width;
    int height;

    Box(int w,int h){
        width = w;
        height = h;
    }

    //passing obj in constructor
    Box(Box b){
        //b2 obj is being passed.
        this.width = b.width;
        this.height = b.height;
    }

    //passing of obj of class type obj. this is fucn to compare two obj just like string func
    boolean isEqualto(Box b){
        //this keword will refer to b1 cos toequal func is caleed upon b1
        return this.width == b.width && this.height == b.height;
    }

    //making a func to return an obj
    static Box temp;
    static Box duplicate(){
        temp = new Box(45,85);
        return temp;
    }

    //independent func to compare and passing twon obj
    static boolean compareTo(Box b1, Box b2){
        //this can't be used cos func is static
        return b1.height == b2.height && b1.width == b2.width;
    }

    void display(){
        System.out.println(/*"The height of b3 which has taken its height from b1 is "+*/this.height);
        System.out.println(/*"The width of b3 which has taken its width from b1 is "+*/this.width);
    }
}
