package Lesson7.RemoteDevice;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        remoteController.currentChanel();
        remoteController.downVolume();
        remoteController.mute();
        remoteController.powerOff();
        remoteController.powerOn();
        remoteController.setChannel();
        remoteController.upVolume();
    }
    }