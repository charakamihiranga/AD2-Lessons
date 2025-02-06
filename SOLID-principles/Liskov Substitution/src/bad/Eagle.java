package bad;



public class Eagle extends Bird{
    @Override
    protected void eat() {
        System.out.println("Eagle can eating");
    }

    @Override
    void fly() {
        System.out.println("Eagle can fly");
    }
}
