package sample;
import java.util.ArrayList;

public class SmartPhone extends Device{
    private double mgpx;
    private String generation;

    public SmartPhone(){}
    public SmartPhone(String model, double price, int count, String cpu, int ram, double mgpx, String generation) {
        super(model, price, count, cpu, ram);
        this.mgpx = mgpx;
        this.generation = generation;
    }

    public double getMgpx() {
        return mgpx;
    }

    public void setMgpx(double mgpx) {
        this.mgpx = mgpx;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    @Override
    public void getPerformance() {
        System.out.print("Performance of " + getModel() + '\n' +
                "CPU: " + getCpu() + '\n' +
                "RAM: " + getRam() + '\n');
    }

    @Override
    public String showDetails() {
        String det = getModel() + ": " +
                getPrice() + "KZT" + "; " +
                "CPU: " + getCpu() + "; " +
                "RAM: " + getRam() + "; " +
                "Camera: " + getMgpx() + "mpx" + "; " +
                "Generation: " + getGeneration() + '\n';
        return det;
    }
}
