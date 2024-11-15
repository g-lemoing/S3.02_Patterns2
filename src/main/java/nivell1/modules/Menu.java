package nivell1.modules;

import nivell1.builder.HawaianaPizzaBuilder;
import nivell1.builder.MargaritaPizzaBuilder;
import nivell1.builder.PizzaMaster;
import nivell1.builder.VegetarianPizzaBuilder;
import nivell1.interfaces.PizzaBuilder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu(){
        System.out.println("---- MENÚ PRINCIPAL ----");
        String[] options = {"Sortir de l'aplicació",
                            "Demanar pizza marguerita",
                            "Demanar pizza hawaiana",
                            "Demanar pizza vegetariana"
        };
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ". " + options[i]);
        }
    }

    public static byte readOption(){
        byte sel = -1;
        do {
            displayMenu();
            try{
                sel = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Valor entrat incorrecte");
            }finally {
                scanner.nextLine();
            }
        }while (sel < 0 || sel > 3);
        return sel;
    }

    public static boolean selMenu(){
        PizzaMaster pizzaMaster = new PizzaMaster();
        PizzaBuilder pizzaBuilder = null;
        Pizza pizza;
        switch (readOption()){
            case 0:
                System.out.println("Gràcies per utilitzar l'aplicació!");
                return true;
            case 1:
                pizzaBuilder = new MargaritaPizzaBuilder();
                break;
            case 2:
                pizzaBuilder = new HawaianaPizzaBuilder();
                break;
            case 3:
                pizzaBuilder = new VegetarianPizzaBuilder();
                break;
            default:
                System.out.println("Opció incorrecta");
        }
        Size size = Menu.menuAskSize("Mida de la pizza [Individual, Familiar]? ");
        Dough dough = Menu.menuAskDough("Tipus de massa [Fina, Normal, Doble]? ");
        if(pizzaBuilder != null){
            pizzaMaster.buildPizza(pizzaBuilder, dough, size);
            pizza = pizzaBuilder.getPizza();
            System.out.println("S'ha elaborat la " + pizza.toString());
        }
        return false;
    }

    public static Size menuAskSize(String message){
        String input;
        Size size = null;
        boolean isCorrect = false;
        do{
            System.out.println(message);
            try {
                input = scanner.nextLine();
                size = Size.valueOf(input);
                isCorrect = true;
            }catch (IllegalArgumentException e){
                System.out.println("La capacidad indicada no forma parte de los valores posibles.");
            }
        }while (!isCorrect);
        return size;
    }

    public static Dough menuAskDough(String message){
        String input;
        Dough dough = null;
        boolean isCorrect = false;
        do{
            System.out.println(message);
            try {
                input = scanner.nextLine();
                dough = Dough.valueOf(input);
                isCorrect = true;
            }catch (IllegalArgumentException e){
                System.out.println("La capacidad indicada no forma parte de los valores posibles.");
            }
        }while (!isCorrect);
        return dough;
    }
}
