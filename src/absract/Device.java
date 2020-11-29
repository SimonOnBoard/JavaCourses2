package absract;

import java.util.List;
import java.util.TreeSet;

public abstract class Device {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device(String name) {
        this.name = name;
    }

    public abstract void on();
    public abstract void off();
    public abstract void printInfo();
}
