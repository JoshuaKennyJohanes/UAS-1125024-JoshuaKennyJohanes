package uas.joshuakennyjohanes.utils;

import uas.joshuakennyjohanes.interfaces.PaymentStrategy;

public class PaymentHandler {
    
    public PaymentHandler(PaymentStrategy paymentMethod){
        paymentMethod.pay();
    }

}
