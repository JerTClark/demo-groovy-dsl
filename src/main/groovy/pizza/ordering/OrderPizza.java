package pizza.ordering;

import pizza.CardType;
import pizza.Crust;
import pizza.PizzaShop;
import pizza.Size;

public class OrderPizza {

    public static void main(String[] args) {
        PizzaShop joesPizza = new PizzaShop();
        joesPizza.setSize(Size.Large);
        joesPizza.setCrust(Crust.Thin);
        joesPizza.setToppings("Pepperoni", "Cheese", "Pineapple");
        joesPizza.setAddress("14567 Wonderland Lane", "Yellowstone", "WY");
        int time = joesPizza.setCard(CardType.Visa, "1234-5678-9101");
        joesPizza.summary(time);
    }

}
