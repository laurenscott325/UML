import java.util.Scanner;

public class MenuSystem {
    private SchoolManagementSystem system;
    private Scanner scanner;

    public MenuSystem(SchoolManagementSystem system) {
        this.system = system;
        this.scanner = new Scanner(System.in);
    }

    public void showLoginMenu() {
        while (true) {
            System.out.println("\nLogin Menu:");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }
    }

    private void login() {
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

    public void showMainMenu() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nEnter a choice:\n");
            System.out.println("1. Add a student to a course");
            System.out.println("2. Remove a student from a course");
            System.out.println("3. Add a teacher to a course");
            System.out.println("4. Remove a teacher from a course");
            System.out.println("5. Create a course");
            System.out.println("6. Delete a course");
            System.out.println("7. View a course");
            System.out.println("8. Logout");

            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudentToCourse();
                    break;
                case 2:
                    removeStudentFromCourse();
                    break;
                case 3:
                    addTeacherToCourse();
                    break;
                case 4:
                    removeTeacherFromCourse();
                    break;
                case 5:
                    createCourse();
                    break;
                case 6:
                    deleteCourse();
                    break;
                case 7:
                    viewCourse();
                    break;
                case 8:
                    isRunning = false;
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                    break;
            }
        }
    }

    private void addStudentToCourse() {
    }
    private void removeStudentFromCourse() {
    }

    private void addTeacherToCourse() {
    }

    private void removeTeacherFromCourse() {
    }

    private void createCourse() {
    }

    private void deleteCourse() {
    }

    private void viewCourse() {
    }


}
