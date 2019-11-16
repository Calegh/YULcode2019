import com.google.gson.Gson;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    public ConferenceRoom(int id){
        super(id);
    }

    public ConferenceRoom(int id, String name, int capacity, Thermostat thermo, Television tv, ArrayList<Light> lights, Phone phone, Speaker speaker, ArrayList<Employee> employees) {
        super(id, name, capacity, thermo, tv, lights, phone, speaker, employees);
    }

}
