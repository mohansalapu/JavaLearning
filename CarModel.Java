public class CarModel {
    String make;
    String model;
    int year;

    public void setCarDetails(String carMake, String carModel, int carYear) {
        make = carMake;
        model = carModel;
        year = carYear;
    }


    public void displayCarDetails() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {
        CarModel car1 = new CarModel();
        car1.setCarDetails("Chevrolet", "Impala", 2023);
        car1.displayCarDetails();

        CarModel car2 = new CarModel();
        car2.setCarDetails("Nissan", "Altima", 2024);
        car2.displayCarDetails();
    }
}