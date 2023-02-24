import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public Vehicle getVehicleMaxWeight(){
        Vehicle maxWeightVehicle = null;
        double maxWeight = Double.NEGATIVE_INFINITY;

        for(Vehicle vehicle : vehicles) {
            if(vehicle.getWeight() > maxWeight) {
                maxWeight = vehicle.getWeight();
                maxWeightVehicle = vehicle;
            }
        }

        return maxWeightVehicle;
    }

    public ArrayList<Vehicle> getVehicleByMaker(String maker) {
        ArrayList<Vehicle> newVehicleList = new ArrayList<>();
        for(Vehicle vehicle : vehicles) {
            if(vehicle.getMaker().equals(maker)){
                newVehicleList.add(vehicle);
            }
        }
        return newVehicleList;
    }
}
