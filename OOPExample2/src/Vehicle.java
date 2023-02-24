import java.util.Comparator;

public abstract class Vehicle {
    private String maker;
    private String model;
    private String yearOfCreation;

    public double getWeight() {
        return weight;
    }

    private double weight;

    public Vehicle(String maker, String model, String yearOfCreation, double weight) {
        this.maker = maker;
        this.model = model;
        this.yearOfCreation = yearOfCreation;
        this.weight = weight;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", yearOfCreation='" + yearOfCreation + '\'' +
                ", weight=" + weight +
                '}';
    }
}
