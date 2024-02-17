
//                                ABSTRACTION

// so here abstract measn method without any logic here we have fill the logic by overriding it
// if any class has abstract method that class should prefix with abstract keyword
// we cant create the object for abstract class so we must inherite that class and then override the
//   abstract method

// this concept was introduced so that user can give logic according to him

// by default all abstract method are open because they are made to override thats why

// sometimes class can be abstract withoout having any abstract method that is done because
//if developer doesn't want that anyone class make the object of that class

fun main()
{

    var mango = mango()
    mango.p5()

}

abstract  class fruit
{
    abstract  fun p5();
    abstract fun p6();
}

class mango : fruit()
{
    override fun p5()
    {
        println("overrided abstrct method")
    }

//    if we inherite any abstract class and if we dont override all the abstract method which have
//    in abstract class then it will give error so we have override all the abstract method from abstract class

     override fun p6()
    {
        println("second overriden method")
    }

}