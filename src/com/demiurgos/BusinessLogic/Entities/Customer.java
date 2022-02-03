package com.demiurgos.BusinessLogic.Entities;

public class Customer {

    private final int id;
    private String name;
    private CreditCard creditCard;

    public Customer(int id, String name, long ccNum) {
        this.id = id;
        this.name = name;
        this.creditCard = new CreditCard(ccNum);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Validation
        this.name = name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public Order checkout(ShoppingCart cart){
        //Returns an Order type object
        var payment = creditCard.createPayment(cart.getTotalCost());
        return new Order(this, cart, payment);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
