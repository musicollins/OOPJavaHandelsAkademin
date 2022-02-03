package com.demiurgos.BusinessLogic.DataAccess.Repositories;

import com.demiurgos.BusinessLogic.Entities.Product;
import com.demiurgos.BusinessLogic.Entities.ProductType;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "iPhone 5", 399, ProductType.PHYSICAL, 1));
        products.add(new Product(2, "iPhone X", 999, ProductType.PHYSICAL, 1));
        products.add(new Product(3, "iPhone XS", 1299, ProductType.PHYSICAL, 2));
        products.add(new Product(4, "Mortal Kombat X", 35, ProductType.DIGITAL, 0));
    }

    public List<Product> Load(){
        return products;
    }

    public Product GetById(int id){
        Product p = null;
        for( var product : products){
            if(product.getId() == id) p = product;
        }
        return p;
    }
}
