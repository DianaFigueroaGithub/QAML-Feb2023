import Utilities.PassengerLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PassengerTest {

    @Test
    public void passengerNameTest(){
        String ExpectedName = "Pablo Aguilar";
        PassengerLevel expectedPassengerType = PassengerLevel.VIP;

        Passenger pabloaguilar = new Passenger();
        pabloaguilar.setPassengerName("Pablo Aguilar");
        pabloaguilar.setPassengerType(PassengerLevel.VIP);

        String currentName = pabloaguilar.getPassengerName();
        PassengerLevel passengerType = pabloaguilar.getPassengerType();

        Assert.assertEquals(currentName, ExpectedName);
        Assert.assertEquals(passengerType, expectedPassengerType);

    }

    @Test
    public void passengertypeNotVIP(){
        Passenger TestPassenger = new Passenger();
        TestPassenger.setPassengerType(PassengerLevel.PREMIUM);
        PassengerLevel passengerType = TestPassenger.getPassengerType();
        Assert.assertNotEquals(passengerType, PassengerLevel.VIP);
    }
}
