import java.util.Scanner;

public class Login {
    private SchoolManagementSystem system;
    private Scanner scanner;

    public Login(SchoolManagementSystem system) {
        this.system = system;
        this.scanner = new Scanner(System.in);
    }

    public void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = system.getAllUsers().stream()
                          .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                          .findFirst()
                          .orElse(null);

        if (user != null) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();
        Login login = new Login(system);
        login.login();
    }
}
