package bad;



public class Fan {
    private boolean isOn = false;

    public void toggle(){
        isOn = !isOn;

        if (isOn){
            System.out.println("Fan is on");
        } else {
            System.out.println("Fan is off");
        }
    }
}
