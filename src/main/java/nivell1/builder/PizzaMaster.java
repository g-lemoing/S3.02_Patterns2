package nivell1.builder;

import nivell1.interfaces.PizzaBuilder;
import nivell1.modules.Dough;
import nivell1.modules.Size;

public class PizzaMaster {

    public void buildPizza(PizzaBuilder pizzaBuilder, Dough dough, Size size){
        pizzaBuilder.reset();
        pizzaBuilder.setTopping();
        pizzaBuilder.setDough(dough);
        pizzaBuilder.setSize(size);
        pizzaBuilder.setName();
    }
}
