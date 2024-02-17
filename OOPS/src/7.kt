fun main(){

    var child = Child()
    child.p1()
    child.p2()

//    here also just like java whenever we create the object first super class will load
//    then subclass and just like java init block will excute automatically whener we create
//    the object

}

open class Parent{

//    open is mandtaory to write when we want that this class in heritable by anyone

    init {
        println("parents constrcutor is called")
    }

    fun p1()
    {
        println("parent class is here")
    }

}

class Child : Parent()
{
//    we inherit it using :(colon) symbol
//    one child class can only have one parent class
    fun p2()
    {
        println("child class is here")
    }

    init {
        println("child constrcutor is called")
    }
}