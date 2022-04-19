package org.drink.machine;

import java.util.List;

public class ProductStorage<T extends Countable> {

    private List<T> products;

    public ProductStorage(List<T> products) {
        this.products = products;
    }

    public List<T> getProducts() {
        return products;
    }

    public T getProductByNumber(int productNumber) {
        return products.get(productNumber - 1);
    }

    public boolean removeProduct(T  selectedProduct ) {
        if(selectedProduct.getCount() == 0) {
            return false;
        }
        selectedProduct.decreaseCount();
        return true;
    }
}
