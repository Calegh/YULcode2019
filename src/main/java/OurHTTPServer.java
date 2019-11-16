import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpServer;
import net.sf.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;

public class OurHTTPServer {
    static final int port=8080;

    public static void main(String args[])
    {
        try
        {

            HttpServer server=HttpServer.create(new InetSocketAddress(port), 0);

            server.createContext("/getEmployee", httpExchange ->
            {
                String URI = httpExchange.getRequestURI().toString();


                String sURL = "https://squirtle.azurewebsites.net/yulcode/employees/1";
                java.net.URL url = new URL(sURL);
                URLConnection request = url.openConnection();
                request.connect();

                JsonParser jp = new JsonParser(); //from gson
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
                JsonObject rootobj = root.getAsJsonObject();

                byte response[];
                response = rootobj.toString().getBytes("UTF-8");
                /*if (URI.equals("/bou")){

                    response = "BOUH !".getBytes("UTF-8");
                }else if(URI.equals("/hello")){
                    response = "Hello, World!".getBytes("UTF-8");
                } else {
                    response = "GNE?".getBytes("UTF-8");
                }*/
                httpExchange.getResponseHeaders().add("Content-Type", "text/plain; charset=UTF-8");
                httpExchange.sendResponseHeaders(200, response.length);

                OutputStream out=httpExchange.getResponseBody();
                out.write(response);
                out.close();
            });

            server.start();
        }
        catch (Throwable tr)
        {
            tr.printStackTrace();
        }
    }
}
