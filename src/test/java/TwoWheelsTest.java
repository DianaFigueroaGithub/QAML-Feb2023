import Utilities.Fuel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Model;

public class TwoWheelsTest {

    @Test
    public void startTwoWheelsVehicleTest(){
        TwoWheels motorbike = new TwoWheels(Fuel.GASOLINE);
        boolean started= motorbike.startShutDownVehicle(true);
        Assert.assertEquals(started, true);
    }

    @Test
    public void gasolineFuelTypeTest(){
        TwoWheels bike = new TwoWheels(Fuel.ELECTRIC);
        System.out.println(bike.getFuel());
        Assert.assertEquals(bike.getFuel(), Fuel.ELECTRIC);
    }

    @Test
    public void fuelTypeIsNotAVGAS(){
        TwoWheels motorbike = new TwoWheels(Fuel.GASOLINE);
        System.out.println(motorbike.getFuel());
        Assert.assertNotEquals(motorbike.getFuel(),Fuel.AVGAS);
    }

}
