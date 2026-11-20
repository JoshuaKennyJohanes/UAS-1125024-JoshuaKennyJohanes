package uas.joshuakennyjohanes.views;


import uas.joshuakennyjohanes.models.Persegi;

public class PersegiObjectForm extends GObjectForm<Persegi> {
    
    private Persegi newPersegi;

    public PersegiObjectForm(){

    }

    @Override
    protected String[] getFields() {
        String [] fields = {"Sisi"};
        return  fields;
    }

    @Override
    protected Persegi constructModelsFromValues(String label, double[] values) {
        Persegi newPersegi = new Persegi(label,values[0]);
        return  newPersegi;
    }

    @Override
    protected double[] extractValuesFromModel(Persegi model) {
        double[] values = new double[getFields().length];
        values[0] = model.getSisi();
        return values;
    }
}
