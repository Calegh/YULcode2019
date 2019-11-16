import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static com.google.gson.JsonParser.parseReader;

public class Controllers {
    public static JsonObject getEmployee(int employeeID) throws Exception{
        String sURL = String.format("https://squirtle.azurewebsites.net/yulcode/employees/%d", employeeID);
        JsonObject employeeJSON = JSONUtils.getJSONObjectFromURL(sURL);
        Employee emp = new Employee();

        emp.setId(employeeID);
        emp.setEmail(employeeJSON.get("email").getAsString());
        emp.setName(employeeJSON.get("name").getAsString());
        emp.setTitle(employeeJSON.get("title").getAsString());
        return employeeJSON;
    }


}
