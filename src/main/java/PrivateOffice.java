package SmartOffice.Rooms;

import SmartOffice.Rooms.Room;

import java.util.ArrayList;

public class PrivateOffice extends Room {
    
    public PrivateOffice(int id){
        super(id);
    }

    public PrivateOffice(int id, String name, int capacity, Thermostat thermo, Television tv, Light light, Phone phone, Speaker speaker, ArrayList<Employee> employees) {
        super(id, name, capacity, thermo, tv, light, phone, speaker, employees);
        this.tv = null;
        this.speaker = null;
    }

}
