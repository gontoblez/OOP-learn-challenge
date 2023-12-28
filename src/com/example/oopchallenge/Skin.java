package com.example.oopchallenge;

public class Skin extends Organ {
    private String color;

    public Skin(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
