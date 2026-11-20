package uas.joshuakennyjohanes.views;


import java.util.Scanner;

import uas.joshuakennyjohanes.models.Persegi;
import uas.joshuakennyjohanes.utils.ScannerUtils;

public class PersegiObjectForm extends GObjectForm<Persegi> {
    

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
