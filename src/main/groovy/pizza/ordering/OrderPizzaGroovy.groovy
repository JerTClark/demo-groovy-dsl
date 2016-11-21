package pizza.ordering

import pizza.CardType
import pizza.Crust
import pizza.PizzaShop
import pizza.Size

new PizzaShop().with {
    setSize Size.Large
    setCrust Crust.Deep
    setToppings "Pepperoni", "Cheese", "Buffalo Chicken"
    setAddress "1234 Sesame Street", "Learning Way", "ME"
    summary setCard(CardType.MasterCard, "54321-0987-43210")
}
