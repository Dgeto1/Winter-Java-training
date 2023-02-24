public class Main {
    public static void main(String[] args) {
        VehicleManager vehicleManager = new VehicleManager();
        vehicleManager.addVehicle(new Car("BMW", "M5", "22.02.2022", 1000, 4));
        vehicleManager.addVehicle(new Car("Mercedes", "S63", "22.02.2022", 1000, 4));
        vehicleManager.addVehicle(new Truck("Volvo", "M5", "22.02.2022", 5000, 2000));
        vehicleManager.addVehicle(new Motorcycle("Yamaha", "M5", "22.02.2022", 1000, 450));

        System.out.println(vehicleManager.getVehicleByMaker("Mercedes").toString());
        System.out.println(vehicleManager.getVehicleMaxWeight().getMaker());
    }
}