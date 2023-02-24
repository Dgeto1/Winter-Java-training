public class Motorcycle extends Vehicle{
    private int engineSize;

    public Motorcycle(String maker, String model, String yearOfCreation, double weight, int engineSize) {
        super(maker, model, yearOfCreation, weight);
        this.engineSize = engineSize;
    }
}
