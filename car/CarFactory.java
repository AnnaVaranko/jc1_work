package car;

public class CarFactory {

    public Car buildCar(CarType model){
        Car car;

        switch (model){
            case SEDAN:
                car = new SedanCar();
                break;
            case SMALL:
                car =new SmallCar();
                break;
            case LUXURY:
                car = new LuxuryCar();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + model);
        }

        return car;
    }
}
