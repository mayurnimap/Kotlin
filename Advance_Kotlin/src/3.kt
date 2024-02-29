


fun main()
{

//    here we have made the var obj and later we have created the object class without any name because we are goin to use
//    only one time and inherited the person class in it by providing the name
    var obj = object :Person("cheezycode")
    {
        override fun fullname() {
            super.fullname()
            println("annoymous - $name")
        }
    }

    obj.fullname()
}



interface Cloneable{
    fun clone()
}

open class Person(val name:String)
{
    open fun fullname() = println("full name - $name")
}