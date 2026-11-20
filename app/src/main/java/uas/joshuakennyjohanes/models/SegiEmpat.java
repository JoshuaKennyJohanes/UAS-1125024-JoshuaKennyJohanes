package uas.joshuakennyjohanes.models;

public class SegiEmpat extends Object2D {
    private double panjang;
    private double lebar;

    public SegiEmpat(String label, double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        setLabel(label);
    }



    @Override
    public double hitungKeliling(){
        return (2*lebar) + (2*panjang);
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }

    @Override 
    public String[][] getKeyValueDetails(){
        
        String [][] string = new String[10][10];
        return  string;
    }

    

}
