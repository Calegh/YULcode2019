import java.util.ArrayList;

public class PrivateOffice extends Room {

    int id;
    String name;
    int capacity;
    //Thermostat thermo;
    //Television tv;
    Light light;
    //Phone phone;
    //Speaker speaker;
    ArrayList<Employee> employees;

    public PrivateOffice(int id, String name, int capacity, /*Thermostat thermo, Television tv,*/ Light light, /*Phone phone, Speaker speaker,*/ ArrayList<Employee> employees) {
        super(id, name, capacity, /*thermo, tv,*/ light, /*phone, speaker,*/ employees);
        /*this.tv = null;
        this.speaker = null;*/
    }
    //GETTERS ET SETTERS
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /*@Override
    public Thermostat getThermo() {
        return thermo;
    }

    @Override
    public void setThermo(Thermostat thermo) {
        this.thermo = thermo;
    }*/

    @Override
    public Light getLight() {
        return light;
    }

    @Override
    public void setLight(Light light) {
        this.light = light;
    }/*

    @Override
    public Phone getPhone() {
        return phone;
    }

    @Override
    public void setPhone(Phone phone) {
        this.phone = phone;
    }*/

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

}





