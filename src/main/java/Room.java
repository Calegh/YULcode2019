import java.util.ArrayList;

abstract class Room {

    int id;
    String name;
    int capacity;
    Thermostat thermo;
    Television tv;
    Light light;
    Phone phone;
    Speaker speaker;
    ArrayList<Employee> employees;

    public Room(int id, String name, int capacity, Thermostat thermo, Television tv, Light light, Phone phone, Speaker speaker, ArrayList<Employee> employees) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.thermo = thermo;
        this.tv = tv;
        this.light = light;
        this.phone = phone;
        this.speaker = speaker;
        this.employees = employees;
    }

    public int getId() {
        return 0;
    }

    public void setId(int id) {
    }

    public String getName() {
        return "";
    }

    public void setName(String name) {

    }

    public int getCapacity() {
        return 0;
    }

    public void setCapacity(int capacity) {
    }

    public Thermostat getThermo() {
        return null;
    }

    public void setThermo(Thermostat thermo) {
    }

    public Television getTv() {
        return tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public Light getLight() {
        return null;
    }

    public void setLight(Light light) {
        ;
    }

    public Phone getPhone() {
        return null;
    }

    public void setPhone(Phone phone) {

    }
}
