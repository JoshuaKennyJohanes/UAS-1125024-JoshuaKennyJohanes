package uas.joshuakennyjohanes.models;

import uas.joshuakennyjohanes.interfaces.KeyValueDetailable;

public abstract class GObject implements KeyValueDetailable{
    private String label;

    public void setLabel(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }

    public abstract  String[][]getKeyValueDetails();
    
}
