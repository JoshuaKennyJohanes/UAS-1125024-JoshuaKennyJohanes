package uas.joshuakennyjohanes.models;

public class Persegi extends Object2D{
    private double sisi;

    public Persegi(String label, double sisi){
        setLabel(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4*sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String [][] string = { 
                            {"Label", getLabel()}, 
                            {"Luas", String.valueOf(hitungLuas())},
                            {"Keliling", String.valueOf(hitungKeliling())},
                            {"Sisi", String.valueOf(sisi)},
                            {"Tipe", "Persegi"}
                            };
        return  string;
    }

    public double getSisi(){
        return this.sisi;
    }
}