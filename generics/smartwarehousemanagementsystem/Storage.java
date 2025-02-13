package org.example.generics.smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public  class Storage <T extends WarehouseItem>{
    private List<T> itemlist = new ArrayList<>();

    public void addItem(T item){
        itemlist.add(item);
    }
    public void removeItem(T item){
        itemlist.remove(item);
    }

    public static void getItems(List<? extends WarehouseItem>)  {
        for(Storage item : itemlist){
            item.displayDetails();
        }
    }


}
