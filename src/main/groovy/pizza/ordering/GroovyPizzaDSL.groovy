package pizza.ordering

import pizza.CardType
import pizza.Crust
import pizza.Size

def large = Size.Large
def thin = Crust.Thin
def Olives = "Olives"
def Onions = "Onions"
def Bell_Pepper = "Bell Pepper"
def Visa = CardType.Visa

orderInfo = [:]

def methodMissing(String name, args) {
    orderInfo[name] = args
}

def acceptOrder(Closure closure) {
    closure.delegate = this
    closure()
    println "Validation and processing performed here for order received:"
    orderInfo.each { key, value ->
        println "${key} -> ${value.join(", ")}"
    }
}
