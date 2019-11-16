package SmartOffice.Rooms;

import SmartOffice.Peripherals.*;
import SmartOffice.Employee;
import java.util.ArrayList;

public class ConferenceRoom extends Room {

    public ConferenceRoom(int id){
        super(id);
    }

    public ConferenceRoom(int id, String name, int capacity, Thermostat thermo, Television tv, Light light, Phone phone,
                          Speaker speaker, ArrayList<Employee> employees) {
        super(id, name, capacity, thermo, tv, light, phone, speaker, employees);
    }

}
