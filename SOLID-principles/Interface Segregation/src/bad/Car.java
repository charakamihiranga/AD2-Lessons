package bad;



public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Car started");
    }

    @Override
    public void move() {
        System.out.println("Car move");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car cannot fly");
    }
}
