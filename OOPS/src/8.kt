
//                                                    OVERRDING CONCEPT
fun main()
{

    var animal = Animal()
    animal.one()
    println(animal.name)
    animal.three()

}

 open class Cat
{

//    so here if we want that this class method can be overriden by anyone who inhrit it then
//    we should write prefix it with open keyword just like we do in class then only it is possible
//    otherwise it will give error
    open fun one() = println("one")
    fun two() = println("two")
    open fun three() = println("three")

    open val name : String = "mayur"

}

class Animal : Cat()
{
//    while overrriding any method it is compulsory to write the override before that
    override fun one() = println("child one")

//    override  fun two() = println("two")    //CTC error because we have not prefix the two method with open

    override val name : String = "kene"

//    if we want to acces the parent class method as well as parents child class overriden same method then we should
//    use super calling statement

    override fun three() {
        super.three()
        println("three super")
    }


}


