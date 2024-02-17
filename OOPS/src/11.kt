fun main()
{
    val shape1 = Shape()


    var square2 = Square2(2.0,3.0)
    printArea(square2)
}
fun printArea(shape1: Shape1)  // in this method we have passed the Shape1 class with variable shape1
{
    println(shape1.area())
}

open class Shape1{
    open fun area() :Double{
        return 0.0
    }

}

class Circle1(val radius:Double) : Shape1()
{
    override fun area() : Double
    {
         return Math.PI*radius*radius
    }

}

class Square2(val base:Double,val height:Double) :Shape1()
{
    override fun area() : Double
    {
        return 0.5*base*height
    }
}