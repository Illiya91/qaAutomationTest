package Lesson7;

public interface Volume {

    void changeVolume(double value);




   }
    interface State  {
        void on();
        void off();


    }




class MyDevice implements Volume, State {
    private double volume;

    public void changeVolume(double value) {
        volume = value;
        System.out.println("Volume" + " " + value);
    }

    public void on() {
        System.out.println("Device on");
    }

    public void off() {
        System.out.println("Device off");
    }


    public static void main(String[] args) {
    MyDevice myDevice = new MyDevice();
        myDevice.changeVolume(6);
        myDevice.on();
        myDevice.off();
    }

}
















