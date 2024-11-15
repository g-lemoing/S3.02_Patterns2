package nivell1.builder;

import nivell1.interfaces.PizzaBuilder;
import nivell1.modules.Dough;
import nivell1.modules.Pizza;
import nivell1.modules.Size;
import nivell1.modules.Topping;

import java.util.List;

public class MargaritaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    private final static String NAME = "Margarita";
    public MargaritaPizzaBuilder(){
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
        List<Topping> toppings = List.of(
                Topping.Tomaquet, Topping.Mozzarela);
        this.pizza.setToppings(toppings);
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }

    @Override
    public String toString() {
        return "Pizza Margarita: " +
                pizza +
                '}';

    }
}

