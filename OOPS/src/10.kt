//                                       POLYMORPHISM


fun main() {

//    here simply we have given the datatype Shape and then created object using different class
//    in short we have done upcasting here and elemen of object creation class will be executed
    val circle : Shape = Circle(4.0)
    val square : Shape = Square1(4.0)

//    here we can see the one method (state) have different behavious that is knows as polymorphism
    val result1=circle.area()
    val result2=square.area()

    println(result1)
    println(result2)


}

open class Shape{
    open fun area() :Double{
        return 0.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square1(val side: Double) : Shape(){
    override fun area(): Double {
        return side * side
    }
}




