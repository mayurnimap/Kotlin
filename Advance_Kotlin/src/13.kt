

// in kotlin we can stored function in variable and we can call that function
// important thing is like if we have to stored in a variable then stored it in a and then : is compulsory


// Advantages of generic:

//Type casting is evitable- No need to typecast the object.
//Type safety- Generic allows only a single type of object at a time.
//Compile time safety- Generics code is checked at compile time for the parameterized type so that it avoids run-time error.

fun main()
{

    var a : (a:Double,b:Double) -> Double = ::sum  // var a : instead of var a =
                                                   // and insted of return we should used ->

    println(a(10.0,20.0))



    calculator(100.0,200.0, ::sum) // this is called higher order function for better understading just look at the tracking
//  here in calculator method we have passed two double value and then as we know further calculator parameter as same as sum method then we have directly passed the same



}


fun sum(a:Double, b:Double):Double
{
    return a+b;

}

fun calculator(a:Double,b:Double,gn:(Double,Double) -> Double)
{
    val result = gn(a,b)
    println(result)

}




