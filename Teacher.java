import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<String> courseIds; 

    public Teacher(String name, String username, String password) {
        super(name, username, password);
        this.courseIds = new ArrayList<>();
    }

    public void enrollInCourse(String courseId) {
        if (!courseIds.contains(courseId)) {
            courseIds.add(courseId);
        }
    }

}
