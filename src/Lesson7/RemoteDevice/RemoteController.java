package Lesson7.RemoteDevice;

public class RemoteController implements Device,Volume {
    @Override
    public void powerOn() {
        System.out.println();
    }

    @Override
    public void powerOff() {

    }

    @Override
    public int setChannel() {
        return 0;
    }

    @Override
    public void currentChanel() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }
}
