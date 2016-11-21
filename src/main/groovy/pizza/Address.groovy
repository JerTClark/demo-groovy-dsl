package pizza

class Address {

    String street
    String city
    String state

    Address(String street, String city, String state) {
        this.street = street
        this.city = city
        this.state = state
    }

    String toString() {
        this.street + " " + this.city + ", " + this.state
    }
}
