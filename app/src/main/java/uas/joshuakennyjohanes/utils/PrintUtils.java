package uas.joshuakennyjohanes.utils;

import java.util.List;

import uas.joshuakennyjohanes.interfaces.KeyValueDetailable;


public class PrintUtils {
    
    public static <T extends KeyValueDetailable> void printGObjectDetail(List<T> listItem){
        for(T item : listItem){
            System.out.print(item.getKeyValueDetails());
        }
    } 

}
