package SmartOffice.Peripherals;

public class Light extends Peripheral {
    private String hexColor;

    public Light(int id){
        super(id);
    }
    public Light(int id, boolean isOn, String hexColor) {
        super(id, isOn);
        this.hexColor = hexColor;
    }

    public void setHexColor(String color) {
        this.hexColor = color;
    }
}