import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static com.google.gson.JsonParser.parseReader;

public class Controllers {
    public static Employee getEmployee(int employeeID) throws Exception{
        String sURL = String.format("https://squirtle.azurewebsites.net/yulcode/employees/%d", employeeID);
        JsonObject employeeJSON = JSONUtils.getJSONObjectFromURL(sURL);
        Employee emp = new Employee();

        emp.setId(employeeID);
        emp.setEmail(employeeJSON.get("email").getAsString());
        emp.setName(employeeJSON.get("name").getAsString());
        emp.setTitle(employeeJSON.get("title").getAsString());
        return emp;
    }

    public static Room getRoom(int roomID) throws Exception{
        String sURL = String.format("https://squirtle.azurewebsites.net/yulcode/rooms/%d", roomID);
        JsonObject roomJson = JSONUtils.getJSONObjectFromURL(sURL);
        Room room = new Room(roomID);
        room.setCapacity(roomJson.get("capacity").getAsInt());
        room.setName(roomJson.get("name").getAsString());
        room.setLight(getLightFromJsonObject(roomJson.get("light").getAsJsonObject()));
        return room;
    }

    public static Light getLightFromJsonObject(JsonObject lightJson){
        Light light = new Light(lightJson.get("id").getAsInt());
        boolean isOn = lightJson.get("isOn").getAsBoolean();
        if (isOn){
            light.turnOn();
        } else{
            light.turnOff();
        }
        light.setColor(lightJson.get("hexColor").getAsString());
        return light;
    }



}
