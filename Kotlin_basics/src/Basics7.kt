
//method overloading

fun main()
{
    println(p1(10,20))
    println( p1(10.0,20.0))
}

fun p1(a: Int,b: Int):Int
{
    return a+b;
}


fun p1(a:Double,b:Double):Double
{
    return a+b;
}