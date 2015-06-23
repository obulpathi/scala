"hello" // a simple expression

val s = "hello" // s is assigned the return value of expresison "hello"

// code inside { } constitutes an expression block
// the expresison block is evaluates and the resulting value
// is assigned to v in the following example
val v = {
    var x: Int = 5
    x + 10
}
println(v)

// a statement does not return any value or it return Any?
// here the last statement is an assignment, which does not return any value
val u = {
    var x: Int = 10
    x = x * 10 + 15
}
println(u)
// Because a statement block has no output, it is commonly used to modify existing data or make changes
// outside the scope of the application (e.g., writing to the console, updating a database,
// connecting to an external server).

if (2 % 2 == 0) println("dsds")

if (67 % 3 == 0) println("67 is a multiple of 3") else println("67 is not a multiple of 3")

val i = 3
val j = 4
var max = if (i > j) i else j
println("Max value of " + i + " and " + j + " is " + max)

// match statements are very expressive in scala
//
max = i > j match {
    case true => i
    case false => j
}
println("Max value of " + i + " and " + j + " is " + max)

val min = i < j match {
    case true => i
    case false => j
}
println("Min of " + i + " and " + j + " is " + min)

// a single case can match multiple patterns
val day = "MON"
val kind = day match {
    case "MON" | "TUE" | "WED" | "THU" | "FRI" =>
        "weekday"
    case "SAT" | "SUN" =>
        "weekend"
}
println(day + " is " + kind)

for(x <- 1 to 10) {
    print(x + " ")
}
println()

for(x <- 1 until 10) {
    print( x + " ")
}
println()

for(x <- 0 to 100 by 10) {
    print(x + " ")
}
println()


// iterator guards
// the values being iterated upon can be tested to meet a certaiin condition
// if the condition is met, the loop is executed, else not
for(x <- 1 to 100 if x % 10 == 0) {
    print(x + " ")
}
println()

val y = for (x <- 1 to 10) yield {x}
println(y)

val z = for (x <- 0 to 10; y = 1 << x) yield y
println(z)

// value binding in scala, is kind of capturing / binding a value to a varaible
// so that it can be used as a part of the body
// value binding can also be used in match expressions
val powersOf2 = for (i <- 0 to 8; pow = 1 << i) yield pow
println(powersOf2)

// nested iterators
// have the same effect of nested for loops
for {i <- 1 to 2
     j <- 1 to 3}
    {
        println(i, j)
    }
var x = 0
while (x < 10) {
    print(x + " ")
    x = x + 1
}
println()

x = 0
do {
    print(x + " ")
    x = x + 1
} while (x < 10)
println()
