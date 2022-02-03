package com.demiurgos.BusinessLogic.Entities;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<ProductQuantity> products;

    public ShoppingCart(){
        products = new ArrayList<>();
    }

    public void addProduct(ProductQuantity product){
        products.add(product);
    }

    public int getTotalCost(){
        int total = 0;
        for (var product :
                products) {
            total = total + product.getPrice();
        }
        return total;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
