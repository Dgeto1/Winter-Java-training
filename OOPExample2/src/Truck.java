public class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String maker, String model, String yearOfCreation, double weight, int cargoCapacity) {
        super(maker, model, yearOfCreation, weight);
        this.cargoCapacity = cargoCapacity;
    }
}
