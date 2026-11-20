package uas.joshuakennyjohanes.models;

import java.util.List;

public class GObjectForm <T extends GObject> {

    public GObjectForm (List<T> storage){

    }

    public T showInsertForm()

    protected abstract String[] getFields();

}