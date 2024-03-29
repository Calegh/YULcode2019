import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import static com.google.gson.JsonParser.parseReader;

public class JSONUtils {
    public static JsonObject getJSONObjectFromURL(String URL) throws Exception{
        java.net.URL url = new URL(URL);
        URLConnection request = url.openConnection();
        request.connect();

        JsonElement root = parseReader(new InputStreamReader((InputStream) request.getContent()));
        return root.getAsJsonObject();
    }

    public static JsonArray getJSONArrayFromURL(String URL) throws Exception{
        java.net.URL url = new URL(URL);
        URLConnection request = url.openConnection();
        request.connect();

        JsonElement root = parseReader(new InputStreamReader((InputStream) request.getContent()));
        return root.getAsJsonArray();
    }
}