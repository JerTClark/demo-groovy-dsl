package fluent

def (wife, wonderful, her, I) = ["wife", "wonderful", "her", "I"]

def my(mine) {
    print("My ${mine}")
    this
}

def is(adjective) {
    print " is ${adjective}"
    this
}

def and(what) {
    print " and $what"
    this
}

def love(whatOrWho) {
    print " love ${whatOrWho}!"
}

my wife is wonderful and I love her