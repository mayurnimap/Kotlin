
// LAMBADA FUNCTION

// the main defination of lambada is the function which doesn't have any name


fun main()
{

    // EXAMPLE ONE

    var a = { x:Int , y:Int -> x+y} // in this we have variable a and here we have started with curly bracket ie {} which tell kotlin that it is in lambada whatever
    // body we want to set we should set it after (->) this representation and one more thing whatever the last line will be that will be the return type of our lambaa function
    // such as if we are returning "mayur" in the last then out return type will be string and that is done implicitely and we can also do explicitely as well
    // lambada is nothing but the simple function

    println( a(10,20))



    // EXAMPLE TWO
    var b = {a:String ->
        println(a)
    }

    b("mayur")

    //EXAMPLE THREE

    var c = { ->
        var sum = 5+5
        println(sum)
        "kene"

        //now here we have println the sum of 5+5 but in the last line we have return the string so return type of this will be string

    }

    c() // now here only sum will print but we hav pass this in println then sum as well as kene will be print

    println(c())

    // EXAMPLE 4 WHERE WE ARE DECLARING THE RETURN TYPE EXPLICITELY

    // first int is the type of data we r taking and second int is the data type we are returning

    var d : (Int)->Int = {
        x -> x*x }

    println(d(5))




    // this is the second way where we are using (it) variable and this variable can only be used when we are having only one parameter in the function
    var e : (Int)->Int ={
        it*it
    }

    println(e(10))

}