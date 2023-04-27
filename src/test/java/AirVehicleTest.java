import Utilities.Fuel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirVehicleTest {



    @Test
    public void AVGASTest(){
        AirVehicle airplane = new AirVehicle(Fuel.AVGAS);
        System.out.println("This is a  Vehicle that works with "+airplane.getFuel() + " fuel");
        Assert.assertEquals(airplane.getFuel(), Fuel.AVGAS);
    }

    @Test
    public void startVehicle(){
        AirVehicle airplane = new AirVehicle(Fuel.AVGAS);
        airplane.startShutDownVehicle(true);
    }

    @Test (priority = 2)
    public void shutDownVehicle(){
        AirVehicle airplane = new AirVehicle(Fuel.AVGAS);
        airplane.startShutDownVehicle(false);
    }

    public void setWheels(){
        AirVehicle airplane = new AirVehicle(Fuel.AVGAS);
        airplane.tiresNumber= 6;
        System.out.println("This is a  Vehicle has "+airplane.tiresNumber + " wheels");
        Assert.assertEquals(airplane.tiresNumber, 4);
    }


}
