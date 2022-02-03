package com.demiurgos.Client;

import com.demiurgos.BusinessLogic.DataAccess.Repositories.*;
import com.demiurgos.BusinessLogic.Entities.Product;
import com.demiurgos.BusinessLogic.Entities.ProductQuantity;
import com.demiurgos.BusinessLogic.Entities.ShoppingCart;

public class Main {


    public static void main(String[] args) {
	// write your code here
        var cart = new ShoppingCart();
        //Comes from Catalogue
        //var p1 = Catalogue.getProduct(1);
        //var p2 = Catalogue.getProduct(2);
        //var p3 = Catalogue.getProduct(4);

        //Comes from Repository
        IProductRepository productRepository = new ProductRepository();
        ICustomerRepository customerRepository = new CustomerRepository();

        var c1 = customerRepository.GetById(1);
        var p1 = productRepository.GetById(1);
        var p2 = productRepository.GetById(2);
        var p3 = productRepository.GetById(4);

        cart.addProduct(new ProductQuantity(p1, 2));
        cart.addProduct(new ProductQuantity(p2, 1));
        cart.addProduct(new ProductQuantity(p3, 1));

        var order = c1.checkout(cart);
        System.out.println(order);

        //ShoppingCart <-- ProductQuantity <-- Product






        System.out.println(cart);
        System.out.println(cart.getTotalCost());



    }

}
