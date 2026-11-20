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
import uas.joshuakennyjohanes.views.BalokObjectForm;
import uas.joshuakennyjohanes.views.GObjectForm;
import uas.joshuakennyjohanes.views.KerucutObjectForm;
import uas.joshuakennyjohanes.views.KubusObjectForm;
import uas.joshuakennyjohanes.views.LingkaranObjectForm;
import uas.joshuakennyjohanes.views.OptionView;
import uas.joshuakennyjohanes.views.PersegiObjectForm;

public class Controller {
    OptionView views = new OptionView();
    List<GObject> allObjects = new ArrayList<>();

    
    GObjectForm<Persegi> formPersegi = new PersegiObjectForm();
    GObjectForm<Kubus> formKubus = new KubusObjectForm();
    GObjectForm<Lingkaran> formLingkaran = new LingkaranObjectForm();
    GObjectForm<Balok> formBalok = new BalokObjectForm();
    GObjectForm<Kerucut> formKerucut = new KerucutObjectForm();
    

    public Controller(){
        int pilihan = views.FirstMenu();
        switch (pilihan) {
            case 1:
                for(GObject item : allObjects){
                    for(int i = 0 ; i < item.getKeyValueDetails().length; i++){

                    }
                }
                break;
        
            default:
                break;
        }

    }


    
}
