public class Phone extends Peripheral {

    private String phoneNumber;
    private boolean isCalling;

    public Phone(int id, String phoneNumber) {
        super(id);
        this.phoneNumber = phoneNumber;
        this.isCalling = false;
    }

    public Phone(int id, boolean isOn, String phoneNumber, boolean isCalling) {
        super(id, isOn);
        this.phoneNumber = phoneNumber;
        this.isCalling = isCalling;
    }

    //GETTERS AND SETTERS

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isCalling() {
        return isCalling;
    }

    public void setCalling(boolean calling) {
        isCalling = calling;
    }

    //METHODES

}
