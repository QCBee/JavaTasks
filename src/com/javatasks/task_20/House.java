package com.javatasks.task_20;

public class House  implements Comparable<House>{
    private Door door;
    private String address;
    private String houseType;
    private int floor;

    public House (Door door, String address, String houseType, int floor) {
        this.door = door;
        this.address = address;
        this.houseType = houseType;
        this.floor = floor;
    }

    public Door getDoor() {
        return door;
    }

    public String getAddress() {
        return address;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        House house = (House) object;
        return floor == house.floor
                && (houseType == house.houseType
                || (houseType != null && houseType.equals(house.getHouseType())))
                && (door == house.door
                || (door != null && door .equals(house.getDoor())
        ));
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 12 * result + ((door == null) ? 0 : door.hashCode());
        result =  12 * result + ((address == null) ? 0 : address.hashCode());
        result = 12 * result + ((houseType == null) ? 0 : houseType.hashCode());
        result = 12 * result + floor;
        return result;
    }

    @Override
    public String toString(){
        return "Information about this house: " + "Address: " + getAddress()  +  " House Type: " + getHouseType()
                + " Floor: " + getFloor() +" " + door.toString();

    }

    @Override
    public int compareTo(House object) {
        return floor - object.floor;
    }

}
