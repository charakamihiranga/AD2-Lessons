package bad;



// high-level module
public class Switch {
    private Bulb bulb;
    private Fan fan;

    public Switch(Bulb bulb) {
        this.bulb = bulb;
    }

    public Switch(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        if (bulb != null) {
            bulb.toggle();
        } else if (fan != null) {
            fan.toggle();
        }
    }
}




