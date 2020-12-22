package sample;

public class Sneakers extends Wearing {
    String season;

    public Sneakers(){};
    public Sneakers(String model, double price, int count, String size, String colour, String category, String season) {
        super(model, price, count, size, colour, category);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
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
                "Season: " + getSeason() + "; " +
                "Category: " + getCategory() + '\n';
        return det;
    }
}
