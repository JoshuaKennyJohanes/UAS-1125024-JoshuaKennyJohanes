package uas.joshuakennyjohanes.views;

import uas.joshuakennyjohanes.models.Balok;

public class BalokObjectForm extends GObjectForm<Balok> {
    
    
    @Override
    protected String[] getFields() {
        String [] fields = new String[3];
        fields[0] = "Panjang";
        fields[1] = "Lebar";
        fields[2] = "Tinggi";
        return  fields;

    }

    @Override
    protected Balok constructModelsFromValues(String label, double[] values) {
        Balok newBalok = new Balok(label,values[0],values[1],values[3]);
        return  newBalok;       
    }
    

    protected double[] extractValuesFromModel(Balok model) {
        double[] values = new double[3];
        values[0] = model.getPanjang();
        values[1] = model.getLebar();
        values[2] = model.getTinggi();
        return  values; 

    };
}
