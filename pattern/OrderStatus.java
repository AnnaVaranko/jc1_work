package pattern;

public enum OrderStatus {
    NEW(0), IN_PROGRESS(1000), PAID(5), DELIVERED(0);

    public int getPrice() {
        return price;
    }

    private int price;

    OrderStatus(int price) {
        this.price = price;
    }
}
