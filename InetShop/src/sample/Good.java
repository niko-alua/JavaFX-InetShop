package sample;

public abstract class Good {
    private String model;
    private double price;
    private int count;
    private int sold;
    public abstract String showDetails();

    public Good(){}
    public Good(String model, double price, int count) {
        this.model = model;
        this.price = price;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
