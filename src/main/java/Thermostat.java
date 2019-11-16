import com.google.gson.Gson;

public class Thermostat extends Peripheral {
    private String airQuality;
    private double temperature;

    public Thermostat(int id) {
        super(id);
    }

    public Thermostat(int id, boolean isOn) {
        super(id, isOn);
    }

    public Thermostat(int id, boolean isOn, String airQuality, double temperature) {
        super(id, isOn);
        this.airQuality = airQuality;
        this.temperature = temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setAirQuality(String airQuality) {
        this.airQuality = airQuality;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
