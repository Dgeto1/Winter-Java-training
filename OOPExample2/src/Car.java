public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String maker, String model, String yearOfCreation, double weight, int numberOfDoors) {
        super(maker, model, yearOfCreation, weight);
        this.numberOfDoors = numberOfDoors;
    }


}
