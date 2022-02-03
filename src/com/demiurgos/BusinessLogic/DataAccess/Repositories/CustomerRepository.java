package com.demiurgos.BusinessLogic.DataAccess.Repositories;

import com.demiurgos.BusinessLogic.Entities.Customer;
import com.demiurgos.BusinessLogic.Entities.Product;
import com.demiurgos.BusinessLogic.Entities.ProductType;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    private final List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Ralph", 1111222233334444L));
    }

    @Override
    public List<Customer> Load(){
        return customers;
    }
    @Override
    public Customer GetById(int id){
        Customer c = null;
        for( var customer : customers){
            if(customer.getId() == id) c = customer;
        }
        return c;
    }
}
