package com.javatasks.task_20;

public class Door {
    private String type;
    private String material;
    private int quantity;

    public Door(String type, String material, int quantity) {
        this.type = type;
        this.material = material;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return "Information about door: " + "Type of door:" + getType() + " Material: " + getMaterial() + " Quantity: " + getQuantity();
    }

}
