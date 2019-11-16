package SmartOffice.Rooms;

import SmartOffice.Rooms.Room;

import java.util.ArrayList;

public class WorkArea extends Room {

    public WorkArea(int id){
        super(id);
    }

    public WorkArea(int id, String name, int capacity, Thermostat thermo, Television tv, Light light, Phone phone, Speaker speaker, ArrayList<Employee> employees) {
        super(id, name, capacity, thermo, tv, light, phone, speaker, employees);
        this.phone = null;
    }

}
