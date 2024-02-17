
// in this it is explain that if there are some common attributes such as every car has 4 tyres
// and 4 seats then we can set default 4 to it using this keyword and then even if we dont passed any value to constrcutor
//while creating it it will not give me error


fun main() {
    var car = Brands("Car", 10, 4)
    var car2 = Brands("Car2")

    println(car.tyres)
    println(car2.tyres)
}

class Brands(val name: String, val tyres: Int, val maxSeating: Int)
{
    constructor(nameParam: String): this(nameParam, 4, 4)
}




//                     when we want to intialize the properties inside the class

// Parameters are passed to initialize properties inside class
//class Automobile(nameParam: String, tyresParam: Int)
//{
//    val name: String = nameParam
//    val tyres: Int = tyresParam
//}