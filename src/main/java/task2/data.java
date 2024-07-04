package task2;

import java.util.Arrays;

public class data {
    private String name;
    private int roll;
    private int[] sub;
    private double avg;
    private float total;
    private char grace;


    public data(String name, int roll, int[] sub, double avg, float total, char grace) {
        this.name = name;
        this.roll = roll;
        this.sub = sub;
        this.avg = avg;
        this.total = total;
        this.grace = grace;
    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", sub=" + Arrays.toString(sub) +
                ", avg=" + avg +
                ", persen=" + total +
                ", grace=" + grace +
                '}';
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public void setPersen(float persen) {
        this.total = persen;
    }

    public void setGrace(char grace) {
        this.grace = grace;
    }

    public double getAvg() {
        return avg;
    }

    public float getPersen() {
        return total;
    }

    public char getGrace() {
        return grace;
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
