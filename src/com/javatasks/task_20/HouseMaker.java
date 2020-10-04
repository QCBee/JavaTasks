package com.javatasks.task_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HouseMaker {
    public static void main(String[] args){

        House house1 = new House(new Door("Ledged","wooden",2),"Kyiv Peremogy Avenue 45", "Tower",12);
        House house2 = new House(new Door("ledged", "wooden",2), "Dnipro Gararina Str.19", "Tower", 5);
        House house3 = new House(new Door("Braced", "wooden", 2), "Kyiv Peremogy Avenue 45", "Tower",12);

        System.out.println("Hashcode of house1: " + house1.hashCode());
        System.out.println("Hashcode of house2: " + house2.hashCode());
        System.out.println("Hashcode of house3: " +  house3.hashCode());

        System.out.println("Is house on the 12th floor?- " + house1.equals(house2));
        System.out.println("Is house on the 12th floor? - " +  house1.equals(house3));

        Map<House, Integer> map= new TreeMap<>();
        map.put(house1,1);
        map.put(house2,2);
        map.put(house3,3);

        for (Map.Entry<House, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
        }

        List<House> houses = new ArrayList<>();
        houses.add(new House(new Door("Ledged","wooden",2),"Kyiv Peremogy Avenue 10", "Tower",10));
        houses.add(new House(new Door("ledged", "wooden",2), "Dnipro Gararina Str.19", "Tower", 5));
        houses.add(new House(new Door("Braced", "wooden", 2),"Kyiv Peremogy Avenue 45", "Tower",12));

        houses.sort(new HouseFloorComparator());
        System.out.println("Sort by floor");
        for (House item:houses){
            System.out.println(item.getFloor());
        }

        houses.sort(new HouseAddressComparator());
        System.out.println("Sort by addressed");
        for (House item: houses){
            System.out.println(item.getAddress());
        }
    }
}
