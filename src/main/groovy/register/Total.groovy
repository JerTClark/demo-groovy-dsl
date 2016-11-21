package register

value = 0
def getClear() {value = 0}
def add(number) {value += number}
def subtract(number) {value -= number}
def getTotal() {println "Total is ${value}"}

clear
add 2
subtract 6
add 5
subtract 3
add 7
subtract 3
total