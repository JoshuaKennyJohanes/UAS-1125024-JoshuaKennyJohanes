package uas.joshuakennyjohanes.models;

public abstract class GObject {
    private String label;

    public void setLabel(String label){
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }

    public abstract  String[][]getKeyValueDetails();
    
}
