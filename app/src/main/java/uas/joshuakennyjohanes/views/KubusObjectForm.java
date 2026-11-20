package uas.joshuakennyjohanes.views;

import uas.joshuakennyjohanes.models.Kubus;

public class KubusObjectForm extends  GObjectForm<Kubus>{
    @Override
    protected String[] getFields() {
        String[] field = new String[1];
        field[0] = "Sisi";
        return field;
    }

    @Override
    protected Kubus constructModelsFromValues(String label, double[] values) {
        Kubus newKubus = new Kubus(label, values[0]);
        return  newKubus;
    }

    @Override
    protected double[] extractValuesFromModel(Kubus model) {
        // TODO Auto-generated method stub
        return null;
    }

}
