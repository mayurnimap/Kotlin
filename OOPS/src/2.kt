
class person(val name: String,var age:Int)
{
    fun canVote():Boolean  // return value boolean
    {
        return age>18  // check if the age is greater than 18
    }
}

fun main()
{
    var m = person("mayur",15) // created the object of class person and pass the argument
    println(m.canVote())

    var n = person("yash",20)
    println(n.canVote())

    n.age = 15  // here we have change the age so the output will come false
    println(n.canVote())

}

