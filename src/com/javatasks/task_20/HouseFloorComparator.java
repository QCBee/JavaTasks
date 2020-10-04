package com.javatasks.task_20;

import java.util.Comparator;

public class HouseFloorComparator implements Comparator <House> {
    @Override
    public int compare(House floor1, House floor2){
        return floor1.getFloor() < floor2.getFloor() ? -1 : floor1.getFloor() == floor2.getFloor() ? 0 : 1;
    }
}
