package car;

public abstract class Car {
    private CarType model;

    Car (){}

    Car (CarType model){
        this.model = model;
    }

    abstract void construct ();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
