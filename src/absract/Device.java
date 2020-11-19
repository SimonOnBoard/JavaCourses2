package absract;

public abstract class Device {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void on();
    public abstract void off();
    public abstract void printInfo();
}
