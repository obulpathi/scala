# Expressions

The term expression indicates a unit of code that returns a value after it has been executed. One or more lines of code can be considered an expression if they are collected together using curly braces ( { and } ). This is known as an expression block.

Expressions provide a foundation for functional programming because they make it possible to return data instead of modifying existing data (such as a variable). This enables the use of immutable data, a key functional programming concept where new data is stored in new values instead of in existing variables. Functions, of course, can be used to return new data, but they are in a way just another type of expression.

When all of your code can be organized (or conceptualized) into a collection of one or more hierarchical expressions that return values using immutable data will be straight‐ forward. The return values of expressions will be passed to other expressions or stored into values. As you migrate from using variables, your functions and expressions will have fewer side effects. In other words, they will purely act on the input you give them without affecting any data other than their return value. This is one of the main goals and benefits of functional programming.

val amount = { val x = 5 * 20; x + 10 }

The last expression in the block, “x + 10,” determines the block’s return value. The “x” value, previously defined at the same level of “amount,” is now defined locally to the block. The code is now cleaner, because the intent of using “x” to define “amount” is now obvious.

val amount = {
    val x
    x = 5
    x = x * 20
    x + 2
}

Expression blocks are also nestable, with each level of expression block having its own scoped values and variables. Here is a short example demonstrating a three-deep nested expression block:

{ val a = 1; { val b = a * 2; { val c = b + 4; c } } }


Statements
A statement is just an expression that doesn’t return a value. Statements have a return type of Unit , the type that indicates the lack of a value. Some common statements used in Scala programming include calls to println() and value and variable definitions. For example, the following value definition is a statement because it doesn’t return anything:
scala> val x = 1
x: Int = 1
The REPL repeats the definition of x but there is not actual data returned that can be used to create a new value. A statement block, unlike an expression block, does not return a value. Because a statement block has no output, it is commonly used to modify existing data or make changes outside the scope of the application (e.g., writing to the console, updating a database, connecting to an external server).

#### If Expressions
if (<Boolean expression>) <expression> else <expression>

#### Match Expressions
Match expressions are akin to C’s and Java’s “switch” statements, where a single input item is evaluated and the first pattern that is “matched” is executed and its value re‐ turned. Like C’s and Java’s “switch” statements, Scala’s match expressions support a de‐ fault or wildcard “catch-all” pattern. Unlike them, only zero or one patterns can match; there is no “fall-through” from one pattern to the next one in line, nor is there a “break”
statement that would prevent this fall-through.
The traditional “switch” statement is limited to matching by value, but Scala’s match expressions are an amazingly flexible device that also enables matching such diverse items as types, regular expressions, numeric ranges, and data structure contents. Al‐ though many match expressions could be replaced with simple “if .. else if .. else” blocks, doing so would result in a loss of the concise syntax that match expressions offer.

<expression> match {
    case <pattern> => {code}
    case <pattern> => {code}
}
