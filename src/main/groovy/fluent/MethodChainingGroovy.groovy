package fluent

def (forward, left, then, fast, right) =
    ["forward", "left", "", "fast", "right"]

def move(dir) {
    println "Moving ${dir}"
    this
}

def and(then) {
    this
}

def turn(dir) {
    println "Turning ${dir}"
    this
}

def jump(speed, dir) {
    println "Jumping ${speed} and ${dir}"
    this
}

move forward and then turn left
jump fast, forward and then turn right