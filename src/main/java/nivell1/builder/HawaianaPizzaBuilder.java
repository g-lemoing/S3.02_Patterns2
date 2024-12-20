package nivell1.builder;

import nivell1.interfaces.PizzaBuilder;
import nivell1.modules.Dough;
import nivell1.modules.Pizza;
import nivell1.modules.Size;
import nivell1.modules.Topping;

import java.util.List;

public class HawaianaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    private final static String NAME = "Hawaina";

    public HawaianaPizzaBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void setName() {
        this.pizza.setName(NAME);
    }

    @Override
    public void setSize(Size size) {
        this.pizza.setSize(size);
    }

    @Override
    public void setDough(Dough dough) {
        this.pizza.setDough(dough);

    }

    @Override
    public void setTopping() {
        List<Topping> toppings = List.of(new Topping[]{
                Topping.Mozzarela, Topping.Tomaquet, Topping.Pernil_Dolc, Topping.Pinya
        });
        this.pizza.setToppings(toppings);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public String toString() {
        return "Pizza Hawaiana: " +
                pizza +
                '}';
    }
}
