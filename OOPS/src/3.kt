

//  every time init block will mandatory execute when the constrcutor is created just like non static block

class Automobile(val name: String, val tyres: Int, val maxSeating: Int)
{
    init {
        println("Init Block 1")
    }

    fun drive() {}

    init {
        println("Init Block 2")
    }

    fun applyBrakes() {}
}

fun main()
{
    val m = Automobile("honda",10,7)
    val n = Automobile("honda",10,7)
}