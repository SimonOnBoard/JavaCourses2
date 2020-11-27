package educational.system;

public class Group {
    private String number;
    private int count;
    private Student student;
    private Student[] students;

    public Group(String number, int count, Student student, Student[] students) {
        this.number = number;
        this.count = count;
        this.student = student;
        this.students = students;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
