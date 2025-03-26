// Student class
// - student ID: String
// - first name: String
// - last name: String
// - course information
public class Student {
    private String id;
    private String nameF;
    private String nameL;
    private Course[] courses;

    Student(String id, String nameF, String nameL, Course[] courses) {
        this.id = id;
        this.nameF = nameF;
        this.nameL = nameL;
        this.courses = courses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public String getNameL() {
        return nameL;
    }

    public void setNameL(String nameL) {
        this.nameL = nameL;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}