
//  ?: Safe Call Operator (null safety operator)
//  ?.: Safe Call Operator (null safety operator)
//  !!.: Non-null Assertion Operator
//  ?:: Elvis Operator


fun main()
{

//    null safety operator
    var gender : String = "male"
    var gender2 : String? = "mayur"    // this allowed us to store null in the gender2
    var isAdult : Boolean? = null    // same


    if(gender2!=null)
    {
        println(gender2.toUpperCase())
    }


    println(gender2?.toUpperCase())

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }



//     below down is elvis operator
    var selectedValue  = gender2 ?: "take this"  // It's used for null-checking. It means "if gender2 is not null, use its value,
    // otherwise, use 'NA'." So, if gender2 is not null, selectedValue will be assigned the value of gender2.
    // If gender2 is null, selectedValue will be assigned the string "take this".






    var value = gender2!!.toUpperCase()   //non-null assertion operator


//    gender2!!: This part uses the non-null assertion operator (!!). It asserts that the variable gender2 is not null.
//    If gender2 is null, it will throw a NullPointerException. This operator is typically used when the developer is
//    sure that the value won't be null at this point in the code.



}



