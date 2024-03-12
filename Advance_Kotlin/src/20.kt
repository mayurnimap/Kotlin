


//                                              SCOPE FUNCTIONS


// APPLY FUNCTION
// LET FUNCTION
// WITH FUNCTION
// RUN FUNCTION 
// return value of apply function is object

//https://chat.openai.com/c/62142156-8382-4953-8411-b2764f4fe324


fun main()
{

    val ref1 = P4()  //created the object
    ref1.a = "mayur" //assign the name
    ref1.b = 20   // assign the age


     // apply: Use it when you're setting up the initial configuration of an object during its creation.
    // now evertime if we want to change the value we have use it reference so for that we have apply function
    // using apply we can directly change the properties which using ref or this

    ref1.apply {
        a="nimap"
        b=30
    }
    println(ref1)


    //======================================================================================


//    let: Use it when you want to do something with a value only if it's not null.

    ref1.let {
        println(it.a)
        println(it.b)
    }

//    if we are not returning anything in the let then by default it is returning the Unit .. if we type 2 then return type will int
//    if we type mayur in the last line then the return type will be the string

    //=====================================================================================

//    Use it when you want to focus on working with properties and methods of a single object without repeating its name.

    with(ref1)
    {
        a = "mayur"
        b = 99
    }

    //========================================================================================

//    Use it when you want to perform operations on an object and possibly return a value.
//    It's like a temporary playground for your object.

//    ref1.run
//    {
//        a = "byyy"
//        b = 101
//    }
    
}




data class P4(var a:String = "",var b:Int=18)
