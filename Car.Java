public class Car {
    String make;
    String model;
    int year;


    public Car(String carMake, String carModel, int carYear) {
        make = carMake;
        model = carModel;
        year = carYear;
    }

    public void startEngine() {
        System.out.println("Car engine is now starting...");
    }


    public void stopEngine() {
        System.out.println("Car engine is now stopping...");
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2023);
        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year);
        car1.startEngine();
        car1.stopEngine();

        Car car2 = new Car("Ford", "Mustang", 2024);
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year);
        car2.startEngine();
        car2.stopEngine();
    }
}