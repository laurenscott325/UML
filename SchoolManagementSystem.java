import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.Serializable;

public class SchoolManagementSystem implements Serializable {
    private List<User> users;
    private List<Course> courses;

    public SchoolManagementSystem() {
        this.users = new ArrayList<>();
        this.courses = new ArrayList<>();
        initializeAdminAccount();
    }
  
    private void initializeAdminAccount() {
        boolean adminExists = users.stream()
                .anyMatch(user -> "admin".equals(user.getUsername()));
        
        if (!adminExists) {
            users.add(new Admin("admin", "admin", "admin")); 
        }
    }

    public void addUser(User user) {
        if (users.stream().noneMatch(u -> u.getUsername().equals(user.getUsername()))) {
            users.add(user);
        } else {
            System.out.println("User with this username already exists.");
        }
    }

    public void deleteUser(String username) {
        users.removeIf(u -> u.getUsername().equals(username));
    }

    public void addCourse(Course course) {
        if (courses.stream().noneMatch(c -> c.getCourseId().equals(course.getCourseId()))) {
            courses.add(course);
        } else {
            System.out.println("Course with this ID already exists.");
        }
    }

    public void deleteCourse(String courseId) {
        courses.removeIf(c -> c.getCourseId().equals(courseId));
    }

    public List<Student> getAllStudents() {
        return users.stream()
                .filter(u -> u instanceof Student)
                .map(u -> (Student) u)
                .collect(Collectors.toList());
    }

    public List<Teacher> getAllTeachers() {
        return users.stream()
                .filter(u -> u instanceof Teacher)
                .map(u -> (Teacher) u)
                .collect(Collectors.toList());
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    public List<User> getAllUsers() {
    return new ArrayList<>(users); 
}

}
