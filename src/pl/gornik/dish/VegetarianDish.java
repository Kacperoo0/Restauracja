package pl.gornik.dish;

public class VegetarianDish extends Dish{

    public VegetarianDish(String name, double price, String ingrediants) {
        super(name, price, ingrediants);
    }

    @Override
    public void prepare() {
        System.out.println("Danie wegetariańskie jest gotowe");
    }

    @Override
    public void giveDish() {
        System.out.println("Danie wegetariańskie o naziwe " + getName());
    }
}
