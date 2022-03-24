package org.drink.machine;

import java.util.Scanner;

public class UserDisplay {
    public void print(Product[] products) {
        for(int productNumber = 1; productNumber <= products.length; productNumber++){
            if(products[productNumber - 1] == null || products[productNumber - 1].getCount() <= 0)
                continue;
            System.out.println(productNumber + ". " + products[productNumber - 1].getName() + " "
                    + products[productNumber - 1].getPrice());
        }
    }

    public void promptSelectProduct() {
        System.out.println("Pleas enter number");
    }

    public int readProductNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectValue = false;
        int productNumber = -1;

        String productNumberPattern = "[1-5]"; //TODO: creat method to generate regex dynamically

        while (!isCorrectValue) {
            if (scanner.hasNext(productNumberPattern)) {
                productNumber =  scanner.nextInt();
                isCorrectValue = true;
            }
            scanner.nextInt();
        }

        return productNumber;
    }

    public void printPaymentPrompt(String productName, double price) {
        System.out.println("Product " + productName + " price " + price);
        System.out.println("Please pay with your card.");
    }

    public void printPaymentResult(boolean payResult) {
        String res = payResult ? "Payment complete" : "Payment error" ;
        System.out.println(res);
//        if(payResult){
//            System.out.println("Payment complete");
//        } else {
//            System.out.println("Payment error");
//        }
    }

    public void printPurchaseResult(boolean result) {
        String res = result ? "Pleas take your product" : "Product not avialable";
        System.out.println(res);
    }
}
