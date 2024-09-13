package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        
        Product laptop = new Product("Laptop", 15000000, 10);

        Sales sales = new Sales(laptop);

        sales.sellProduct(5);

        sales.restockProduct(12);

        sales.updateProductPrice(14000000);

        sales.updateProductPrice(-1000);
    }
}
