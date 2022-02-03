package com.demiurgos.BusinessLogic.Entities;

public class Payment {
    private CreditCard CreditCard;
    private int totalPrice;
    private int paymentId;

    public Payment(CreditCard creditCard, int totalPrice, int paymentId) {
        this.CreditCard = creditCard;
        this.totalPrice = totalPrice;
        this.paymentId = paymentId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "CreditCard=" + CreditCard +
                ", totalPrice=" + totalPrice +
                ", paymentId=" + paymentId +
                '}';
    }
}
