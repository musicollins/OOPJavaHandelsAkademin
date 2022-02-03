package com.demiurgos.BusinessLogic.DataAccess.Static;

import com.demiurgos.BusinessLogic.Entities.Product;
import com.demiurgos.BusinessLogic.Entities.ProductType;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    private static final Map<Integer, Product> products = new HashMap<>();

    static{
        products.put(1, new Product(1, "iPhone 5", 399, ProductType.PHYSICAL, 1));
        products.put(2, new Product(2, "iPhone X", 999, ProductType.PHYSICAL, 1));
        products.put(3, new Product(3, "iPhone XS", 1299, ProductType.PHYSICAL, 2));
        products.put(4, new Product(4, "Mortal Kombat X", 35, ProductType.DIGITAL, 0));
    }

    public static Product getProduct(Integer id){
        return products.get(id);
    }







}
