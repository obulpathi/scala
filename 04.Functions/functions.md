In Scala, functions are named, reusable expressions. They may be parameterized and they may return a value, but neither of these features are required. These features are, however, useful for ensuring maximum reusability and composability.

Pure function
• Has one or more input parameters
• Performs calculations using only the input parameters
• Returns a value
• Always returns the same value for the same input
• Does not use or affect any data outside the function
• Is not affected by any data outside the function

def <identifier> = <expression>
At its most basic, a Scala function is a named wrapper for an expression.

def <identifier>(<identifier>: <type>[, ... ]): <type> = <expression>

Syntax: Invoking a Function with an Expression Block
<function identifier> <expression block>
One example where using an expression block to invoke a function may be preferable is when you have to send a calculated value to the function. Instead of calculating the amount and storing it in local values to be passed to the function, you can do the calculations inside the expression block. The expression block will be evaluated before the function is called and the block’s return value will be used as the function argument.
