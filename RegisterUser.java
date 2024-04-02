import java.util.Scanner;

public class RegisterUser {
    private SchoolManagementSystem system;
    private Scanner scanner;

    public RegisterUser(SchoolManagementSystem system) {
        this.system = system;
        this.scanner = new Scanner(System.in);
    }

    public void registerUser() {
        System.out.println("Register a new user");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter user type (Student/Teacher): ");
        String userType = scanner.nextLine().toLowerCase();

        User newUser = null;
        if ("student".equals(userType)) {
            newUser = new Student(name, username, password);
        } else if ("teacher".equals(userType)) {
            newUser = new Teacher(name, username, password);
        } else {
            System.out.println("Invalid user type.");
            return;
        }

        system.addUser(newUser);
    }

    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem(); 
        RegisterUser registerUser = new RegisterUser(system);
        registerUser.registerUser();
    }
}
