import com.google.gson.Gson;

import java.util.ArrayList;

abstract class Room {

    int id;
    String name;
    int capacity;
    Thermostat thermo;
    Television tv;
    ArrayList<Light> lights;
    Phone phone;
    Speaker speaker;
    ArrayList<Employee> employees;

    public Room(int id){
        this.id = id;
    }

    public Room(int id, String name, int capacity, Thermostat thermo, Television tv, ArrayList<Light> lights, Phone phone, Speaker speaker, ArrayList<Employee> employees) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.thermo = thermo;
        this.tv = tv;
        this.lights = lights;
        this.phone = phone;
        this.speaker = speaker;
        this.employees = employees;
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

    public ArrayList<Light> getLights() {
        return lights;
    }

    public void setLights(ArrayList<Light> lights) {
        this.lights = lights;
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

    @Override
    public String toString() { return "";}

    //METHODES

    public boolean isEmpty(){
        return (employees.size() == 0);
    }

    public void turnOnLights(){
        for (int i = 0; i < lights.size(); i++){
            lights.get(i).turnOn();
        }
    }

    public void turnOffLights(){
        for (int i = 0; i < lights.size(); i++){
            lights.get(i).turnOff();
        }
    }

}
