

class car(val name: String, val type : String, var km: Int)
{
    fun drivecar()
    {
            println("$name car is driving")
    }

    fun applybrakes()
    {
        println("brak is applied")

    }
}

fun main()
{
    val mustang = car("mustang","ford",1000)

    val virtus = car("virtus","volks",500)

    println(mustang.km)

    virtus.applybrakes()
    mustang.drivecar()


}