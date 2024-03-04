
//LIST  FILTER

// NOTE :  the return type of filter function is boolean

fun main()
{
    val a = listOf(1,2,3,4,5)
    val b = a.filter({a:Int -> a%2!=0})

//   here using filter we are taking every number from the list and using lambada function we are checking that if the number are odd or not

    println(b)

//   we can also used the it keyword here instead of a  then it will work like

    val c = a.filter ({ it % 2!=0  })
    println(c)


//  SECOND EXAMPLE
     val userList = listOf(
         User(1,"mayur"),
         User(2,"yash"),
         User(3,"jay")
         )

    println(userList.filter { it.id==2 })

//    this will give the output where id==2 and here also we have used the (it) keyword



}


data class User(val id:Int,val name:String)