package uas.joshuakennyjohanes.views;

import uas.joshuakennyjohanes.utils.ScannerUtils;

public class OptionView {
    
    public int FirstMenu(){
        System.out.println("1. Tampilkan Semua");
        System.out.println("2. Tambah persegi");
        System.out.println("3. Tambah persegi empat");
        System.out.println("4. Tambah lingkaran");
        System.out.println("5. Tambah Kubus");
        System.out.println("6. Tambah balok");
        System.out.println("7. Tambah kerucut");
        System.out.println("0. Keluar");
        int option = ScannerUtils.readInt();
        return option;
    }
}
