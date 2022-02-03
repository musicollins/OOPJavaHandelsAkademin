package com.demiurgos.BusinessLogic.Entities;

import java.util.Date;

public class CreditCard {
    private final long ccNum;

    public CreditCard(long ccNum) {
        this.ccNum = ccNum;
    }

    public long getCcNum() {
        return ccNum;
    }

    public Payment createPayment(int totalCost){
        //returns a Payment type object
        var date = (int)(new Date().getTime());
        var paymentId = System.identityHashCode(this) + date;
        return new Payment(this, totalCost, paymentId);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "ccNum=" + ccNum +
                '}';
    }
}
