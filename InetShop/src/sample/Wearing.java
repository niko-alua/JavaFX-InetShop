package sample;

public abstract class Wearing extends Good{
    private String size;
    private String colour;
    private String category;
    public abstract String getCategories();

    public Wearing() {}

    public Wearing(String model, double price, int count, String size, String colour, String category) {
        super(model, price, count);
        this.size = size;
        this.colour = colour;
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

