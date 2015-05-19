if (2 % 2 == 0) println("dsds")

if (67 % 3 == 0) println("67 is a multiple of 3") else println("67 is not a multiple of 3")

val i = 3
val j = 4
var max = if (i > j) i else j
println("Max value of " + i + " and " + j + " is " + max)

max = i > j match {
    case true => i
    case false => j
}
println("Max value of " + i + " and " + j + " is " + max)

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

for(x <- 1 to 100 if x % 10 == 0) {
    print(x + " ")
}
println()

val y = for (x <- 1 to 10) yield {x}
println(y)

val z = for (x <- 0 to 10; y = 1 << x) yield y
println(z)

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
