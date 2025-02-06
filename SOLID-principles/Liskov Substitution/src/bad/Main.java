package bad;


public class Main {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.eat();
        eagle.fly();

        Bird penguin = new Penguin();
        penguin.eat();
        penguin.fly();
    }
}
