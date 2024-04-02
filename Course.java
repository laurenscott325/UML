import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Course implements Serializable {
    private String courseId;
    private String courseName;
    private String teacherUsername; 
    private List<String> studentUsernames; 

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.studentUsernames = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherUsername() {
        return teacherUsername;
    }

    public List<String> getStudentUsernames() {
        return studentUsernames;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherUsername(String teacherUsername) {
        this.teacherUsername = teacherUsername;
    }

    public void addStudentUsername(String username) {
        if (!studentUsernames.contains(username)) {
            studentUsernames.add(username);
        }
    }

    public void removeStudentUsername(String username) {
        studentUsernames.remove(username);
    }
}
