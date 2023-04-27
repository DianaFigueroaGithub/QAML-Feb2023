import Utilities.PassengerLevel;

import java.util.HashMap;
import java.util.Map;

public class Passenger implements ITPassengerType, IPassengerPersonalData{

    Map<Integer,String> passengerTable = new HashMap<>();
    private Integer idPassenger;
    private String passengerName;
    private PassengerLevel passengerType ;

    public void Passenger() {
        this.passengerTable = passengerTable;
        passengerTable.put(1,"Pablo Gutierrez");
        passengerTable.put(5,"Ester Gonzales");
        passengerTable.put(10,"Martha Debayle");
    }



    @Override
    public String getPassengerName() {
        System.out.println("return name"+ passengerName);
        return passengerName;
    }

    @Override
    public void setPassengerName(String passengerTestName) {
        this.passengerName = passengerTestName;
        System.out.println("name assigned" +passengerName);
    }

    @Override
    public PassengerLevel getPassengerType() {
        System.out.println("Type assigned");
        return passengerType;
    }

    @Override
    public void setPassengerType(PassengerLevel passengerLevel) {
        this.passengerType = passengerLevel;
    }
}
