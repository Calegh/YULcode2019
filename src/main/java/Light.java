class Light extends Peripheral {
    String hexColor;

    public Light(int id, boolean isOn, String hexColor) {
        super(id, isOn);
        this.hexColor = hexColor;
    }

    public void changeColor(String color) {
        this.hexColor = color;
    }


}