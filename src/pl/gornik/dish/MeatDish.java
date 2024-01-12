package pl.gornik.dish;

public class MeatDish extends Dish {
    private String meatType;

    public MeatDish(String name, double price, String ingrediants, String meatType) {
        super(name, price, ingrediants);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("Dane jest przygotowane z " + meatType + " mięsem");
    }

    @Override
    public void giveDish() {
        System.out.println("Danie jest podane do stolika " + getName());
    }
}
