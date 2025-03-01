package good;

public class UserRegistrationManager {
    private DataService dataService;
    private EmailService emailService;
    private LoginService loginService;

    public UserRegistrationManager(DataService dataService, EmailService emailService, LoginService loginService) {
        this.dataService = dataService;
        this.emailService = emailService;
        this.loginService = loginService;
    }

    public void registerUser(String name, String email) {
        dataService.saveData(name, email);
        emailService.sendEmail(email);
        loginService.logUser(name);
    }
}
