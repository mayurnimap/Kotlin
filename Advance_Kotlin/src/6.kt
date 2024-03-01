//  Sealed class


// it is a abstract class so we can't create the object of it
// in the below programme we have created the sealed class and inside that sealed class we have two classes red and black
// and in the main function we have set the conditon that if object is made of red then multiply the points by 2 and
// if the object is made of black then multiply the points by 4 so thats the use of sealed class we can have multiple classs in that
// and we can use according to user needs

// points to remember

// -  we cant inherit sealed class if we do then it will give compile error
//A "sealed class" in programming is like a locked box. It's a special kind of class that doesn't allow other classes to inherit from it.
// In other words, you can't create new classes based on it.

//  It's useful when you want to prevent others from modifying or extending certain parts of your code,
//      ensuring that the class hierarchy remains exactly as you designed it.
 fun main()
{
     val tile : Tile = Red("hello",20)
    val points = when(tile){
        is Red -> tile.points * 2
        is black -> tile.points * 4
    }

    println(points)

 }









sealed class Tile

class Red(val type:String,val points: Int) : Tile()
class black(val points : Int) : Tile()



