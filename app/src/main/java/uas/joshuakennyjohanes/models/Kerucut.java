package uas.joshuakennyjohanes.models;

public class Kerucut extends Object3D {
    private double jariJari, tinggi;

    public Kerucut(String lable, double jariJari, double tinggi){
        setLabel(lable);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 3.14 * jariJari * (tinggi + jariJari);
    }

    @Override
    public double hitungVolume() {
        return 1/3 * 3.14 * jariJari *jariJari * tinggi;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String [][] string = { 
                            {"Label", getLabel()}, 
                            {"Luas", String.valueOf(hitungLuasPermukaan())},
                            {"Volume", String.valueOf(hitungVolume())},
                            {"Tinggi", String.valueOf(tinggi)},
                            {"Jari jari", String.valueOf(jariJari)},
                            {"Tipe","Kubus"}
                            };
        return  string;

    }

    public double getJariJari(){
        return this.jariJari;
    }

    public double getTinggi(){
        return this.tinggi;
    }

}
