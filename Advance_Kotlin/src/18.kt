
//EXTENSION IN KOTLIN

// An extension function in Kotlin allows you to add new functionality to existing classes,
// even if you don't have access to their source code
// in simple words we can add methods and variable in the class which are already present or exist
// Extensions can't access private members of the class they're extending; they only have access to the public API.
// key difference between extension and inheritance is that in https://chat.openai.com/c/dac9c6e7-323f-44d1-a871-6ff2d0d6d64a


// SYNTAX = using (.)




fun main()
{

    println("hello mayur".Xyz())

}

fun String.Xyz():String
{
    return "----------------\n $this \n--------------------"
}

// this means current object so first -- will print then /n means leave one line then hello mayur then again ---