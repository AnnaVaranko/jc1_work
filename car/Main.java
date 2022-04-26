package car;

public class Main {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car car = cf.buildCar(CarType.LUXURY);
        car.construct();
        System.out.println(car);
    }
}
