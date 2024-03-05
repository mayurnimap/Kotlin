
// INNER CLASS , OUTER CLASS AND NESTED CLASS

fun main()
{
    val obj = Outer()

    println( obj.i)


    val nested = Outer.Nested()
    nested.test()   // this can be only possible when we dont prefix it with inner keyword

//    val nested2 = Outer.Nested2()  // this will give u error

    val nested2 = Outer().Nested2()  // when we want to acces the inner class functions and properties
    nested2.test1()
}








class Outer{

    var i = 0

    class Nested {

        fun test()
        {
//            println(i)     // this will give error becuase this is nested class .. nested class cant access the variable and object
//            whic are declared in the outer class for that we have to prefixe our nested class with inner keyword
        }

    }

    inner class Nested2{  // with the help of inner keyword inner class  can use the variable and function of outer class

        fun test1()
        {
            println(i) // this will work because we have prefix the class with inner keyword
        }
    }
}