

// we can have muitiple object inside the class

//here we will studi about the companion object
//one class have only one companion object
//with the help of companion object we can directyl called the method with the class
//but in the class only one companion object are allowed and it is mostly used in the room database
// uses cases of it are like in kotlin we dont have static method so companion boject methods can be directly call with the class name
// another useful feature of it that we dont have to create the instance of the class we can directly call with the class name



fun main()
{
    Myclass.obj1.f()
    Myclass.obj2.g()

//    now upto here we have to called it like myclass then obj1 then method

    Myclass.f()


}
class Myclass{

     companion object obj1{
        fun f()
        {
            println("hello i am from object")
        }
    }

    object obj2{
        fun g()
        {
            println("hello i am sub-object")
        }
    }
}