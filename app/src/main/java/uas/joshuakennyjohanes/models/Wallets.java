package uas.joshuakennyjohanes.models;

public class Wallets {
    private String name;
    private double cashValue;
    
    public Wallets(String name, double cashValue){
        this.name = name;
        this.cashValue = cashValue;
    }

    public boolean validate(double amount){
        return amount <= cashValue;
    }

    public void pay(double amount){
        cashValue = cashValue -amount;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public String getName(){
        return this.name;
    }

}
