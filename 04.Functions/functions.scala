def hi: String = "hi"
println(hi)

def mult(x: Int, y: Int): Int = {
    x * y
}
println(mult(3, 4))

println(mult(3, {5+6}))

def max(a: Int, b:Int, c:Int): Int = {
    def max2(x:Int, y:Int) = if (x > y) x else y
    max2(a, max2(b, c))
}
println("Max of 2, 3, 4 is: " + max(2, 3, 4))
