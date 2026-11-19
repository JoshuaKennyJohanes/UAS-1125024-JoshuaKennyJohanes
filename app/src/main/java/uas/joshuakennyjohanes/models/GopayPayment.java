package uas.joshuakennyjohanes.models;

import uas.joshuakennyjohanes.interfaces.PaymentStrategy;

public class GopayPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Print menggunakan go pay");
    }
    
    
}
