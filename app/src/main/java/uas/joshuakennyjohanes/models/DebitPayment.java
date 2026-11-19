package uas.joshuakennyjohanes.models;

import uas.joshuakennyjohanes.interfaces.PaymentStrategy;
public class DebitPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Bayar menggunakan DEbit");
    }
    

    
}
