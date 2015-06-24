// The root of all iterable collections, Iterable , provides a common set of
// methods for iterating through and manipulating collection data.

val numbers = List(32, 95, 24, 21, 17)
var total = 0;
for (i <- numbers) { total += i }

println("Head: " + numbers.head)
println("Tail: " + numbers.tail)
println("Length: " + numbers.size)
println("Third element: " + numbers(2))

println("Sum of numerrs in list: " + numbers + " is: " + total)

// foreach, map, reduce
numbers.foreach( (i: Int) => println(i * i))
println(numbers.map((i: Int) => i * i))
println(numbers.reduce((i: Int, j:Int) => i + j))

val colors = List("red", "green", "blue")
colors.foreach( (c: String) => println(c) )
colors.map( (c: String) => c.size)
// foreach vs map: output of map is a list too, output of foreach is not

val sum = numbers.reduce( (a: Int, b: Int) => a + b )


val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
val squares = Map(1 -> 2, 2 -> 4, 3 -> 9)
