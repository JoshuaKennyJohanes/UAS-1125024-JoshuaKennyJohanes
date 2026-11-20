package uas.joshuakennyjohanes.models;

public class Balok extends Object3D{
    private double panjang, lebar, tinggi;
    
    public Balok(String label, double panjang, double lebar, double tinggi){
        setLabel(label);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (2*(panjang*lebar)) + (2 * (panjang* tinggi)) + (2 * (tinggi * lebar));
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public String[][] getKeyValueDetails() {
        String [][] string = { 
                            {"Label", getLabel()}, 
                            {"Luas", String.valueOf(hitungLuasPermukaan())},
                            {"Volume", String.valueOf(hitungVolume())},
                            {"Panjang", String.valueOf(panjang)},
                            {"Lebar", String.valueOf(lebar)},
                            {"Tinggi", String.valueOf(tinggi)},
                            {"Tipe","Balok"}
                            };
        return  string;
    }

    
    public double getPanjang(){
        return this.panjang;
    }

    public double getLebar(){
        return this.lebar;
   }

   public double getTinggi(){
    return this.tinggi;
   }

}
