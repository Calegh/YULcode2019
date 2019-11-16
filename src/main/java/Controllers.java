import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
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
        room.setLight(getLightFromJsonObject(roomJson.get("light").getAsJsonObject()));
        room.setEmployees(getListEmployee(roomJson.get("employees").getAsJsonArray()));
        return room;
    }

    public static void updateLight(boolean isOn, String hexColor, int id) throws Exception{
        String hexaColor = "%23" + hexColor;
        if(hexaColor.charAt(0) == '#') {
            hexaColor = "%23" + hexColor.substring(1);
        }
        String urlString = String.format("https://squirtle.azurewebsites.net/yulcode/lights/%d?hexColor=%s&isOn=%b",
                id, hexaColor, isOn);
        URL url = new URL(urlString);
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
    }

    public static void updateEmployeePosition(int employeeID, int newRoomID) throws Exception{
        String urlString = String.format("https://squirtle.azurewebsites.net/yulcode/employees/%d?roomId=%d",
                employeeID, newRoomID);
        URL url = new URL(urlString);
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
        httpCon.setDoOutput(true);
        httpCon.setRequestMethod("PUT");
        OutputStreamWriter out = new OutputStreamWriter(
                httpCon.getOutputStream());
        out.write("Resource content");
        out.close();
        httpCon.getInputStream();
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
