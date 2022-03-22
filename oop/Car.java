package oop;

public class Car extends Machine implements Movable, Breakable{
    public Car(){

    }

    public Car(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }

    @Override
    public void doBreak() {
        System.out.println("Car stopped");
    }

    @Override
    public void work() {
        System.out.println("Car is working..");
    }

    @Override
    public void stop(int sec) {
        System.out.println("Car stops " + sec + " sec");
    }

    public static void main(String[] args) {
        Machine car = new Car();
        Machine bicycle = new Bicycle();
        bicycle.stop(10);
        car.stop(100);
    }
}
