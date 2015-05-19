class User(n: String) {
    val name: String = n
    def greet: String = "Hello from " + name
    override def toString = "User(" + name +")"
}

val u = new User("Obul")
println(u)

class User2(val name: String) {
    def greet: String = "Hi " + name
    override def toString: String = "User: " + name
}
val u2 = new User2("Obul2")
println(u2)
