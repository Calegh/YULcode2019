package SmartOffice.Peripherals;

public class Speaker extends Peripheral {
    private boolean isConnected;
    private boolean isPlaying;

    public Speaker(int id) {
        super(id);
        isConnected = false;
        isPlaying = false;
    }

    public Speaker(int id, boolean isOn) {
        super(id, isOn);
        isConnected = false;
        isPlaying = false;
    }

    public Speaker(int id, boolean isOn, boolean isConnected, boolean isPlaying) {
        super(id, isOn);
        this.isConnected = isConnected;
        this.isPlaying = isPlaying;
    }
}
