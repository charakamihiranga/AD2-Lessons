package good;


public class UserRegistrationManager {
    private LogService logService;
    private MailService mailService;
    private  UserDataService userDataService;

    public UserRegistrationManager(LogService logService, MailService mailService, UserDataService userDataService) {
        this.logService = logService;
        this.mailService = mailService;
        this.userDataService = userDataService;
    }

    public void registerUser(String username, String password){
        userDataService.saveUserData(username,password);
        mailService.sendMail(username);
        logService.logUser(username);
    }
}
