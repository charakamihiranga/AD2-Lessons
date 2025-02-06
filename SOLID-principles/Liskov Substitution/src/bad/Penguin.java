package bad;


public class Penguin extends Bird{
    @Override
    protected void eat() {
        System.out.println("Penguin can eat");
    }

    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
