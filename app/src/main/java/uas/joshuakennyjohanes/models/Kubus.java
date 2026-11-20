package uas.joshuakennyjohanes.models;

public class Kubus extends Object3D {
    private double sisi;

    public Kubus(String label, double sisi){
        setLabel(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * (sisi*sisi);
    }

    @Override
    public double hitungVolume() {
        return sisi*sisi*sisi;
    }
    @Override
    public String[][] getKeyValueDetails() {
        String [][] string = { 
                            {"Label", getLabel()}, 
                            {"Luas", String.valueOf(hitungLuasPermukaan())},
                            {"Volume", String.valueOf(hitungVolume())},
                            {"Sisi", String.valueOf(sisi)},
                            {"Tipe","Kubus"}
                            };
        return  string;
        
    }
}
