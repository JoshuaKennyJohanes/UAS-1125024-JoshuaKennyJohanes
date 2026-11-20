package uas.joshuakennyjohanes.views;

import uas.joshuakennyjohanes.models.Lingkaran;

public class LingkaranObjectForm extends GObjectForm<Lingkaran> {

    public LingkaranObjectForm(){

    }

    @Override
    protected String[] getFields() {
        String[] fields = new String[1];
        fields[0] = "Jari-jari";
        return  fields;

    }

    @Override
    protected Lingkaran constructModelsFromValues(String label, double[] values) {
        Lingkaran lingkaran = new Lingkaran(label, values[0]);
        return  lingkaran;
    }

    @Override
    protected double[] extractValuesFromModel(Lingkaran model) {
        double[] values = new double[1];
        values[0] = model.getJariJari();
        return values;
    }


}
