package garagecar;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW car");
        Car car2 = new Car("Audi car");

        garage.parked(car1);
        garage.parked(car2);
    }
}
