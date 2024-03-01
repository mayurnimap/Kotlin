
// COLLECTION
// so there are two types of array that is mutable and unmutable
// mutable means it can be change and unmutable means it cant be changed
//so first we will look for unmutable

fun main()
{

    var a = listOf(1,2,3,4,"hello","mayur")

    println(a.indexOf("hello"))    // this are methods
    println(a.contains("mayur"))   // this are methods

    // now here we cant do any changes like we cant change value from 2=3 or mayur=kene or remove anything
    // with the method


    //mutable

    var b = mutableListOf(1,2,3,"byy","gn")

    b[2]=10  // here we have change 3 to 10 with the help of index

    b.add("over") // here we have over string in the arrya

    println(b)

    b.removeAt(3) // here we have remove the element from index 3

    b.addAll(a) // here we have added all the elements from a to b

    println(b)

//    just like this there are many methods which we can used with mutable list from the collection




}
