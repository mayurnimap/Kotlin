// Generic classes
// In Kotlin, generic classes are classes that can work with any data type. They allow you to create classes, functions, and interfaces that operate on any type rather than a specific one.
// This enhances code reusability and type safety.



fun main()
{
    val container1 = Container <Int> (4)
    println( container1.come())

    val container2 = Container <String> ("mayur")
    println( container2.come())

    val container3 = Container <Double> (4.0)

    val container4 = Container <Boolean> (false)



    // we can take any data type if we creatd the class as generic
}




class Container <T> (var data : T)   // this is generic class where we can take any data type whenever we create the object
{
    fun go(value:T)
    {
        data = value
    }

    fun come() : T{
        return data
    }

}