import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import static com.google.gson.JsonParser.parseReader;

public class Controllers {
    public static Employee getEmployee(int employeeID) throws Exception{
        String sURL = String.format("https://squirtle.azurewebsites.net/yulcode/employees/%d", employeeID);
        JsonObject employeeJSON = JSONUtils.getJSONObjectFromURL(sURL);
        Employee emp = getEmployeeFromJsonObject(employeeJSON);
        return emp;
    }

    public static Room getRoom(int roomID) throws Exception{
        String sURL = String.format("https://squirtle.azurewebsites.net/yulcode/rooms/%d", roomID);
        JsonObject roomJson = JSONUtils.getJSONObjectFromURL(sURL);
        Room room;
        String name = roomJson.get("name").getAsString();
        if (name.equals("Réception")){
            room = new Reception(roomID);
        } else if (name.equals("Bureau")){
            room = new PrivateOffice(roomID);
        }  else if (name.equals("Open Space")){
            room = new WorkArea(roomID);
        } else if (name.equals("Salle de Conférence")){
            room = new ConferenceRoom(roomID);
        } else{
            room = new Kitchen(roomID);
        }
        room.setCapacity(roomJson.get("capacity").getAsInt());
        room.setName(roomJson.get("name").getAsString());
        room.setLights(getLightFromJsonObject(roomJson.get("light").getAsJsonObject()));
        room.setEmployees(getListEmployee(roomJson.get("employees").getAsJsonArray()));
        return room;
    }

    private static Light getLightFromJsonObject(JsonObject lightJson){
        Light light = new Light(lightJson.get("id").getAsInt());
        boolean isOn = lightJson.get("isOn").getAsBoolean();
        if (isOn){
            light.turnOn();
        } else{
            light.turnOff();
        }
        light.setHexColor(lightJson.get("hexColor").getAsString());
        return light;
    }

    private static Employee getEmployeeFromJsonObject(JsonObject employeeJson){
        Employee emp = new Employee();
        emp.setId(employeeJson.get("id").getAsInt());
        emp.setEmail(employeeJson.get("email").getAsString());
        emp.setName(employeeJson.get("name").getAsString());
        emp.setTitle(employeeJson.get("title").getAsString());
        return emp;
    }

    private static ArrayList<Employee> getListEmployee(JsonArray listEmployeeJson){
        ArrayList<Employee> listEmployee = new ArrayList<>();
        for(int i = 0; i < listEmployeeJson.size(); i++){
            listEmployee.add(getEmployeeFromJsonObject(listEmployeeJson.get(i).getAsJsonObject()));
        }
        return listEmployee;
    }



}
