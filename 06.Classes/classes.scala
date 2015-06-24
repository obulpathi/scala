// lets define the simplest class

class User
val u = new User
println(u)

class User1(n: String) {
    val name: String = n
    def greet: String = "Hello from " + name
    override def toString = "User(" + name +")"
}

val u1 = new User1("Obul")
println(u1)

class User2(val name: String) {
    def greet: String = "Hi " + name
    override def toString: String = "User: " + name
}
val u2 = new User2("Obul2")
println(u2)

// Polymorphism
class A {
    def hi = "Hello from A"
    override def toString = getClass.getName
}

class B extends A {
    override def hi = "Hello from B"
}

println(new A().hi)
println(new B().hi)

// abstract classes
abstract class Car {
    val year: Int
    val automatic: Boolean = true
    def color: String
}
class RedMini(val year: Int) extends Car {
    def color = "Red"
}
println(new RedMini(2005))

// overloading methods allowed

// apply method: the default method
class Multiplier(factor: Int) {
    def apply(input: Int) = input * factor
}
val tripleMe = new Multiplier(3)
println(tripleMe.apply(10))
println(tripleMe(10))


class RandomPoint {
    val x = {println("Creating x"); util.Random.nextInt()}
    lazy val y = {println("Creating y"); util.Random.nextInt()}
}
val point = new RandomPoint()
println("Created class")
println(point, point.x, point.y)

// packages
// package <identifier>
// import <package>.<class>

// access modifiers
// private and protected
// fine grained privacy controls can be applied to specific packages as well

// final class: class members can never be overridden in subclasses.

// An object is a type of class that can have no more than one instance
// also known in object oriented design as a singleton.
object Hello {
    println("in Hello");
    def hi = "hi"
}
println(Hello.hi)
println(Hello.hi)

// A companion object is an object that shares the same name as a class
// and is defined together in the same file as the class.
// Having a companion object for a class is a common pattern in Scala
// but there is also a feature from which they can benefit.
// Companion objects and classes are considered a single unit
// in terms of access controls,
// so they can access each other’s private and protected fields and methods.
// its like class and object stuff seperated

// class Multiplier(val x: Int) { def product(y: Int) = x * y }
// object Multiplier { def apply(x: Int) = new Multiplier(x) }
// val tripler = Multiplier(3)
// println(tripler.product(13))

// case classes: ?
// traits are like Javas interfaces, but a little richer
