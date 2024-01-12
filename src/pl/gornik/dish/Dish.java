package pl.gornik.dish;

public abstract class Dish {
    private String name;
    private double price;
    private String ingrediants;

    public Dish(String name, double price, String ingrediants) {
        this.name = name;
        this.price = price;
        this.ingrediants = ingrediants;
    }
    public abstract void prepare();

    public abstract void giveDish();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngrediants() {
        return ingrediants;
    }

    public void setIngrediants(String ingrediants) {
        this.ingrediants = ingrediants;
    }

    public void displayInfo(){
        System.out.println(name + ", cena " + price + ",składniki " + ingrediants);
    }
    public void changeIngrediants(String ingrediants){
        this.ingrediants = ingrediants;
    }
}
