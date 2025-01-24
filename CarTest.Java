public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", 2022);
        car1.startEngine();
        car1.stopEngine();

        Car car2 = new Car("BMW", "X5", 2025);
        car2.startEngine();
        car2.stopEngine();
    }
}