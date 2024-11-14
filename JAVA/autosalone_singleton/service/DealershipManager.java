package service;

import java.util.ArrayList;
import java.util.List;

import model.Vehicle;

public class DealershipManager {

    private List<Vehicle> vehicles;
    private static DealershipManager instance;  //fare quando usi singlenton

    private DealershipManager() { // privato per il singlenton
        vehicles = new ArrayList<>(); // Inizializza l'ArrayList    fare quando usi singlenton
    }

    public static DealershipManager getInstance() { //fare quando usi singlenton
        if (instance == null) {
            instance = new DealershipManager();
        }
        return instance;

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showInventory() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.printVehicle());
        }
    }

}
