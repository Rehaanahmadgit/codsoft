package task2;

import java.util.Arrays;

public class data {
    private String name;
    private int roll;
    private int[] sub;

    public data(String name, int roll, int[] sub) {
        this.name = name;
        this.roll = roll;
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", sub=" + Arrays.toString(sub) +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setSub(int[] sub) {
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int[] getSub() {
        return sub;
    }
}
