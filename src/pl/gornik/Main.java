package pl.gornik;

import pl.gornik.dish.Dish;
import pl.gornik.dish.MeatDish;
import pl.gornik.dish.VegetarianDish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Dish> dishes = new ArrayList<>();
        initialize(dishes);
        for(Dish dish1 : dishes) dish1.displayInfo();
        System.out.println("---------------------------------");
        System.out.println("Podaj które danie chcesz zamówić: ");
        int order = scanner.nextInt();
        Dish dish = dishes.get(order);
        scanner.nextLine();
        System.out.println("Czy chcesz zmienić składniki dania? Wpisz [t] jeżeli tak i [n] dla nie");
        String userChoice = scanner.nextLine();
        if(userChoice.equalsIgnoreCase("t")){
            System.out.println("Podaj nowe składniki");
            String newIngrediants = scanner.nextLine();
            dish.changeIngrediants(newIngrediants);
            dish.prepare();
            dish.giveDish();
            dish.displayInfo();
        }
        else{
            dish.prepare();
            dish.giveDish();
        }
    }

    private static void initialize(List<Dish>dishes){
        dishes.add(new MeatDish("Schab", 99.99, "Ziemniaki, kolesław, kotlet schabowy", "wieprzowina"));
        dishes.add(new MeatDish("Indyk", 199.99, "Indyk", "Indycze"));
        dishes.add(new MeatDish("Pierogi z mięsem", 5.99, "Pierogi z mięsem x 7", "drób"));
        dishes.add(new VegetarianDish("Sałatka", 1.99, "Sałata, pomidor"));
        dishes.add(new VegetarianDish("kasza z surówką", 0, "kasza, surówka"));
        dishes.add(new VegetarianDish("Ryz bez warzyw", 1.99, "ryz"));

    }
}
