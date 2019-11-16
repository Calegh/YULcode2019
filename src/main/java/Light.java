public class Light extends Peripheral {
    private String hexColor;

    public Light(int id){
        super(id);
    }
    public Light(int id, boolean isOn, String hexColor) {
        super(id, isOn);
        this.hexColor = hexColor;
    }

    public String getHexColor() {
        return hexColor;
    }

    public void setHexColor(String color) {
        this.hexColor = color;
    }

    public static String getDayColor(int hour){
        String color;

        if (hour < 12 && hour > 5){
            color = "A9CCE8";
        } else if (hour >= 12 && hour < 17){
            color = "C2F942";
        } else {
            color = "F97942";
        }

        return color;
    }
}