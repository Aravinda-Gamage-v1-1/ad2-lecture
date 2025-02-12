import good.DataService;
import good.EmailService;
import good.LoginService;
import good.UserRegistrationManager;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        EmailService emailService = new EmailService();
        LoginService loginService = new LoginService();
        good.UserRegistrationManager userRegistrationManager1 = new UserRegistrationManager(dataService, emailService, loginService);
        userRegistrationManager1.registerUser("John", "Doe");
    }
}
