import com.google.gson.Gson;

import java.util.ArrayList;

public class PrivateOffice extends Room {
    
    public PrivateOffice(int id){
        super(id);
    }

    public PrivateOffice(int id, String name, int capacity, Thermostat thermo, Television tv, ArrayList<Light> lights, Phone phone, Speaker speaker, ArrayList<Employee> employees) {
        super(id, name, capacity, thermo, tv, lights, phone, speaker, employees);
        this.tv = null;
        this.speaker = null;
    }

}
