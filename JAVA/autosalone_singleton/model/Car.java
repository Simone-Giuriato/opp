package model;

public class Car implements Vehicle {
    protected final String TYPE="Car";
    protected String brand;
    protected String model;
    protected double price;

    public Car(String brand, String model, double price){
        
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
