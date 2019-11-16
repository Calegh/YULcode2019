abstract class Peripheral {
    int id;
    boolean isOn;

    public Peripheral(int id) {
        this.id = id;
        this.isOn = false;
    }

    public Peripheral(int id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }
}