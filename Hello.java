public class Hello {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        System.out.println(car.price % 2);
        System.out.println(car.model);
        System.out.println(car.getPrice(15));
        car.getPrice(3);
        car.setPrice(200);
    }
}

class Car{
    int price;
    int newPrice;
    String model = "BMW X6";

    public int getPrice(int price){

        return this.price = price;
    }

    public void setPrice(int newPrice){
        this.newPrice = newPrice;
        System.out.println(this.newPrice);

    }
}