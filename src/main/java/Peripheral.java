package SmartOffice.Peripherals;

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
        if (!isOn) {
            this.isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            this.isOn = false;
        }
    }
}