package uas.joshuakennyjohanes.models;

public class DebitCard {
    private String cardNumber;
    private double balance;
    private String pin;

    public DebitCard(String cardNumber, double balance, String pin){
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public boolean validate(double amount){
        return amount <= balance;
    }

    public void pay(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getPin(){
        return this.pin;
    }
}
