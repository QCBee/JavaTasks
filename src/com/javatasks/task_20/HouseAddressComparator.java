package com.javatasks.task_20;

import java.util.Comparator;

public class HouseAddressComparator implements Comparator <House> {
    @Override
    public int compare(House address1, House address2){
        return address1.getAddress().compareToIgnoreCase(address2.getAddress());
    }
}
