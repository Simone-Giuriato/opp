package model;

public interface Vehicle {

    String getType();
    String getBrand();
    String getModel();
    double getPrice();

    default String printVehicle(){
        return getType()+": "+getModel()+" ("+getBrand()+") - "+getPrice();
    }

}
