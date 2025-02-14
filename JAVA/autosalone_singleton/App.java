import model.Car;
import model.Motorcycle;
import service.DealershipManager;

public class App {

    public static void main(String[] args) {
        DealershipManager dealership = DealershipManager.getInstance(); //fare cosi quando usi singlenton

        Car car1 = new Car("Tesla", "Model S", 79999.99);
        Car car2 = new Car("Ford", "Mustang", 55999.99);
        Motorcycle ducati=new Motorcycle("Ducati", "Monster", 10000.20);

        dealership.addVehicle(car1);
        dealership.addVehicle(car2);
        dealership.addVehicle(ducati);

        System.out.println("Inventario dell'autosalone:");
        dealership.showInventory();
        

    }
    
}
