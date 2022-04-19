package org.drink.machine;

import java.util.Arrays;

public class SweetAutomat {
    final private UserDisplay userDisplay;
    final private ProductStorage<Sweet> productStorage;

    public SweetAutomat() {
        userDisplay = new UserDisplay();

        Sweet[] sweets = new Sweet[5];
        sweets[0] = new Sweet("Mars", 1.5, 5);
        sweets[1] = new Sweet("Bounty", 2, 5);
        sweets[2] = new Sweet("Kit-Kat", 1.5, 5);
        sweets[3] = new Sweet("Alyonka", 2, 5);

        productStorage = new ProductStorage<>(Arrays.asList(sweets));
    }

    public void work(){
        while (true) {
            showProducts();
            Sweet selectedProduct = selectProduct();
            payProduct(selectedProduct);
            if(!giveProduct(selectedProduct)) break;

        }
    }

    private void showProducts() {
        userDisplay.print(productStorage.getProducts().toArray(Product[]::new));
    }

    private Sweet selectProduct() {
        userDisplay.promptSelectProduct();
        int productNumber = userDisplay.readProductNumber();
        Sweet selectedProduct = productStorage.getProductByNumber(productNumber);
        return null;
    }

    private boolean payProduct(Sweet selectedProduct) {
        String productName = selectedProduct.getName();
        double price = selectedProduct.getPrice();
        userDisplay.printPaymentPrompt(productName, price);
        //TODO: call payment interface
        boolean payResult = true;
        userDisplay.printPaymentResult(payResult);
        return true;
    }

    private boolean giveProduct(Sweet selectedProduct) {
        boolean result = productStorage.removeProduct(selectedProduct);
        userDisplay.printPurchaseResult(result);
        return true;
    }

    public static void main(String[] args) {
        SweetAutomat sweetAutomat = new SweetAutomat();
        sweetAutomat.work();
    }
}


