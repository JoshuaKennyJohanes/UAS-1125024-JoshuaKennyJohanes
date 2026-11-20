package uas.joshuakennyjohanes.views;

import uas.joshuakennyjohanes.models.Kerucut;


public class KerucutObjectForm extends GObjectForm<Kerucut> {
    

    @Override
    protected String[] getFields() {
        String[] fields = new String[2];
        fields[0] = "Jari-jari";
        fields[1] = "Tinggi";
        return  fields;

    }

    @Override
    protected Kerucut constructModelsFromValues(String label, double[] values) {
        Kerucut kerucut = new Kerucut(label, values[0], values[1]);
        return  kerucut;
    }

    @Override
    protected double[] extractValuesFromModel(Kerucut model) {
        double[] values = new double[2];
        values[0] = model.getJariJari();
        values[1] = model.getTinggi();
        return  values;
        
    }


}
