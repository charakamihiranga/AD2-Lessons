package bad;


public class UserRegistrationManager {
    public void registerUser(String username,String password){
        saveUserData(username,password);
        sendMail(username);
        logUser(username);
    }

    private void logUser(String username) {
        System.out.println("User logged");
    }

    private void sendMail(String username) {
//        gmail server
        System.out.println("Send mail to "+username);
    }

    private void saveUserData(String username, String password) {
        System.out.println("user saved");
    }
}








