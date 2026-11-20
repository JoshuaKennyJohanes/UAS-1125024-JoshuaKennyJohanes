package uas.joshuakennyjohanes.controller;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.List;

import uas.joshuakennyjohanes.models.Balok;
import uas.joshuakennyjohanes.models.GObject;
import uas.joshuakennyjohanes.models.Kerucut;
import uas.joshuakennyjohanes.models.Kubus;
import uas.joshuakennyjohanes.models.Lingkaran;
import uas.joshuakennyjohanes.models.Persegi;
import uas.joshuakennyjohanes.models.SegiEmpat;
import uas.joshuakennyjohanes.views.BalokObjectForm;
import uas.joshuakennyjohanes.views.GObjectForm;
import uas.joshuakennyjohanes.views.KerucutObjectForm;
import uas.joshuakennyjohanes.views.KubusObjectForm;
import uas.joshuakennyjohanes.views.LingkaranObjectForm;
import uas.joshuakennyjohanes.views.OptionView;
import uas.joshuakennyjohanes.views.PersegiObjectForm;
import uas.joshuakennyjohanes.views.SegiEmpatObjectForm;

public class Controller {
    OptionView views = new OptionView();
    List<GObject> allObjects = new ArrayList<>();

    
    GObjectForm<Persegi> formPersegi = new PersegiObjectForm();
    GObjectForm<Kubus> formKubus = new KubusObjectForm();
    GObjectForm<Lingkaran> formLingkaran = new LingkaranObjectForm();
    GObjectForm<Balok> formBalok = new BalokObjectForm();
    GObjectForm<Kerucut> formKerucut = new KerucutObjectForm();
    GObjectForm<SegiEmpat> formSegiEmpat = new SegiEmpatObjectForm();
    

    public boolean Run(){
        int pilihan = views.FirstMenu();
        boolean status = true;
        if(pilihan!=0){
            switch (pilihan) {
                case 1:
                    for(GObject item : allObjects){
                        for(int i = 0 ; i < item.getKeyValueDetails().length; i++){
                            for(int j = 0 ; j < item.getKeyValueDetails()[i].length ; j++){
                                System.out.print(item.getKeyValueDetails()[i][j]+" ");
                            }
                            System.out.println("");
                        }
                    }
                    break;
                
                case 2:
                    allObjects.add(formPersegi.showInsertForm());
                    break;
                case 3:
                    allObjects.add(formSegiEmpat.showInsertForm());
                    break;
                case 4:
                    allObjects.add(formLingkaran.showInsertForm());
                    break;
                case 5:
                    allObjects.add(formKubus.showInsertForm());
                    break;  
                case 6:
                    allObjects.add(formBalok.showInsertForm());
                    break;      
                case 7:
                    allObjects.add(formKerucut.showInsertForm());
                    break;
                case 8:
                    return false;
                default:
                    break;
            }
            return status;
        } else {
            status = false;
            return status;
        }

    }


    
}
