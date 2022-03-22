package org.drink.machine;

public class ProductStorage {

    private Product[] products;

    public ProductStorage() {
        products = new Product[5];
        products[0] = new Product("Coca-Cole", 2.00, 5);
        products[1] = new Product("Fanta", 2.00, 5);
        //products[2] = new Product("Sprite", 2.00, 5);
        products[3] = new Product("FuseTea", 1.50, 5);
        products[4] = new Product("Bonaqua", 1.09, 5);
    }

    public Product[] getProducts() {
        return products;
    }
}
