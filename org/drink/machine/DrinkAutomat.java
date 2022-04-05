package org.drink.machine;

import annotation.Version;

@Version(number = "1.0")
public class DrinkAutomat {

    final private UserDisplay userDisplay;
    final private ProductStorage<Beverage> productStorage;

    public DrinkAutomat() {
        this.userDisplay = new UserDisplay();

        Beverage[] beverages = new Beverage[5];
        beverages[0] = new Beverage("Coca-Cole", 2.00, 5, 0.5);
        beverages[1] = new Beverage("Fanta", 2.00, 5, 0.33);
        beverages[2] = new Beverage("Sprite", 2.00, 5, 0.25);
        beverages[3] = new Beverage("FuseTea", 1.50, 5, 0.25);
        beverages[4] = new Beverage("Bonaqua", 1.09, 5, 0.5);

        this.productStorage = new ProductStorage<>(beverages);
    }

    public void work(){
        while (true) {
            showProducts();
            Beverage selectedProduct = selectProduct();
            payProduct(selectedProduct);
            if(!giveProduct(selectedProduct)) break;

        }
    }

    private void showProducts() {
        userDisplay.print(productStorage.getProducts());
    }

    private Beverage selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        Beverage selectedProduct = productStorage.getProductByNumber(productNumber);
        return null;
    }

    private boolean payProduct(Beverage selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPrompt(productName, price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return true;
    }

    private boolean giveProduct(Beverage selectedProduct) {
        boolean result = productStorage.removeProduct(selectedProduct);
        userDisplay.printPurchaseResult(result);
        return true;
    }

}
