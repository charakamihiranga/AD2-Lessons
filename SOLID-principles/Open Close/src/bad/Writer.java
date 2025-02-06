package bad;



enum WriteType {
    FILE,
    SOCKET,
    DATABASE
}

public class Writer {
    public void write(WriteType writeType ,String content){
        switch (writeType){
            case FILE -> System.out.println("Writing file : "+content);
            case SOCKET -> System.out.println("Writing socket : "+content);
            case DATABASE -> System.out.println("Writing socket : "+content);
        }
    }
//    public void writeToFile(String content){
//        System.out.println("Writing to file");
//    }
//
//    public void writeToSocket(String content){
//        System.out.println("Writing to socket");
//    }
}







