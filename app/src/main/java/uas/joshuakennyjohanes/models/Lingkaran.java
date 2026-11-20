package uas.joshuakennyjohanes.models;

public class Lingkaran extends Object2D {
    private double jariJari;

    public Lingkaran(String label, double jariJari){
        setLabel(label);
        this.jariJari = jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public double hitungLuas() {
        return  (Math.PI)*(Math.PI) * jariJari; 
    }

    @Override
    public String[][] getKeyValueDetails() {
        String [][] string = { 
                            {"Label", getLabel()}, 
                            {"Luas", String.valueOf(hitungLuas())},
                            {"Keliling", String.valueOf(hitungKeliling())},
                            {"Jari Jari", String.valueOf(jariJari)},
                            {"Tipe", "Lingkaran"}
                            };
        return  string;

    }

    public double getJariJari(){
        return this.jariJari;
    }

}
