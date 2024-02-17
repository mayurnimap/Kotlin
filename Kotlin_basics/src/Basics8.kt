
fun main()
{

//    in this we can store fun/method in variable
//    so whenever we called the variable method will gets executed..
//    this is only available in kotlin
    var z = ::p2
    println(z(10,20))

}

fun p2(a:Int,b:Int):Int
{
    return a+b;
}