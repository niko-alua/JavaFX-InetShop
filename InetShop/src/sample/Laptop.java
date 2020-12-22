package sample;

public class Laptop extends Computer{
    private double weight;
    private boolean touch;

    public Laptop(){}
    public Laptop(String model, double price, int count, String cpu, int ram, boolean ssd, int memory, double weight, boolean touch) {
        super(model, price, count, cpu, ram, ssd, memory);
        this.weight = weight;
        this.touch = touch;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
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
        det += "HHD: " + getMemory() + "G; " +
                "Weight: " + getWeight() +  "kg; ";
        if (isTouch()){
            det += "Touch: yes\n";
        }
        else {
            det += "Touch: no\n";
        }
        return det;
    }

    @Override
    public void getPerformance() {
        System.out.print("Performance of " + getModel() + '\n' +
                "CPU: " + getCpu() + '\n' +
                "RAM: " + getRam() + '\n');
    }

}

