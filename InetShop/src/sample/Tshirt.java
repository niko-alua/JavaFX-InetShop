package sample;

public class Tshirt extends Wearing{
    String material;

    public Tshirt(){};
    public Tshirt(String model, double price, int count, String size, String colour, String category, String material) {
        super(model, price, count, size, colour, category);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getCategories() {
        return null;
    }

    @Override
    public String showDetails() {
        String det = getModel() + ": " +
                getPrice() + "KZT" + "; " +
                "Size: " + getSize() + "; " +
                "Colour: " + getColour() + "; " +
                "Material: " + getMaterial() + "; " +
                "Category: " + getCategory() + '\n';
        return det;
    }
}
