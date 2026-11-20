package uas.joshuakennyjohanes.views;


import uas.joshuakennyjohanes.models.SegiEmpat;

public class SegiEmpatObjectForm extends GObjectForm<SegiEmpat>{
     @Override
    protected String[] getFields() {
        String [] fields = {"Panjang", "Lebar"};
        return  fields;
    }

    @Override
    protected SegiEmpat  constructModelsFromValues(String label, double[] values) {
        SegiEmpat newPersegi = new SegiEmpat(label,values[0], values[1]);
        return  newPersegi;
    }

    @Override
    protected double[] extractValuesFromModel(SegiEmpat model) {
        double[] values = new double[getFields().length];
        values[0] = model.getPanjang();
        values[1] = model.getLebar();
        return values;
    }
    
}
