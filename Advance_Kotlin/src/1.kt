

// OBJECT DECLARATION
// here we have declare directly object and use that instead of creating in the object in the class
// in object we cant create constrcutor because we are not creating the object here we are directly declaring it but  init block are allowed
// we can  do inheritance and implement in this
//object can have only one object means we cant have two references cause we are calling it with the object name


fun main()
{
    A.mayur()
    B.aarti()
}

object A {

    fun mayur()
    {
        println("mayur")
    }

    init {
        println("this is init block")
    }
//    whenever we called the method or variable of objct automatically init block will exceute
}

object B {

    fun aarti()
    {
        println("aarti")
    }
}