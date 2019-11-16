class Light extends Peripheral {
    string hexColor;

    public Light(int id, boolean isOn, string hexColor) {
        super(id, isOn);
        this.hexColor = hexColor;
    }

    public turnOn() {
        this.isOn = true;
    }

    public turnOff() {
        this.isOn = false;
    }

    public changeColor(string color) {
        this.hexColor = color;
    }
}