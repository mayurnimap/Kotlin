
//MAP

// now here we will talk about the map.. this is used to convert the from one form to another form

fun main()
{
    val num = listOf(1,2,3,4,5)
    println(num)
    val result = num.map { it*it }
    println(result)


    val userList = listOf(
        User1(1,"mayur"),
        User1(2,"yash"),
        User1(3,"jay")
    )

    val paidUserlist = userList.map {
        PaidUser(it.id,it.name,"paid")

//        now here we have convert the list using map by creating the object of PaidUser class every time
    }

    println(paidUserlist)
}

data class User1(val id:Int,val name:String)
data class PaidUser(val id:Int, val name:String, val  type :String )


// Difference between map and filter

//Purpose: map is used to transform each element, while filter is used to select elements based on a condition.
//Output: map produces a collection of the same size as the input, whereas filter may produce a smaller collection depending on the filtering condition.
//Functionality: map applies a function to each element to produce a new value, while filter checks each element against a condition and includes only those that satisfy the condition.