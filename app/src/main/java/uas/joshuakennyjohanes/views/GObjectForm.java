package uas.joshuakennyjohanes.views;

import java.util.ArrayList;
import java.util.List;

import uas.joshuakennyjohanes.models.GObject;
import uas.joshuakennyjohanes.models.Persegi;
import uas.joshuakennyjohanes.utils.ScannerUtils;

public abstract class GObjectForm <T extends GObject> {
    List<GObject> storage ; 

    public GObjectForm (){
         this.storage = new ArrayList<>();
    }

    public T showInsertForm(){


        double values[] = new double[getFields().length];
        
        System.out.println("LABEL: ");
        String labels = ScannerUtils.readLine();
        
        for(int i = 0 ; i < getFields().length ; i++){
            System.out.println("NILAI "+getFields()[i]+": ");
            values[i] = ScannerUtils.readDouble();  
        }    
        

        storage.add(constructModelsFromValues(labels, values));

        return constructModelsFromValues(labels, values);
    }

    protected abstract T constructModelsFromValues(String label, double[] values);

    protected abstract String[] getFields();

    protected abstract double[] extractValuesFromModel(T model);

 }

