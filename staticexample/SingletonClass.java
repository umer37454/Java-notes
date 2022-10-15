package staticexample;

public class SingletonClass {

    //creating an instance
    private static SingletonClass instance; //= new SingletonClass();

    //making constructor private
    private SingletonClass(){

    }

    //making func private and making it return instance
    private static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        System.out.println(obj1);
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println(obj2);
    }
}
