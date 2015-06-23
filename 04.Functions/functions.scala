def hi = "hi"
println(hi)

// in scala, functions are named, reusable expressions.
// they may be parameterized and
// they may return a value, but neither of these features are required.

// at most basic, a function is a named wrapper for expression

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

// One of the core values of functional programming is that functions should be first-
// class. The term indicates that they are not only declared and invoked but can be used
// in every segment of the language as just another data type. A first-class function may,
// as with other data types, be created in literal form without ever having been assigned
// an identifier; be stored in a container such as a value, variable, or data structure; and be
// used as a parameter to another function or used as the return value from another func‐
// tion.

// Higher other functions: Functions that accept other functions as parameters
// and/or use functions as return values are known as higher-order functions.
// Example: map() and reduce()

// Function type: ([<type>, ...]) => <type>
def double(x: Int): Int = {
    x * 2
}
val myDouble: Int => Int = double
println(myDouble(5))


// lambda functions
val doubler = (x: Int) => x * 2
println(doubler(10))

// using value binding, function currying can be done
