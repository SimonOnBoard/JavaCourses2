package educational.system;

public class Student extends People {

    private byte course;
    private Group group;
    private Direction direction;
    private Institute vuz;

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", group=" + group +
                ", direction=" + direction +
                ", vuz=" + vuz +
                "} " + super.toString();
    }


    public Student(String fio, int age, int points, byte course,
                   Group group, Direction direction, Institute vuz) {
        super(fio, age, points);
        this.course = course;
        this.group = group;
        this.direction = direction;
        this.vuz = vuz;
    }

    public void shoutBattleCry(){
        System.out.println("Я студент");
    }

    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Institute getVuz() {
        return vuz;
    }

    public void setVuz(Institute vuz) {
        this.vuz = vuz;
    }
}
