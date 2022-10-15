package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.brake();

        Media carmedia = new Car();
        carmedia.stop();

        Engine engine1 = new PowerEngine();

        NiceCar car2 = new NiceCar(engine1);
        car2.start();

        NiceCar car1 = new NiceCar();

        car1.downgrade();
        car1.start();
        car1.upgradeengine();
        car1.start();
    }
}
