package org.drink.machine;

import annotation.Version;

@Version(number = "1.0")
public class DrinkAutomat {

    final private UserDisplay userDisplay;
    final private ProductStorage productStorage;

    public DrinkAutomat() {
        this.userDisplay = new UserDisplay();
        this.productStorage = new ProductStorage();
    }

    public void work(){
        while (true) {
            showProducts();
            Product selectedProduct = selectProduct();
            payProduct(selectedProduct);
            giveProduct(selectedProduct);

        }
    }


    private void showProducts() {
        userDisplay.print(productStorage.getProducts());
    }

    private Product selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        Product selectedProduct = productStorage.getProductByNumber(productNumber);
        return null;
    }

    private boolean payProduct(Product selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPrompt(productName, price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return true;
    }

    private void giveProduct(Product selectedProduct) {
        boolean result = productStorage.removeProduct(selectedProduct);
        userDisplay.printPurchaseResult(result);

    }

}
