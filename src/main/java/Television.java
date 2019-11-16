package SmartOffice.Peripherals;

public class Television extends Peripheral {
    private boolean isPlaying;
    private String source;

    public Television(int id) {
        super(id);
        isPlaying = false;
        source = null;
    }

    public Television(int id, boolean isOn) {
        super(id, isOn);
        isPlaying = false;
        source = null;
    }

    public Television(int id, boolean isOn, boolean isPlaying, String source) {
        super(id, isOn);
        this.isPlaying = isPlaying;
        this.source = source;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
