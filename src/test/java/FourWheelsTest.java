import Utilities.Fuel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FourWheelsTest {


    @Test
    public void electricTypeTest() {
        FourWheels suv = new FourWheels(Fuel.ELECTRIC);
        System.out.println("This is a  Vehicle that works with "+suv.getFuel() + " fuel");
        Assert.assertEquals(suv.getFuel(), Fuel.ELECTRIC);
    }

    @Test
    public void numberOfWheelsTest(){
        FourWheels suv = new FourWheels(Fuel.ELECTRIC);
        System.out.printlnA("This is a vehicle with " + suv.tiresNumber + " wheels");
        Assert.assertEquals(suv.tiresNumber, 4);

    }

    @Test (priority = 2)
    public void startVehicle(){
        FourWheels suv = new FourWheels(Fuel.ELECTRIC);
        suv.startShutDownVehicle(true);
    }

    @Test (priority = 3)
    public void shutDownVehicle(){
        FourWheels suv = new FourWheels(Fuel.DIESEL);
        suv.startShutDownVehicle(false);
    }


}
