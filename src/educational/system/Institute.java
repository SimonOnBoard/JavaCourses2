package educational.system;

public class Institute {

    private String name;
    private String address;
    private int countOfWorkers;
    private People[] workers;
    private Student[] students;
    private Direction[] directions;


    public Institute(String name, String address, int countOfWorkers, People[] workers, Student[] students, Direction[] directions) {
        this.name = name;
        this.address = address;
        this.countOfWorkers = countOfWorkers;
        this.workers = workers;
        this.students = students;
        this.directions = directions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public People[] getWorkers() {
        return workers;
    }

    public void setWorkers(People[] workers) {
        this.workers = workers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Direction[] getDirections() {
        return directions;
    }

    public void setDirections(Direction[] directions) {
        this.directions = directions;
    }
}

