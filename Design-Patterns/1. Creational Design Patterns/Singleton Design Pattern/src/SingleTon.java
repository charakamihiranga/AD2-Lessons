

public class SingleTon {
    private static SingleTon instance;
//    private String connection;

    private SingleTon() {
//        connection = "hello";
        System.out.println("SinglTon instance created");
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

//    public String getConnection() {
//        return connection;
//    }
}





