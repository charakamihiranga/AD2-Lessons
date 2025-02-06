package bad;


public class Bulb {
    private boolean isOn = false;

    public void toggle(){
        isOn = !isOn;

        if (isOn){
            System.out.println("Light is on");
        } else {
            System.out.println("Light is off");
        }
    }
}
