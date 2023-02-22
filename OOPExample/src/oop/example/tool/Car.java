package oop.example.tool;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int hp;
    private String typeOfEngine;
    private String typeOfGearbox;
    private String yearOfCreation;

    public Car() {

    }
    public Car(String brand, String model, String color, int hp, String typeOfEngine, String typeOfGearbox, String yearOfCreation) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.typeOfEngine = typeOfEngine;
        this.typeOfGearbox = typeOfGearbox;
        this.yearOfCreation = yearOfCreation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfGearbox() {
        return typeOfGearbox;
    }

    public void setTypeOfGearbox(String typeOfGearbox) {
        this.typeOfGearbox = typeOfGearbox;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

}
