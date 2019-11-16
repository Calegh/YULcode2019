import com.google.gson.Gson;
import java.util.ArrayList;

public abstract class Room {

    int id;
    String name;
    int capacity;
    Thermostat thermo;
    Television tv;
    Light light;
    Phone phone;
    Speaker speaker;
    ArrayList<Employee> employees;
    double timeStart;

    public Room(int id){
        this.id = id;
        this.timeStart = System.nanoTime();
    }

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
        this.timeStart = System.nanoTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Thermostat getThermo() {
        return thermo;
    }

    public void setThermo(Thermostat thermo) {
        this.thermo = thermo;
    }

    public Television getTv() {
        return tv;
    }

    public void setTv(Television tv) {
        this.tv = tv;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public double getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(double timeStart) {
        this.timeStart = timeStart;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    //METHODES

    public boolean isEmpty(){
        return (employees.size() == 0);
    }

    public double minutesPassed(){
        return (((System.nanoTime() - timeStart) / 1_000_000_000) / 60);
    }

}
