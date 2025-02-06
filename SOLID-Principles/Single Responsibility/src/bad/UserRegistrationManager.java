package bad;

public class UserRegistrationManager {
    public void registerUser(String name, String email) {
        saveData(name, email);
        sendEmail(email);
        logUser(name);
    }

    private void logUser(String name) {
        System.out.println("Logged in user: " + name);
    }

    private void sendEmail(String email) {
        System.out.println("Sending email: " + email);
    }

    private void saveData(String name, String email) {
        System.out.println("Saving data: " + name + " " + email);
    }
}
