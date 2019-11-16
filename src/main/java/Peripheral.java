abstract class Peripheral {
    private int id;
    private boolean isOn;

    public Peripheral(int id) {
        this.id = id;
        this.isOn = false;
    }

    public Peripheral(int id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }

    public int getId() {
        return id;
    }

    public boolean isTurnedOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }
}