import Utilities.Fuel;

public class VehicleBase {
    private Fuel fuel; //Encapsulation through the constructor
    public String Model;
    public  String manufacturer;
    public int tiresNumber;



    public VehicleBase(Fuel fuel) {
        this.fuel = fuel;
    }

    public  boolean startShutDownVehicle(boolean start){
        System.out.println("Vehicle status needs to be set ON/OFF");
        if(start){
             System.out.println("Vehicle started");
            return true;
        }
        else {
            System.out.println("Vehicle Shut down");
            return false;
        }
    }

    public Fuel getFuel() {
        return fuel;
    }
}
