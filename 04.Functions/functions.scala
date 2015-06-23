// In Scala, functions are named, reusable expressions. They may be parameterized and
// they may return a value, but neither of these features are required.

// at most basic, a function is a named wrapper for expression
def hi = "hi"
println(hi)

// specifying return values
def hello: String = "hello"
println(hello)
def log(d: Double) = println("Got value " + d)
log(3.14)

// specifying parameters
def mult(x: Int, y: Int): Int = {
    x * y
}
println(mult(3, 4))

println(mult(3, {5+6}))

// The body of these functions consists essentially of expressions or expression blocks,
// where the final line becomes the return value of the expression and thus the function.

// pure functions vs functions
// a pure function has no side effects and its return value depends
// only on input parameters
def max(a: Int, b:Int, c:Int): Int = {
    def max2(x:Int, y:Int) = if (x > y) x else y
    max2(a, max2(b, c))
}
println("Max of 2, 3, 4 is: " + max(2, 3, 4))

// Scala compiler can optimize some recursive functions with
// tail-recursion so that recursive calls do not use additional stack space.

// default parameters
def greet(name: String, prefix: String = "") = println("Hi " + prefix + " " + name)

greet("Obul")
greet("Obul", "Mr.")
