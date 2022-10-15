package garagecar;

public class Car {
    String name;

    @Override
    public String toString(){//overriding the toString() method
        return name;
    }

    Car (String name) {
        this.name = name;
    }
}
