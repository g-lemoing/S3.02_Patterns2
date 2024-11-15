package nivell1.interfaces;

import nivell1.modules.Dough;
import nivell1.modules.Pizza;
import nivell1.modules.Size;

public interface PizzaBuilder {

    void reset();
    void setName();
    void setSize(Size size);
    void setDough(Dough dough);
    void setTopping();
    Pizza getPizza();
}
