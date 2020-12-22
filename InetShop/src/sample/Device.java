package sample;

public abstract class Device extends Good {
    private String cpu;
    private int ram;
    public abstract void getPerformance();

    public Device(){}
    public Device(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
    public Device(String model, double price, int count, String cpu, int ram){
        super(model, price, count);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
