package pizza

class PizzaShop {
    //all enum types
    Size size
    Crust crust
    Address address
    Card card
    def toppings = []

    int setCard(CardType cardType, String number) {
        this.card = new Card(cardType, number)
        25
    }

    def setToppings(String... topping) {
        this.toppings = topping
    }

    def setAddress(String street, String city, String state) {
        this.address = new Address(street, city, state)
    }

    String getToppings() {
        this.toppings.join(", ")
    }

    def summary(time) {
        println "Your " + this.getSize() + ", " +
                this.getToppings() + " pizza will arrive to " +
                this.getAddress().toString() + " in " + time + " minutes."
    }

    static getPizza(Closure closure) {
        PizzaShop pizzaShop = new PizzaShop()
        closure.delegate = pizzaShop
        closure()
    }

}
