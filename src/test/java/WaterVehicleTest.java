import Utilities.Fuel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaterVehicleTest {

    @Test
    public void fuelTypeIsNotGasoline(){
        WaterVehicle ship = new WaterVehicle(Fuel.DIESEL);
        Assert.assertNotEquals(ship.getFuel(),Fuel.GASOLINE);
    }

    @Test
    public void fuelTypeIsDiesel(){
        WaterVehicle ship = new WaterVehicle(Fuel.DIESEL);
        System.out.println("This is a  Vehicle that works with "+ship.getFuel() + " fuel");
        Assert.assertEquals(ship.getFuel(),Fuel.DIESEL);
    }

    @Test (priority = 2)
    public void startVehicle(){
        WaterVehicle ship = new WaterVehicle(Fuel.DIESEL);
        ship.startShutDownVehicle(true);
    }

    @Test (priority = 3)
    public void shutDownVehicle(){
        WaterVehicle ship = new WaterVehicle(Fuel.DIESEL);
        ship.startShutDownVehicle(false);
    }

}
