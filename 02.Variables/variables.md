# Variables

#### A literal
A literal data is data that appears directly in the source code, like the
number 5, the character A, and the text “Hello, World.”

#### Value
A value is an immutable, typed storage unit. A value can be assigned data when it is defined, but can never be reassigned.

#### Variable
A variable is a mutable, typed storage unit. A variable can be assigned data when it is defined and can also be reassigned data at any time.

#### Type
A type is the kind of data you are working with, a definition or classification of data. All data in Scala corresponds to a specific type, and all Scala types are defined as classes with methods that operate on the data.

Scala has both numeric (e.g., Int and Double ) and nonnumeric types (e.g., String ) that can be used to define values and variables. These core types are the building blocks for all other types including objects and collections, and are themselves objects that have methods and operators that act on their data.
Unlike Java and C there is no concept of a primitive type in Scala. While the Java Virtual Machine supports the primitive integer type int and the integer class Integer, Scala only supports its own integer class, Int .

##### Hirerchy of Types
Any <- {AnyVal, AnyRef}

AnyVal <- {Byte, Int, Float, Double, Char, Bool}

AnyRef <- {String, Classes, Collections}

#### Automatic Garbage Collection
The data stored in values and variables in Scala will get automatically deallocated by the Java Virtual Machine’s garbage collection when they are no longer used. There is no ability, or need, to deallocate them manually.
