package nivell1.modules;

import java.util.List;

public class Pizza {
    private String name;
    private Size size;
    private Dough dough;
    private List<Topping> toppings;

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza " +
                name +
                ", mida " + size +
                ", massa " + dough +
                ", toppings " + toppings;
    }
}
