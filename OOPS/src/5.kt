import kotlin.time.times

fun main()
{

    var calculator = Calculator()
    println(calculator.add(10,20))
    println(calculator.multiply(10,10))

}

class Calculator{

    fun add( a : Int,  b : Int):Int
    {

        return a+b

    }

    fun multiply (a : Int, b: Int):Double
    {
          return (a*b).toDouble()

    }
}