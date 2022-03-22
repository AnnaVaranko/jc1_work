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
            } else {
                isCorrectValue = false;
            }
        }

        return productNumber;
    }
}
