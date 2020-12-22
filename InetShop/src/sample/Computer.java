package sample;

public class Computer extends Device{
    private boolean ssd;
    private int memory;

    public Computer (){}

    public Computer(String model, double price, int count, String cpu, int ram, boolean ssd, int memory) {
        super(model, price, count, cpu, ram);
        this.ssd = ssd;
        this.memory = memory;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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
                "RAM: " + getRam() + "; ";
        if(isSsd()){
            det += "SSD: yes; ";
        }
        else{
            det += "SSD: no; ";
        }
        det += "HHD: " + getMemory() + "Gb\n";
        return det;
    }
}

